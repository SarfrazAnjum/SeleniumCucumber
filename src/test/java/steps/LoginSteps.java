package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {

    @When("user enters valid username")
    public void user_enters_valid_username() {
        sendText(loginPage.username, "standard_user");
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
        sendText(loginPage.password, "secret_sauce");
    }

    @When("click on login button")
    public void click_on_login_button() {
        clickElement(loginPage.loginButton);
        //wait(2);
    }

    @Then("I validate that user is logged in")
    public void i_validate_that_user_is_logged_in() {
        Assert.assertTrue(mainPage.appLogo.isDisplayed());
    }

    @When("user leaves password empty")
    public void user_leaves_password_empty() {
        sendText(loginPage.password, "");
    }

    @Then("I validate that {string} message is displayed")
    public void i_validate_that_message_is_displayed(String expectedMsg) {
        String actualMsg = loginPage.errorMsg.getText();
        Assert.assertEquals("The welcome message is different!!!", expectedMsg, actualMsg);
    }

    @When("user enters invalid username as {string}")
    public void user_enters_invalid_username_as(String userName) {
        sendText(loginPage.username, userName);
    }

    @When("user enters invalid password as {string}")
    public void user_enters_invalid_password_as(String password) {
        sendText(loginPage.password, password);
    }


}
