package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class InventoryItemPage extends CommonMethods {

    @FindBy(xpath = "//button[text()='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    public WebElement shoppingCartButton;

    public InventoryItemPage(){
        PageFactory.initElements(driver, this);

    }
}
