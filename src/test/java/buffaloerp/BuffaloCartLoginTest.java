package buffaloerp;

import driver.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BuffaloCartHomePage;
import pages.BuffaloCartLoginPage;

public class BuffaloCartLoginTest extends BaseTester
{
    @Test
    void loginTest()  //login validation
    {
        BuffaloCartLoginPage loginPage = new BuffaloCartLoginPage(driver);//creating object for loginpage&pass constructor(driver)
        loginPage.enterUsername("admin");
        loginPage.enterPassword("123456");
        loginPage.submit();

        BuffaloCartHomePage homePage = new BuffaloCartHomePage(driver); //homepage obj
        Assert.assertTrue(homePage.isLogoPresent(),"LOGO NOT PRESENT"); //calling the method
        DriverUtils.captureElementScreenshot(driver,"elementScreenshot");  //doubt
    }
}
