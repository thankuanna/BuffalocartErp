package buffaloerp;

import org.testng.annotations.Test;
import pages.BuffaloCartHomePage;
import pages.BuffaloCartLoginPage;

public class ProfileSectionTest extends BaseTester
{
    @Test
     void profiledemo()
    {
        BuffaloCartLoginPage loginPage=new BuffaloCartLoginPage(driver);  //login
        loginPage.userLogin("admin","123456");

        BuffaloCartHomePage homePage=new BuffaloCartHomePage(driver); //HOME PAGE
    }

}
