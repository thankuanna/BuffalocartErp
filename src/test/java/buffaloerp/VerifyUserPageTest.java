package buffaloerp;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BuffaloCartHomePage;
import pages.BuffaloCartLoginPage;
import pages.VerifyUserPage;

public class VerifyUserPageTest extends  BaseTester  {
    @Test
    void verifyUserName()
    {
        BuffaloCartLoginPage loginPage=new BuffaloCartLoginPage(driver);
        loginPage.enterUsername("admin");
        loginPage.enterPassword("123456");
        loginPage.submit();

        BuffaloCartHomePage homePage=new BuffaloCartHomePage(driver);
        homePage.clickOnUserMenu();  //calling User

        VerifyUserPage userPage=new VerifyUserPage(driver);
        Assert.assertTrue(userPage.isASpecificUserPresent("Obsqura"),"username not present");
    }




}
