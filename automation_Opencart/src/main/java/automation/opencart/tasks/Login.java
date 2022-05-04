package automation.opencart.tasks;

import automation.opencart.models.DataModelCredentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;


import static automation.opencart.userinterfaces.FillFormPage.*;
import static automation.opencart.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {
    private List<DataModelCredentials> credential;

    public Login(List<DataModelCredentials> credential) {
        this.credential = credential;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credential.get(0).getStrUserName()).into(USERNAME),
                Enter.theValue(credential.get(0).getStrpassword()).into(PASSWORD),
                Click.on(ACCESSBUTTON),
                WaitUntil.the(CATALOG,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(CATALOG),
                Click.on(PRODUCTS)
        );

    }
    public static Login Credentials(List<DataModelCredentials> credential) {return Tasks.instrumented(Login.class, credential);}
}

