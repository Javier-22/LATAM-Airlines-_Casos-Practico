package automation.opencart.tasks;

import automation.opencart.models.DataModelFilter;
import automation.opencart.utilis.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static automation.opencart.userinterfaces.FilterFormPage.*;

public class FilterProducts implements Task {
    private List<DataModelFilter> filter;
    public FilterProducts (List<DataModelFilter>filter){this.filter=filter;}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(filter.get(0).getStrProduct_Name()).into(NAME_PRODUCT),
                Enter.theValue(filter.get(0).getStrModel()).into(MODEL),
                Enter.theValue(filter.get(0).getStrPrice()).into(PRICE),
                Click.on(BUTTON_FILTER)


        );
        Wait.Time(5000);

    }
    public static FilterProducts Filter(List<DataModelFilter>filter){return Tasks.instrumented(FilterProducts.class, filter);}
}
