package buffaloerp;

import org.testng.annotations.Test;
import pages.BuffaloCartHomePage;
import pages.BuffaloCartLoginPage;
import pages.VerifyBugPage;

public class VerifyBugTest extends BaseTester
{
    @Test
    void verifyBug()
    {
        BuffaloCartLoginPage loginPage = new BuffaloCartLoginPage(driver);  //login
        loginPage.userLogin("admin", "123456");

        BuffaloCartHomePage homePage = new BuffaloCartHomePage(driver); //HOME PAGE
        homePage.clickOnMenuWithName("Bugs");

        VerifyBugPage verifyBugPage = new VerifyBugPage(driver);
        verifyBugPage.newBugActions();
    }
}
