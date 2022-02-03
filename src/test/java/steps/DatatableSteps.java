package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class DatatableSteps extends CommonMethods {
    @Given("verifying login with following datatable")
    public void verifying_login_with_following_datatable(DataTable table) {

        List<Map<String, String>> data = table.asMaps(String.class, String.class);

            sendText(loginPage.username, data.get(0).get("username"));
            sendText(loginPage.password, data.get(0).get("password"));
            clickElement(loginPage.loginButton);
            Assert.assertTrue(mainPage.appLogo.isDisplayed());





    }

}
