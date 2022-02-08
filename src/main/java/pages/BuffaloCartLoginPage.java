package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuffaloCartLoginPage {
    WebDriver driver;


    public BuffaloCartLoginPage(WebDriver driver) // parameterized constructor
    {
        PageFactory.initElements(driver,this); //creating weblements of all ; same as driver.findelement
        this.driver =driver;
    }
    // when we are creating obj it will create webelements called user and password with given xpath/id

    @FindBy(xpath = "//input[@name='user_name']")
    public WebElement user;

    @FindBy(xpath = "//input[@name='password']")
    public  WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement submit;


    public void enterUsername(String username)
    {
        user.sendKeys(username);
    }

    public void enterPassword(String user_password)
    {
        password.sendKeys(user_password);
    }
    public void submit()
    {
        submit.click();
    }

    public void userLogin(String user_name, String pass_word) //calling this mthd in NewUserPageTest
    {
        enterUsername(user_name);
        enterPassword(pass_word);
        submit();

    }

}
