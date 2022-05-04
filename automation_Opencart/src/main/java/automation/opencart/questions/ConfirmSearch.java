package automation.opencart.questions;

import automation.opencart.userinterfaces.FilterFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmSearch implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resp;
        if (FilterFormPage.CONFIRMATION.resolveFor(actor).isClickable()) {
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }

    public static ConfirmSearch isClickeable() { return new ConfirmSearch();
    }
}
