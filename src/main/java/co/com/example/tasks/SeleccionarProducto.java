package co.com.example.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.WebElementLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.example.userinterfaces.DetalleProducto.BTN_CREATE_ACCOUNT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SeleccionarProducto  implements Task {

    private Object WebElementFacade;

    public SeleccionarProducto(){

    }

    public static Performable crearCuenta() {
        return  instrumented(SeleccionarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CREATE_ACCOUNT)
        );
    }
}
