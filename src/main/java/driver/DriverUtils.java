package driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverUtils {
    public static WebDriver maximize(WebDriver driver)
    {
        driver.manage().window().maximize();
        return  driver;
    }

    public static void captureScreenshot(WebDriver driver,String fileName)
    {
        try
        {
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //temp file;creating a file object& using'TakesScreenshot' class of selenium to take screenshot and saving it in the source file
            FileHandler.copy(source, new File(fileName + ".png")); //pasting the content in new file;concatination
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void captureElementScreenshot(WebDriver driver,String elementScreenshotLogo)
    {
        try
        {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir") +"elementScreenshotLogo.png");

            FileHandler.copy(source, dest);
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
