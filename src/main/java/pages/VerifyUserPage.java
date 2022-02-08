package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class VerifyUserPage
{
@FindBy(id ="Data Tables")  //table
    public WebElement user_table;

@FindBy(xpath ="//table[@id='DataTables']/tbody/tr/td[2]") //userList;tr:row td:column
    public List<WebElement> user_list;

    @FindBy(xpath="//a[text()='New User']") //xpath for new user
    public WebElement newUser;

    WebDriver driver;
    public VerifyUserPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }


    public boolean isASpecificUserPresent(String username)
    {
        System.out.println("List Size is "+user_list.size());
        boolean flag=false; //creating boolean flag element
        for (WebElement ul:user_list) //adding elements to the list
        {
            String name=ul.getText();
            if(name.equals(username)) //when 1st element found "obsqura;
                flag=true;
        }
        return flag;
    }
    public void clickOnNewUserLink()
    {
        newUser.click(); //clicking on new user
    }


}
