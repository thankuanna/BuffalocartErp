package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BugPage
{

    @FindBy(xpath ="//a[text()='New Bugs']") //newBugs
    public  WebElement newBugs;

    @FindBy(name = "bug_title")
    public  WebElement enter_BugTitle;

    @FindBy(id="check_related")
    public  WebElement dropdown_Related;

    @FindBy(xpath ="//span[@title='demo (Admin)']")
    public WebElement dropdown_Reporter; // action

    @FindBy(name ="priority")
    public  WebElement dropdown_Priority; //select

    @FindBy(name ="severity")
    public  WebElement dropdown_severity; //select

    @FindBy(xpath="//*[@id=\"assign_task\"]/div/div/form/div[8]/div/div/div[6]")
    public  WebElement enter_description;

    @FindBy(xpath ="//*[@id=\"assign_task\"]/div/div/form/div[9]/div/div/div[6]")
    public  WebElement enter_reproducibility;

    @FindBy(xpath = "//select[@name ='bug_status']")
    public  WebElement dropdown_bugStatus; //select

    @FindBy(xpath = "//button[text()='Save']")
    public  WebElement save;

    //constructor
    WebDriver driver;
    public BugPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void clickOnNewBugs()
    {
        newBugs.click();
    }


    public void enterBugTitle(String bugTitle)
    {
        enter_BugTitle.sendKeys(bugTitle);
    }

    public void enterRelated(String related)
    {
        Select sl = new Select(dropdown_Related);
        sl.selectByVisibleText(related);
    }



    public void enterReporter(String reporter)
    {
        dropdown_Reporter.click(); //action
        String reporterDropDownOption = "//li[text()='"+reporter+"']";     // //li[text()='English (South Africa)']
        System.out.println("xpath is :"+reporterDropDownOption);
        WebElement element = driver.findElement(By.xpath(reporterDropDownOption)); //dropdown element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public void enterPriority(String priority)
    {
        Select sl = new Select(dropdown_Priority);
        sl.selectByVisibleText(priority);

    }

    public void enterSeverity(String severity)
    {
        Select sl = new Select(dropdown_severity);
        sl.selectByVisibleText(severity);
    }

   public void enterDescription(String description )
    {
        enter_description.sendKeys(description);
    }

    public void enterReproducibility(String reproducibility)
    {
        enter_reproducibility.sendKeys(reproducibility);
    }

    public void enterBugStatus(String bugStatus)
    {
        Select sl = new Select(dropdown_bugStatus);
        sl.selectByVisibleText(bugStatus);
    }


    public void clickSave()
    {
        save.click();
    }


}
