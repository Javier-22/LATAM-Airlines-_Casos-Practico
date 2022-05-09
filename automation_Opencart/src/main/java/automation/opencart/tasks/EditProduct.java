package automation.opencart.tasks;

import automation.opencart.models.DataModelFilter;
import automation.opencart.utilis.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static automation.opencart.userinterfaces.EditProductPage.*;
import static automation.opencart.userinterfaces.FillFormPage.*;
import static automation.opencart.userinterfaces.FilterFormPage.*;



public class EditProduct implements Task {
    private List<DataModelFilter> filt;
    public EditProduct (List<DataModelFilter>filt){this.filt=filt;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(filt.get(0).getStrProduct_Name()).into(NAME_PRODUCT),
                Click.on(BUTTON_FILTER),
                Click.on(BUTTON_EDIT),
                Enter.theValue("").into(DESCRIPTION),
                Click.on(BUTTON_SAVE)


        );
        Wait.Time(5000);

    }
    public static EditProduct andSave(List<DataModelFilter> filt){return Tasks.instrumented(EditProduct.class, filt);}
}
