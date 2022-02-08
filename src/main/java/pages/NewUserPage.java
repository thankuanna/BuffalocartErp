package pages;

import driver.DriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class NewUserPage
{

    @FindBy(name ="fullname")
    public WebElement  enter_fullName;

    @FindBy(css = "input#check_employment_id") //css
    public  WebElement enter_empId;

    @FindBy(id="check_username")
    public  WebElement enter_username;

    @FindBy(id="new_password")
    public  WebElement enter_password;

    @FindBy(name="confirm_password")
    public  WebElement enter_confirmPassword;

    @FindBy(id="check_email_addrees")
    public WebElement enter_email;

    @FindBy(xpath="//span[@title='English (United States)']")
    public WebElement dropdown_locale;

    /*@FindBy(xpath="//span[@title='English']")
    public  WebElement  dropdown_language;*/

    @FindBy(name="phone")
    public  WebElement enter_phone;

    @FindBy(name="mobile")
    public  WebElement enter_mobile;

    @FindBy(name="skype")
    public  WebElement enter_skype;

    @FindBy(id="user_type")
    public WebElement dropdown_usertype;

    @FindBy(xpath = "//select[@name='direction']")
    public  WebElement dropdown_direction;

   @FindBy(xpath ="//span[text()='Select Designation']")
    public WebElement dropdown_designation;

    @FindBy(xpath ="//div[@class='checkbox-inline c-checkbox']")  //doubt
    public  WebElement checkBox_department;

    @FindBy(xpath = "//span[@class='fa fa-circle']")
    public WebElement radiobutton1_permission;

    @FindBy(xpath = "//span[@class='fa fa-circle']")
    public WebElement radiobutton2_permission;

    @FindBy(xpath= "//button[text()='Create User']")
    public  WebElement createUser;



    WebDriver driver;
    public NewUserPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void enterFullName(String fullName)
    {
        enter_fullName.sendKeys(fullName);
    }

    public void enterEmpId(String empId)
    {
        enter_empId.sendKeys(empId);
    }
    public void enterUserName(String userName)
    {
        enter_username.sendKeys(userName);
        //System.out.println(enter_username.getSize());
    }

    public void enterPassword(String password)
    {
        enter_password.sendKeys(password);
      //  System.out.println(enter_password.getLocation());
    }

    public void enterConfirmPassword(String confirmPassword )
    {
        enter_confirmPassword.sendKeys(confirmPassword);
    }


    public void enterEmail(String email)
    {
        enter_email.sendKeys(email);
    }

    public void enterLocale(String locale)
    {
        dropdown_locale.click(); //action
        String localDropDownOption = "//li[text()='"+locale+"']";     // //li[text()='English (South Africa)']
        System.out.println("xpath is :"+localDropDownOption);
        WebElement element = driver.findElement(By.xpath(localDropDownOption)); //dropdown element

        DriverWait.explicitWait(driver).until(ExpectedConditions.visibilityOf(element));  ///explicit in driverwait
        element.click();
    }

    public void enterPhone(String phone)
    {
        enter_phone.sendKeys(phone);
        enter_phone.getSize();  //getting the size
        enter_phone.getLocation();  //getting the location
    }

    public void enterMobile(String mobile) {
        enter_mobile.sendKeys(mobile);
    }

    public void enterSkype(String skype) {
        enter_skype.sendKeys(skype);
    }

    public void enterUserType(String userType)
    {
        WebDriverWait wait =new WebDriverWait(driver,20); //created webdriver for wait
        wait.until(ExpectedConditions.visibilityOf(dropdown_usertype)); //sysm will wait till 20sec for elmt to be visible
        Select usertype = new Select(dropdown_usertype);
        usertype.selectByVisibleText(userType);
    }

    public void enterDirection(String direction)
    {
        Select usertype = new Select(dropdown_direction);
        usertype.selectByVisibleText(direction);


    }

    public void enterDesignation(String designation)
    {
        dropdown_designation.click(); //action
        String designationDropDownOption = "//li[text()='"+designation+"']";
        System.out.println("xpath is :"+designationDropDownOption);
        WebElement element = driver.findElement(By.xpath(designationDropDownOption)); //dropdown element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
    public void checkBoxDepartment()
    {
        checkBox_department.click();
    }

    public void enterPermission(int permission)
    {
        if(permission==1)
        {
            radiobutton1_permission.click();
        }

        else if(permission==2)
        {
            radiobutton2_permission.click();
        }
    }

    public void clickCreateUser()
    {
        createUser.click();
    }




}
