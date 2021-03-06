package testbase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseClass{

     public static WebDriver driver;
    public  static WebDriver start() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/features/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");

        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        PageInit.initialize();
        return driver;
    }

    public static void end(){
        driver.quit();
    }
}
