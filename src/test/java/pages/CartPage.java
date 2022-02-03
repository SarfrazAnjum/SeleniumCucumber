package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CartPage extends CommonMethods {

    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement checkOutBtn;

    public CartPage(){
        PageFactory.initElements(driver, this);
    }
}
