package buffaloerp;

import org.testng.annotations.Test;
import pages.*;

public class BugTest extends  BaseTester
{
    @Test
    void createBug()
    {
        BuffaloCartLoginPage loginPage=new BuffaloCartLoginPage(driver);  //login
        loginPage.userLogin("admin","123456");

        BuffaloCartHomePage homePage=new BuffaloCartHomePage(driver); //HOME PAGE
        homePage.clickOnMenuWithName("Bugs");

        BugPage bugPage = new BugPage(driver); //Bug page
        bugPage.clickOnNewBugs();
        bugPage.enterBugTitle("Test Bug");
        bugPage.enterRelated("Projects");
      bugPage.enterReporter("abc (Client)");
        bugPage.enterPriority("High");
        bugPage.enterSeverity("Minor");
        bugPage.enterDescription("Testing the bugs");
       bugPage.enterReproducibility("testing the data test");
       bugPage.enterBugStatus("Confirmed");
        bugPage.clickSave();


    }
}
