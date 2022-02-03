package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class MainPage extends CommonMethods {
    @FindBy(xpath = "//div[@class='app_logo']")
    public WebElement appLogo;

    @FindBy(xpath = "//div[@class = 'inventory_item_name']")
    public List<WebElement> ItemList;


    public MainPage() {
        PageFactory.initElements(driver, this);
    }
}
