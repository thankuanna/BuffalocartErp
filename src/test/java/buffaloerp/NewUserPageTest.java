package buffaloerp;

import driver.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BuffaloCartHomePage;
import pages.BuffaloCartLoginPage;
import pages.NewUserPage;
import pages.VerifyUserPage;

public class NewUserPageTest extends BaseTester{
    @Test(groups={"Regression","Smoke"})
    void createNewUser()
    {

        //driver = DriverFactory.createDriver(browser)
        BuffaloCartLoginPage loginPage=new BuffaloCartLoginPage(driver); //LOGIN PAGE
        /*loginPage.enterUsername("admin");  //creating separate mthd in Erploginpage
        loginPage.enterPassword("123456");
        loginPage.submit();*/
        loginPage.userLogin("admin","123456");

        DriverUtils.captureScreenshot(driver,"screenshot1"); //screenshot

        BuffaloCartHomePage homePage=new BuffaloCartHomePage(driver); //HOME PAGE
        homePage.clickOnMenuWithName("User");

        VerifyUserPage userPage=new VerifyUserPage(driver); // USER PAGE
        userPage.clickOnNewUserLink();

        NewUserPage newPage = new NewUserPage(driver);  //NEW USER PAGE
        newPage.enterFullName("Wolverine");
        newPage.enterEmpId("1995");
        newPage.enterUserName("wolverine");
        newPage.enterPassword("1995");
        newPage.enterConfirmPassword("1995");
        newPage.enterEmail("wolverine@gmail.com");
        newPage.enterLocale("English (South Africa)");
        newPage.enterPhone("12345678");
        newPage.enterMobile("23456789");
        newPage.enterSkype("1104");
        newPage.enterUserType("Admin");
        newPage.enterDirection("LTR");
        newPage.enterDesignation("fg");
        newPage.checkBoxDepartment();
        newPage.enterPermission(2);
        newPage.clickCreateUser();

     //Assert.assertTrue( homePage.isUserNamePresent(),"userName not present");
    }
}
