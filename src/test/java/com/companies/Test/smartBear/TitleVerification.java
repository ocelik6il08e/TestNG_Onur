package com.companies.Test.smartBear;

import com.companies.Pages.smartBear.BasePage;
import com.companies.Utility.BrowserUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleVerification extends BasePage {




    @Test(description ="TC #5: Basic login authentication\n" +
            "1- Open a chrome browser\n" +
            "2- Go to:\n" +
            "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\n" +
            "3- Verify title equals:\n" +
            "Expected: Web Orders Login\n" +
            "4- Enter username: Tester\n" +
            "5- Enter password: test\n" +
            "6- Click “Sign In” button\n" +
            "7- Verify title equals:\n" +
            "Expected: Web Orders" )

    public void titleVerification(){

        String actualTitle = BrowserUtilities.getTitle();
        String expectedTitle ="Web Orders Login";

        Assert.assertEquals(actualTitle,expectedTitle,"They are NOT equals !!!");

    }
}
