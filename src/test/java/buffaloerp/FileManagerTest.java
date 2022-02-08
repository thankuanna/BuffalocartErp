package buffaloerp;

import org.testng.annotations.Test;
import pages.BuffaloCartHomePage;
import pages.BuffaloCartLoginPage;
import pages.BugPage;
import pages.FileManagerPage;

public class FileManagerTest extends  BaseTester
{
    @Test
    void createFile() {
        BuffaloCartLoginPage loginPage = new BuffaloCartLoginPage(driver);  //login
        loginPage.userLogin("admin", "123456");

        BuffaloCartHomePage homePage = new BuffaloCartHomePage(driver); //HOME PAGE
        homePage.clickOnMenuWithName("File Manager");

        FileManagerPage fileManagerPage = new FileManagerPage(driver); //Bug page
        fileManagerPage.createNewFolder();
        fileManagerPage.openNewFolder();
        fileManagerPage.createNewFile();

    }
}
