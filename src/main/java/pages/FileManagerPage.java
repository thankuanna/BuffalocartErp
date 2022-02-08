package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileManagerPage {

    @FindBy(xpath ="//div[@title='New folder']")
    public WebElement newFolder;

    @FindBy(xpath ="//div[@title='New text file']")
    public WebElement newTextFile;

    WebDriver driver;
    public FileManagerPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    public void createNewFolder()
    {
        newFolder.click();
    }

    public void openNewFolder()
    {
        Actions actions = new Actions(driver);
        actions.doubleClick(newFolder).build().perform();
    }
    public void createNewFile()
    {

        Actions actions = new Actions(driver);
        actions.click(newTextFile).build().perform();

    }


}
