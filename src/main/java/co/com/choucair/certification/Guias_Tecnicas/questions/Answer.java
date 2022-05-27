package co.com.choucair.certification.Guias_Tecnicas.questions;

import co.com.choucair.certification.Guias_Tecnicas.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.net.HttpURLConnection;

public class Answer implements Question <Boolean> {
    public Answer(String question) {
        this.question = question;
    }

    private String question;
    public static Answer ToThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if(question.equals((nameCourse))){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
