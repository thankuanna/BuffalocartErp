package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory
{
    public static WebDriver createDriver(String browserName)
    {

        WebDriver driver = null;

       if(browserName.equalsIgnoreCase("chrome"))
        {
            System.out.println("test is starting from chrome");
            System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
            driver = new ChromeDriver();
            /*ChromeOptions options = new ChromeOptions(); //remove  driver = new ChromeDriver();
            //options for chrome[options.getaddd//desired capabilities--downloading file
            driver = new ChromeDriver(options);*/
        }

        /*if(browserName.equalsIgnoreCase("firefox"))   // driver for firefox ; doubt-getting failed
        {
            System.out.println("test is starting from firefox");
            System.setProperty("webdriver.gecko.driver", "C://GeckoDriver//geckodriver.exe");
            driver = new FirefoxDriver();
        }*/
        return  driver;
    }

}
