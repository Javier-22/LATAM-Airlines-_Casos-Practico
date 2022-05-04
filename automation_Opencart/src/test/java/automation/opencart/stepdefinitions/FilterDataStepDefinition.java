package automation.opencart.stepdefinitions;

import automation.opencart.models.DataModelFilter;
import automation.opencart.questions.ConfirmSearch;
import automation.opencart.tasks.FilterProducts;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FilterDataStepDefinition {
    @Before
    public void sedStage(){
        OnStage.setTheStage(new OnlineCast());}
    @And("^fill the data to filter$")
    public void fillTheDataToFilter(List<DataModelFilter>dataModelFilters) {
        theActorInTheSpotlight().attemptsTo(FilterProducts.Filter(dataModelFilters));
    }

    @Then("^the user should be able to click the box in the first column of the table$")
    public void theUserShouldBeAbleToClickTheBoxInTheFirstColumnOfTheTable() {
        theActorInTheSpotlight().should(seeThat(ConfirmSearch.isClickeable()));
    }
}
