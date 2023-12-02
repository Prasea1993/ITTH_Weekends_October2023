package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(

        features = {"src/test/resources/featureFiles"},
        glue = {"stepDefinitions","CommonActions"},
        tags = "@RegistrationTest"


)
public class LoginTestRunner extends AbstractTestNGCucumberTests {


    @DataProvider
    public Object[][] getScenarios(){
        return super.scenarios();
    }


}
