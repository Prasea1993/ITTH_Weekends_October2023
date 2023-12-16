package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConsultationObservation {

    public WebDriver driver;


    public ConsultationObservation(WebDriver driver){

        this.driver=driver;
    }



//    private By saveandgotoDashboard = By.xpath("//button[normalize-space()='Save and go to Dashboard']");
private By clinicalButton = By.id("bahmni.clinical");
    private By patientname= By.xpath("//div[text()='Arun ITTH']");
    private By Consultation = By.xpath("//a[@class='btn--left btn--success']");
    private By Returnvisitdate = By.xpath(  "//input[@type ='date']");
    private By Reasonforvisit = By.xpath("//div[@class='obs-comment-section-wrap']//textarea");
    private By save = By.xpath("//button[@class='confirm save-consultation']//u[contains(text(),'S')]");


   public void navigateToClinicalButton() throws InterruptedException {

       driver.findElement(clinicalButton).click();

       Thread.sleep(3000);
   }

        public void selectPatient() throws InterruptedException {
           driver.findElement(patientname).click();
           Thread.sleep(3000);
        }

        public void clickconsultation() throws InterruptedException {


        driver.findElement(Consultation).click();
        Thread.sleep(3000);
    }

    public void setConsultationObservation(String date, String Reason) throws InterruptedException {

//        WebElement returnvisitdate = driver.findElement(Returnvisitdate);
//        Thread.sleep(5000);
//        returnvisitdate.sendKeys(date);

driver.findElement(Returnvisitdate).sendKeys(date);
        Thread.sleep(5000);
        driver.findElement(Reasonforvisit).sendKeys(Reason);
        Thread.sleep(5000);
        driver.findElement(save).click();
        Thread.sleep(5000);
    }


}
