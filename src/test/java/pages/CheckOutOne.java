package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CheckOutOne extends CommonMethods {

    @FindBy(xpath="//input[@id='first-name']")
    public WebElement fName;

    @FindBy(xpath="//input[@id='last-name']")
    public WebElement lName;

    @FindBy(id="postal-code")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueBtn;

    public CheckOutOne(){
        PageFactory.initElements(driver, this);
    }
}
