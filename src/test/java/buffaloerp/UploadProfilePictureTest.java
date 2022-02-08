package buffaloerp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;

public class UploadProfilePictureTest extends BaseTester {

    @Test
    void uploadPicture() {
        BuffaloCartLoginPage loginPage = new BuffaloCartLoginPage(driver); //LOGIN PAGE
        loginPage.userLogin("admin", "123456");

        BuffaloCartHomePage homePage = new BuffaloCartHomePage(driver); //HOME PAGE
        homePage.clickOnMenuWithName("User");

        VerifyUserPage userPage = new VerifyUserPage(driver); // USER PAGE
        userPage.clickOnNewUserLink();

        UploadProfilePicturePage pictureTest = new UploadProfilePicturePage(driver);  //NEW USER PAGE
        pictureTest.uploadFile("C://Users//HP//Downloads//chromewebdriverheirachy.jpg");
    }


}


