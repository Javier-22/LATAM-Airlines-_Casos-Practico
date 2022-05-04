package automation.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FilterFormPage {
    public static  final Target NAME_PRODUCT=Target.the("enter the name of the product to filter").located(By.xpath("//input[@id='input-name']"));
    public static  final Target MODEL=Target.the("enter model ").located(By.xpath("//input[@id='input-model']"));
    public static  final Target PRICE=Target.the("enter price to filter").located(By.xpath("//input[@id='input-price']"));
    public static  final Target BUTTON_FILTER=Target.the(" Click button filter").located(By.xpath("//button[@id='button-filter']"));
    public static final  Target CONFIRMATION=Target.the("Button confirmation").located(By.xpath("//table[@class='table table-bordered table-hover']//tbody//input"));


}
