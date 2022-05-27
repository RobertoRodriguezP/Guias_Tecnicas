package co.com.choucair.certification.Guias_Tecnicas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.id("yui_3_17_2_1_1653660162224_14"));
    public static final Target INPUT_USER = Target.the("Where do we write the user").located(By.id("username"));//xpath("//*[@id=\"username\"]"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").located(By.id("password"));//xpath("//*[@id=\"password\"]"));
    public static final Target Prueba = Target.the("Where do we write the password").located(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
    public static final Target Prueba1 = Target.the("Where do we write the password").located(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));

    public static final Target ENTER_BUTTON = Target.the("Button to confirm login").located(By.xpath("//*[@id=\"Ingresar\"]/div/div/div[2]/div[2]/form/div[3]/button"));

}
