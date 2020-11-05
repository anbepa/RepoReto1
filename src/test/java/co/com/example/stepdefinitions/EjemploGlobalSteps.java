package co.com.example.stepdefinitions;

import co.com.example.tasks.BuscarProducto;
import co.com.example.tasks.LlenarFormularioResgistro;
import co.com.example.tasks.SeleccionarProducto;
import co.com.example.userinterfaces.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class EjemploGlobalSteps {



    private HomePage homepage  = new HomePage();

    @Given("^el el cliente  (.*)busca la compra$")
    public void elElClienteBuscaLaCompra(String nombreActor) {

        theActorCalled(nombreActor).wasAbleTo(Open.browserOn(homepage));
        getDriver().manage().window().maximize();

    }

    @When("^ingresa  el nombre (.*) al carro$")
    public void ingresaElNombreAlCarro(String descripcion) {

        theActorInTheSpotlight().wasAbleTo(
                BuscarProducto.condescripcion(),
                SeleccionarProducto.crearCuenta(),
                LlenarFormularioResgistro.conCampos()
        );

    }

    @Then("^se visualizara un mensaje de logeo$")
    public void seVisualizaraUnMensajeDeLogeo() {



    }

}
