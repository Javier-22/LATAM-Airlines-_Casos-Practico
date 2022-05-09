package automation.opencart.stepdefinitions;

import automation.opencart.models.DataModelFilter;
import automation.opencart.questions.WarningMessage;
import automation.opencart.tasks.EditProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditProductStepDefinition {
    @Before
    public void sedStage(){
        OnStage.setTheStage(new OnlineCast());}

    @When("^we filter the product to edit$")
    public void weFilterTheProductToEdit(List<DataModelFilter>dataModelFilters) {
        theActorInTheSpotlight().attemptsTo(EditProduct.andSave(dataModelFilters));

    }

    @Then("^verify that the following error message appears (.*)$")
    public void verifyThatTheFollowingErrorMessageAppearsWarningYouDoNotHavePermissionToModifyProducts(String question) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(WarningMessage.fails(question)));
    }
}
