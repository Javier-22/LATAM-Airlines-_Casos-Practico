package automation.opencart.questions;
import automation.opencart.userinterfaces.FillFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class WarningMessage implements Question<Boolean>{
    private String question;

    public WarningMessage(String question) {this.question = question;}

    public static WarningMessage fails(String question){return new WarningMessage(question);}

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean res;
        String text =(FillFormPage.ALERT_MESSAGE.resolveFor(actor).getText());
        if (text.contains(question)) {
            res = true;
        }else{
            res = false;
        }
        return res;
    }

}




