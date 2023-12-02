package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {


    public WebDriver driver;


    public LoginPage(WebDriver driver){

        this.driver=driver;
    }


    // to store the locators

    // top perform the actions on the locators



    private By textUsername=By.id("username");
    private By textPassword=By.id("password");
    private By selectLocation=By.id("location");
    private By buttonLogin=By.xpath("//button[@type='submit' and text()='Login']");




    public void loginToBahmniApp(String username, String password) throws InterruptedException {



        driver.findElement(textUsername).sendKeys(username);
        driver.findElement(textPassword).sendKeys(password);

        Select select=new Select(driver.findElement(selectLocation));
        select.selectByVisibleText("Bahmni Clinic");

        driver.findElement(buttonLogin).click();





        Thread.sleep(5000);

    }




}
