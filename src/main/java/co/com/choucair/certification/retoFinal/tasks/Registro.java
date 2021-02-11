package co.com.choucair.certification.retoFinal.tasks;

import co.com.choucair.certification.retoFinal.userinterface.UtestFormularioRegistroPage;
import javafx.scene.input.KeyCode;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Registro implements Task {
    private String srtName;
    private String srtLastName;
    private String srtEmail;
    private String srtMonth;
    private String srtDay;
    private String srtYear;
    private String srtLanguage;
    private String srtZip;
    private String srtCountry;
    private String srtSystem;
    private String srtVersion;
    private String srtLanguages;
    private String srtMobil;
    private String srtModel;
    private String srtSystemMobile;
    private String srtPassword;
    private String srtConfirmPassword;


    public static Registro the(String srtConfirmPassword, String srtCountry, String srtDay, String srtEmail, String srtLanguage, String srtLanguages, String srtLastName, String srtMobil, String srtModel, String srtMonth, String srtName, String srtPassword, String srtSystem, String srtSystemMobile, String srtVersion, String srtYear, String srtZip) {
        return Tasks.instrumented(Registro.class, srtConfirmPassword, srtCountry, srtEmail, srtDay, srtLanguage, srtLanguages, srtLastName, srtMobil,srtModel,srtMonth, srtName, srtPassword, srtSystem,srtSystemMobile, srtVersion, srtYear, srtZip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(srtName).into(UtestFormularioRegistroPage.INPUT_FIRST_NAME),
                Enter.theValue(srtLastName).into(UtestFormularioRegistroPage.INPUT_LAST_NAME),
                Enter.theValue(srtEmail).into(UtestFormularioRegistroPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(srtMonth).from(UtestFormularioRegistroPage.DROP_DOWN_LIST_MONTH),
                SelectFromOptions.byVisibleText(srtDay).from(UtestFormularioRegistroPage.DROP_DOWN_LIST_DAY),
                SelectFromOptions.byVisibleText(srtYear).from(UtestFormularioRegistroPage.DROP_DOWN_LIST_YEAR),
                Click.on(UtestFormularioRegistroPage.LANGUAGE),
                Enter.theValue(srtLanguage).into(UtestFormularioRegistroPage.LANGUAGE),
                Click.on(UtestFormularioRegistroPage.SELECT_LANGUAGE),
                Click.on(UtestFormularioRegistroPage.BUTTON_NEXT),
                Click.on(UtestFormularioRegistroPage.SELECT_CITY),
                Enter.theValue(srtZip).into(UtestFormularioRegistroPage.INPUT_CODE_POSTAL),
                Click.on(UtestFormularioRegistroPage.INPUT_COUNTRY),
                Enter.theValue(srtCountry).into(UtestFormularioRegistroPage.INPUT_COUNTRYS),
                Click.on(UtestFormularioRegistroPage.SELECT_COUNTRY),
                Click.on(UtestFormularioRegistroPage.BUTTON_NEXT2),
                Click.on(UtestFormularioRegistroPage.INPUT_SYSTEM),
                Enter.theValue(srtSystem).into(UtestFormularioRegistroPage.INPUT_SYSTEMS),
                Click.on(UtestFormularioRegistroPage.SELECT_SYSTEM),
                Click.on(UtestFormularioRegistroPage.INPUT_VERSION),
                Enter.theValue(srtVersion).into(UtestFormularioRegistroPage.INPUT_VERSIONS),
                Click.on(UtestFormularioRegistroPage.SELECT_VERSION),
                Click.on(UtestFormularioRegistroPage.INPUT_LANGUAGES),
                Enter.theValue(srtLanguages).into(UtestFormularioRegistroPage.INPUT_LANGUAGESS),
                Click.on(UtestFormularioRegistroPage.SELECT_LANGUAGES),
                Click.on(UtestFormularioRegistroPage.INPUT_MOBILE),
                Enter.theValue(srtMobil).into(UtestFormularioRegistroPage.INPUT_MOBILES),
                Click.on(UtestFormularioRegistroPage.SELECT_MOBIL),
                Click.on(UtestFormularioRegistroPage.INPUT_MODEL),
                Enter.theValue(srtModel).into(UtestFormularioRegistroPage.INPUT_MODELS),
                Click.on(UtestFormularioRegistroPage.SELECT_MODEL),
                Click.on(UtestFormularioRegistroPage.INPUT_SYSTEM_MOBILE),
                Enter.theValue(srtSystemMobile).into(UtestFormularioRegistroPage.INPUT_SYSTEM_MOBILES),
                Click.on(UtestFormularioRegistroPage.SELECT_SYSTEM_MOBILE),
                Click.on(UtestFormularioRegistroPage.BUTTON_NEXT3),
                Enter.theValue(srtPassword).into(UtestFormularioRegistroPage.INPUT_PASSWORD),
                Enter.theValue(srtConfirmPassword).into(UtestFormularioRegistroPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestFormularioRegistroPage.CHECKBOX_EMAIL),
                Click.on(UtestFormularioRegistroPage.CHECKBOX_TERMS),
                Click.on(UtestFormularioRegistroPage.CHECKBOX_PRIVACY)
                );
    }
}
