package stepDefinitions;

import appPages.ConsultationObservation;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ConsultationObservationStepDefinition {

    ConsultationObservation co = new ConsultationObservation(DriverManager.getDriver());

    @And("user click on clinical button on home screen")
    public void userClickOnClinicalButtonOnHomeScreen() throws InterruptedException {
        co.navigateToClinicalButton();

    }

    @And("user clicks on {string}")
    public void userClicksOn(String patientname) throws InterruptedException {

        co.selectPatient();

    }
    @Then("clicks on Consultation")
    public void clicks_on_consultation() throws InterruptedException {
co.clickconsultation();

    }


    @And("select {string} and {string} and clicks on save")
    public void selectAndAndClicksOnSave(String date, String Reason) throws InterruptedException {
        co.setConsultationObservation(date, Reason);

    }


}
