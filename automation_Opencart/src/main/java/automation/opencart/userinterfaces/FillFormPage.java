package automation.opencart.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillFormPage {
    public static  final Target CATALOG=Target.the("click on catalog").locatedBy("//a[@href='#collapse1']");
    public static  final Target PRODUCTS=Target.the("click on products").located(By.xpath("//ul[@id='collapse1']//a[.='Products']"));
    public static  final Target BUTTON_ADD_NEW=Target.the("click on button add new").located(By.xpath("//div[@class='pull-right']//a"));
    public static  final Target PRODUC_NAME=Target.the("type product name").located(By.xpath("//input[@id='input-name1']"));
    public static  final Target DESCRIPTION=Target.the("product description").located(By.xpath("//div[@class='note-editable panel-body']"));
    public static  final Target META_TT=Target.the("Enter Meta Tag Title").located(By.xpath("//input[@id='input-meta-title1']"));
    public static  final Target META_TD=Target.the("Enter Meta Tag Description").located(By.xpath("//textarea[@id='input-meta-description1']"));
    public static  final Target META_TK=Target.the("Enter Meta Tag Keywords").located(By.xpath("//textarea[@id='input-meta-keyword1']"));
    public static  final Target PRODUCT_TAGS=Target.the("Enter Product Tags").located(By.xpath("//input[@name='product_description[1][tag]']"));
    public static  final Target BUTTON_SAVE=Target.the("Save Record").located(By.xpath("//div[@class='pull-right']//button"));
    public static  final Target ALERT_MESSAGE=Target.the("Error message").located(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));




}
