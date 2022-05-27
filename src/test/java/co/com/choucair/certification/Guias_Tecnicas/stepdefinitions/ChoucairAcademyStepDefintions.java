package co.com.choucair.certification.Guias_Tecnicas.stepdefinitions;

import co.com.choucair.certification.Guias_Tecnicas.model.AcademyChoucairData;
import co.com.choucair.certification.Guias_Tecnicas.questions.Answer;
import co.com.choucair.certification.Guias_Tecnicas.tasks.Login;
import co.com.choucair.certification.Guias_Tecnicas.tasks.OpenUp;
import co.com.choucair.certification.Guias_Tecnicas.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.requirements.SearchForFilesOfType;

import java.util.List;

public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage (){OnStage.setTheStage(new OnlineCast());}
/*
    @Given("^than brando wants to learn automation at the academy Choucair$")
    public void thanBrandoWantsToLearnAutomationAtTheAcademyChoucair(){
         OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));// );
    }
    */
    @Given("^than brando wants to learn automation at the academy Choucair$")
    public void thanBrandoWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> AcademyChoucairData)throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Login.onThePage(AcademyChoucairData.get(0).getStrUser(),AcademyChoucairData.get(0).getStrPassword()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciònBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> AcademyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(AcademyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciònBancolombia(List<AcademyChoucairData> AcademyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.ToThe(AcademyChoucairData.get(0).getStrCourse())));


    }



}
