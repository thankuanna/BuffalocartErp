package dataprovider;

import buffaloerp.BaseTester;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetUserData extends BaseTester
{
    //implement data provider for login test
    @Test(dataProvider = "dt1")
    public void Test1(String userName ,String password)
    {
        Assert.assertEquals(userName,password,"login failed");
    }



    @DataProvider(name = "dt1") //data provider method
    public Object[][] getData1() //object is superclass
    {
        return new Object[][] {{"admin","123456"}, {"wolverine","1995"}}; //returns2D object array
    }
}
