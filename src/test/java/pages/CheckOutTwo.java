package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CheckOutTwo extends CommonMethods {

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public WebElement checkOutItem;


    public CheckOutTwo() {
        PageFactory.initElements(driver, this);
    }
}
