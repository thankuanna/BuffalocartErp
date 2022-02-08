package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadProfilePicturePage
{
    @FindBy(xpath = "//input[@id='myImg']")
    public WebElement file_upload;

    WebDriver driver;
    public UploadProfilePicturePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    public void uploadFile(String imagePath)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",file_upload);
        StringSelection img = new StringSelection(imagePath);// refer link to understand the copying "https://www.codegrepper.com/code-examples/java/copy+to+clipboard+java"
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(img,null); //copying to clipboard
        try
        {
            Robot rb = new Robot();//to do->ctrl c, ctr v--actions coming from java where library name is "Robot"
            rb.delay(250);
            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);  //ctr v
            rb.keyRelease(KeyEvent.VK_V);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_ENTER); //AFTER THIS; RELEASE IT, OTHERWISE IT WILL KEEP ON PRESSING
            rb.delay(90);
            rb.keyRelease(KeyEvent.VK_ENTER); //for releasing;keyRelease

        }
        catch (Exception e)
        {
            e.printStackTrace();


        } // if actions are not working go with robot
    }
}
