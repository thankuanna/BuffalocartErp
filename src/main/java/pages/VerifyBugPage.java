package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyBugPage {

    @FindBy(xpath ="//a[text()='Test Bug']")
    public WebElement newBug;

    WebDriver driver;
    public VerifyBugPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void newBugActions()
    {
        newBug.click();
    }
}
