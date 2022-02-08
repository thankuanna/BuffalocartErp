package driver;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverWait
{
    public static WebDriver implicitWait(WebDriver driver) //implicit wait for driver
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public static Wait explicitWait(WebDriver driver)  //explicit can be applied for each web elmt and it has 2 >webdriver wait n fluent wait
    {
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return  wait;
    }

    public static Wait fluentWait(WebDriver driver)  //fluent
    {
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.ignoring(Exception.class); //to ignore excep
        wait.ignoring(NoSuchElementException.class);
        return  wait;
    }

}
