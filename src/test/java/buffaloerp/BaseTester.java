package buffaloerp;

import driver.DriverFactory;
import driver.DriverUtils;
import driver.DriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTester
{
    //create a base before class or before method and create webdriver

    WebDriver driver;
    @BeforeMethod
    @Parameters({"browser"})             //  1 para ; name should be same as in testng

    void OpenBrowser(@Optional("chrome") String browserName)  //in testng.xml wehave param called"browser",value"chrome" thats passed into bm &inthis mthd itspassed as"browserName"
    {
        //using abstraction concept

        //opening browser
        driver= DriverFactory.createDriver(browserName); //passing object of browsername;here method will return object of webdriver;logic of opening browser is moved to driver;
        //maximize browser
        driver = DriverUtils.maximize(driver);
        //implicit wait
        driver = DriverWait.implicitWait(driver);


        driver.get("https://erp.buffalocart.com/login");//getting the url

    }
    @AfterMethod
    void CloseBrowser()
    {
        driver.quit();

    }
    @AfterMethod
    void afterMethod(ITestResult iTestResult) //iTestResult have the status
    {
       if(iTestResult.getStatus()==2) //in ITestResult class 2 is failure,1 is pass{naviigate]
        {
            DriverUtils.captureScreenshot(driver,iTestResult.getName()+"_failed"); //automatically takes screenshot when test fails
        }
      /*  if(iTestResult.getStatus()==1) //in ITestResult class 2 is failure,1 is pass{naviigate]
        {
            DriverUtils.captureScreenshot(driver,iTestResult.getName()+"_passed"); //automatically takes screenshot when test passes
        }*/
    }

}
