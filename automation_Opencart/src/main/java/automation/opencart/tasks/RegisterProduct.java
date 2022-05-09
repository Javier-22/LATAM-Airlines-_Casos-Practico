package automation.opencart.tasks;

import automation.opencart.models.DataModelRegisterProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static automation.opencart.userinterfaces.FillFormPage.*;

public class RegisterProduct implements Task {

    private List<DataModelRegisterProduct>date;
    public RegisterProduct (List<DataModelRegisterProduct>date){this.date=date;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_ADD_NEW),
                Enter.theValue(date.get(0).getStrProducName()).into(PRODUC_NAME),
                Enter.theValue(date.get(0).getStrDescription()).into(DESCRIPTION),
                Enter.theValue(date.get(0).getStrMetaTagTitle()).into(META_TT),
                Enter.theValue(date.get(0).getStrMetaTagDescription()).into(META_TD),
                Enter.theValue(date.get(0).getStrMetaTagKeywords()).into(META_TK),
                Enter.theValue(date.get(0).getStrProductTags()).into(PRODUCT_TAGS),
                Click.on(BUTTON_SAVE)

        );


    }

    public static RegisterProduct intoForm(List<DataModelRegisterProduct> date){return Tasks.instrumented(RegisterProduct.class, date);}
}
