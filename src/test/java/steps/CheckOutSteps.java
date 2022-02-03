package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CheckOutOne;
import pages.CheckOutTwo;
import utils.CommonMethods;

public class CheckOutSteps extends CommonMethods {

    @Given("User is successfully logged in")
    public void user_is_successfully_logged_in() {
        sendText(loginPage.username, "standard_user");
        sendText(loginPage.password, "secret_sauce");
        clickElement(loginPage.loginButton);

    }
    @When("I click on Item {string}")
    public void i_click_on_item(String itemName) {
        for(WebElement ele : mainPage.ItemList){
            if(ele.getText().equals(itemName)){
                clickElement(ele);
                break;
            }
        }

    }
    @When("I click on ADD TO CART BUTTON")
    public void i_click_on_add_to_cart_button() {
        clickElement(inventoryItemPage.addToCartButton);

    }
    @When("I click on shopping cart button")
    public void i_click_on_shopping_cart_button() {
        clickElement(inventoryItemPage.shoppingCartButton);
        clickElement(cartPage.checkOutBtn);

    }
    @When("I enter the order information {string},{string},{string}")
    public void i_enter_the_order_information(String fname, String lname, String zip) {
        sendText(checkOutOne.fName, fname);
        sendText(checkOutOne.lName, lname);
        sendText(checkOutOne.zipCode, zip);
        clickElement(checkOutOne.continueBtn);

    }
    @Then("I verify the item name matches {string}")
    public void i_verify_the_item_name_matches(String itemName) {
        Assert.assertEquals((checkOutTwo.checkOutItem.getText()), itemName);

    }

}
