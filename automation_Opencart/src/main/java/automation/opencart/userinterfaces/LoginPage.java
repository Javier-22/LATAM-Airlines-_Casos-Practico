package automation.opencart.userinterfaces;



import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static  final Target USERNAME=Target.the("Enter the username").locatedBy("//input[@id='input-username']");
    public static  final Target PASSWORD=Target.the("Enter the password").locatedBy("//input[@id='input-password']");
    public static  final Target ACCESSBUTTON=Target.the("Click on the button to access the platform").locatedBy("//button[@class='btn btn-primary']");
}
