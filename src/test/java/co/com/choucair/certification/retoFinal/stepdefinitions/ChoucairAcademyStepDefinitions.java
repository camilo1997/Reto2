package co.com.choucair.certification.retoFinal.stepdefinitions;

import co.com.choucair.certification.retoFinal.model.UtestData;
import co.com.choucair.certification.retoFinal.questions.Answer;
import co.com.choucair.certification.retoFinal.tasks.OpenUp;
import co.com.choucair.certification.retoFinal.tasks.BotonRegistro;
import co.com.choucair.certification.retoFinal.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que un usuario quiere registrar sus datos en utest$")
    public void queUnUsuarioQuiereRegistrarSusDatosEnUtest(List<UtestData> utestData) throws  Exception{
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage(), (BotonRegistro.onThePage()));
    }


    @When("^el usuario registre sus datos$")
    public void elUsuarioRegistreSusDatos(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.the(utestData.get(0).getSrtConfirmPassword(), utestData.get(0).getSrtCountry(),
                utestData.get(0).getSrtDay(), utestData.get(0).getSrtEmail(), utestData.get(0).getSrtLanguage(), utestData.get(0).getSrtLanguages(),
                utestData.get(0).getSrtLastName(), utestData.get(0).getSrtMobil(),utestData.get(0).getSrtModel(),utestData.get(0).getSrtMonth(),
                utestData.get(0).getSrtName(), utestData.get(0).getSrtPassword(),utestData.get(0).getSrtSystem(),utestData.get(0).getSrtSystemMobile(),
                utestData.get(0).getSrtVersion(),utestData.get(0).getSrtYear(),utestData.get(0).getSrtZip()));
    }

    @Then("^registro sus datos correctamente(.*)$")
    public void registroSusDatosCorrectamente(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getSrtConfirm())));
    }
}
