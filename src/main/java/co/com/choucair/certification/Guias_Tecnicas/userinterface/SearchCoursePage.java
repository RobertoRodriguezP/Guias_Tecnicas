package co.com.choucair.certification.Guias_Tecnicas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target. the("Selecciona los cursos").located(By.id("yui_3_17_2_1_1653658294939_182"));//xpath("//*[@id=\"yui_3_17_2_1_1653658294939_182\"]"));
    public static final Target INPUT_COURSE = Target. the("Escribe cual es el curso").located(By.id("coursesearchbox"));//.xpath("//*[@id=\"coursesearchbox\"]"));
    public static final Target BUTTON_GO = Target. the("Iniciar la busqueda").located(By.id("yui_3_17_2_1_1653658374939_20"));//.xpath("//*[@id=\"yui_3_17_2_1_1653658374939_20\"]/button"));
    public static final Target SELECT_COURSE = Target. the("Seleccionar el resultado de la busqueda").located(By.id("yui_3_17_2_1_1653658767109_283"));//xpath("//*[@id=\"yui_3_17_2_1_1653658767109_283\"]"));
    public static final Target NAME_COURSE = Target. the("Extrae el nombre del curso").located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div/div[1]/h3/a"));


}
