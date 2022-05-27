package co.com.choucair.certification.Guias_Tecnicas.tasks;

import co.com.choucair.certification.Guias_Tecnicas.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
/*
    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }
*/
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }
/*
    public static Login onThePage(String strUser, String strPassword) {

        return Tasks.instrumented(Login.class,strUser,strPassword);
    }
*/
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(//Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                //Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
                //Enter.theValue(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
                //Click.on(ChoucairLoginPage.ENTER_BUTTON)
                //Click.on(ChoucairLoginPage.PRUEBA_Button),
                Enter.theValue("Maiz con arroz").into(ChoucairLoginPage.Prueba),
                Click.on(ChoucairLoginPage.Prueba1)
                );
    }
}
