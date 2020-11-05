package co.com.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleFormulario {

    public static  final Target  INPUT_USER=  Target.the("USER").located(By.cssSelector("input[name='usernameRegisterPage']"));
    public static  final Target INPUT_EMAIL =  Target.the("EMAIL").located(By.cssSelector("input[name='emailRegisterPage']"));
    public static  final Target INPUT_PASS =  Target.the("PASS").located(By.cssSelector("input[name='passwordRegisterPage']"));
    public static  final Target INPUT_CON_PASS =  Target.the("CONPASS").located(By.cssSelector("input[name='confirm_passwordRegisterPage']"));
   ///
   public static  final Target FIRST_NAME =  Target.the("CONPASS").located(By.cssSelector("input[name='first_nameRegisterPage']"));
   public static  final Target LAST_NAME =  Target.the("CONPASS").located(By.cssSelector("input[name='last_nameRegisterPage']"));
   public static  final Target PHONE =  Target.the("CONPASS").located(By.cssSelector("input[name='phone_numberRegisterPage']"));
   public static  final Target SELECT_COUNTRY =  Target.the("CONPASS").located(By.cssSelector("select[name='countryListboxRegisterPage']"));
   public static  final Target CITY =  Target.the("CONPASS").located(By.cssSelector("input[name='cityRegisterPage']"));
   public static  final Target ADRESS =  Target.the("CONPASS").located(By.cssSelector("input[name='addressRegisterPage']"));
   public static  final Target STADE =  Target.the("CONPASS").located(By.cssSelector("input[name='state_/_province_/_regionRegisterPage']"));
   public static  final Target POSTAL =  Target.the("CONPASS").located(By.cssSelector("input[name='postal_codeRegisterPage']"));
   public static  final Target I_AGRRE =  Target.the("CONPASS").located(By.cssSelector("input[name='i_agree']"));
   public static  final Target BTN_RES =  Target.the("CONPASS").located(By.cssSelector("button[id='register_btnundefined']"));

}
