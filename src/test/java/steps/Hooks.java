package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;
import testbase.BaseClass;
import utils.CommonMethods;

public class Hooks {
    @Before
    public void setUp() throws InterruptedException {
        BaseClass.start();
    }

    @After
    public void tearDown(Scenario scenario){
        byte[] picture;
        if (scenario.isFailed()) {
           picture =  CommonMethods.takeScreenshot("failed/"+scenario.getName());
        }
        else{
            picture = CommonMethods.takeScreenshot("passed/" + scenario.getName());
        }
        scenario.attach(picture,"image/png", scenario.getName());
        BaseClass.end();
    }

}
