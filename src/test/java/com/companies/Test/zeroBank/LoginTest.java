package com.companies.Test.zeroBank;

import com.companies.Pages.zeroBank.ZeroBankBasePage;
import com.companies.Pages.zeroBank.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ZeroBankBasePage {
    LoginPage loginPage = new LoginPage();


    @Test(description = "TC #2: Zero Bank header verification\n" +
            "1. Open Chrome browser\n" +
            "2. Go to http://zero.webappsecurity.com/login.html\n" +
            "3. Verify header text\n" +
            "Expected: “Log in to ZeroBank”")

    public void headerVerification(){
        String actualHeaderName = loginPage.getHeaderName();
        System.out.println(actualHeaderName);
        String expectedHeaderName = "Log in to ZeroBank";
        System.out.println(expectedHeaderName);

        Assert.assertEquals(actualHeaderName,expectedHeaderName);


    }
}
