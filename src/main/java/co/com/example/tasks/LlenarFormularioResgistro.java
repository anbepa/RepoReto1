package co.com.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.example.userinterfaces.DetalleFormulario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarFormularioResgistro implements Task {

   public  LlenarFormularioResgistro (){

   }

    public static Performable conCampos() {
        return  instrumented(LlenarFormularioResgistro.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Enter.theValue("anbepa").into(INPUT_USER),
               Enter.theValue("andro11anto@gmail.com").into(INPUT_EMAIL),
               Enter.theValue("Tata2020*").into(INPUT_PASS),
               Enter.theValue("Tata2020*").into(INPUT_CON_PASS),
               //--DetallesPersona--//
               Enter.theValue("andres").into(FIRST_NAME),
               Enter.theValue("bernal").into(LAST_NAME),
               Enter.theValue("3013633400*").into(PHONE),
               SelectFromOptions.byVisibleText("Albania").from(SELECT_COUNTRY),
               Enter.theValue("medellin").into(CITY),
               Enter.theValue("calle10  #222").into(ADRESS),
               Enter.theValue("magdalena").into(STADE),
               Enter.theValue("38383*").into(POSTAL),
               Click.on(I_AGRRE),
               Click.on(BTN_RES)


       );
    }
}
