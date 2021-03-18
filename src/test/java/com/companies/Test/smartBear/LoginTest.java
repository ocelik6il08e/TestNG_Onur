package com.companies.Test.smartBear;

import com.companies.Pages.smartBear.LoginPage;
import com.companies.Utility.BrowserUtilities;
import com.companies.Utility.ConfigurationReader;
import com.companies.Utility.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends LoginPage {


    @Test(description = "4- Enter username: Tester\n" +
            "5- Enter password: test\n" +
            "6- Click “Sign In” button\n" +
            "7- Verify title equals:\n" +
            "Expected: Web Orders")

    public void userCredentialsTest() {
        String userName= ConfigurationReader.getProperty("smartBearUserName");
        String passWord = ConfigurationReader.getProperty("smartBearUserPass");
        login(userName,passWord);

        String actualTitle = BrowserUtilities.getTitle();
        String expectedTitle = "Web Orders";
        Assert.assertEquals(actualTitle, expectedTitle, "Titles are Not match ! ");


    }
}
