package automation.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditProductPage {
    public static  final Target BUTTON_EDIT=Target.the(" Button   edit product").located(By.xpath("//table[@class='table table-bordered table-hover']//tbody//a"));
}
