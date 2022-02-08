package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuffaloCartHomePage
{
    @FindBy(xpath = "//div[@class='user-block-status']/img")
    public WebElement logo;

    @FindBy(xpath="//span[text()='User']")  //going to user to verify user pages
    public WebElement userMenu;

    @FindBy(xpath ="//span[text()='Wolverine'][1]")
            public  WebElement newUsername;

    WebDriver driver;
    public BuffaloCartHomePage(WebDriver driver) // parameterized constructor
    {
        PageFactory.initElements(driver,this); //creating weblements of all ; same as driver.findelement
        this.driver =driver;
    }

    public boolean isLogoPresent()  //return type boolean
    {
        return logo.isDisplayed(); //display function
    }

    public void clickOnUserMenu()
    {
        userMenu.click();  //clicking on User
    }


    public void clickOnMenuWithName(String menuName)
    {
        String menuXpath="//a[contains(@title,'"+menuName+"')]"; //string concatenation(//a[contains(@title,'User'
        driver.findElement(By.xpath(menuXpath)).click(); //to find the particular elmt with name

         /*in menu bar, the only change will be in the text field,thatswhy creating this method, so that we can reuse it
    in all tests*/
    }

   /*public boolean isUserNamePresent() {
        return newUsername.isDisplayed();
    }*/


}
