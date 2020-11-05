package co.com.example.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {

    public static  final  Target  ICONO_LOGIN = Target.the("realizar compra").located(By.cssSelector("a[id='hrefUserIcon']"));


}
