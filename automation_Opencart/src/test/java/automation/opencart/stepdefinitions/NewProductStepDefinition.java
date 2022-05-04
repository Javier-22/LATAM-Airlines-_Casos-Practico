package automation.opencart.stepdefinitions;

import automation.opencart.models.DataModelCredentials;
import automation.opencart.models.DataModelRegisterProduct;
import automation.opencart.questions.WarningMessage;
import automation.opencart.tasks.Login;
import automation.opencart.tasks.OpenUp;
import automation.opencart.tasks.RegisterProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NewProductStepDefinition {
    @Before
    public void sedStage(){
        OnStage.setTheStage(new OnlineCast());}
    @Given("^that the user wants to enter the Open Car page$")
    public void thatTheUserWantsToEnterTheOpenCarPage() {
        theActorCalled("user").wasAbleTo(OpenUp.theUrl());
    }

    @When("^the user enters the credentials to enter the system$")
    public void theUserEntersTheCredentialsToEnterTheSystem(List<DataModelCredentials>dataModelCredentials) {
        theActorInTheSpotlight().attemptsTo(Login.Credentials(dataModelCredentials));
    }
    @And("^register a product$")
    public void registerAProduct(List<DataModelRegisterProduct>dataModelRegisterProducts) {
        theActorInTheSpotlight().attemptsTo(RegisterProduct.Date(dataModelRegisterProducts));
    }

    @Then("^verify that the following error appears (.*)$")
    public void verifyThatTheFollowingErrorAppearsWarningYouDoNotHavePermissionToModifyProducts(String question) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(WarningMessage.fails(question)));

    }
}
