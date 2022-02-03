package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.PageInit;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class CommonMethods extends PageInit {

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void clickElement(WebElement ele){
        ele.click();
    }

    public boolean isDisplayed(WebElement ele){
        return ele.isDisplayed();
    }

    public static WebDriverWait getWaitObject() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait;
    }

    public static WebElement waitForVisibility(WebElement element) {
        return getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }

    public static byte[] takeScreenshot(String filename) {
        TakesScreenshot ts = (TakesScreenshot) driver;

        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

        File file = ts.getScreenshotAs(OutputType.FILE);
        // create destination as : filepath + filename + timestamp + .png
        String destination = filename + "/" + getTimeStamp() + " screenshot.png";

        try {
            FileUtils.copyFile(file, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return picBytes;
    }
        public static byte[] takeScreenshotofElement(WebElement ele, String filename) {


            File source = ele.getScreenshotAs(OutputType.FILE);
            byte[] picBytes = ele.getScreenshotAs(OutputType.BYTES);
            String destination = filename + "/" + getTimeStamp() + " screenshot-element.png";

            try {
                FileUtils.copyFile(source, new File(destination));
            } catch (IOException e) {
                e.printStackTrace();
            }

            return picBytes;
        }


    public static String getTimeStamp() {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

        return sdf.format(date.getTime());

    }


}
