package com.companies.Test.google;

import com.companies.Pages.google.GmailPage;
import com.companies.Pages.google.GoogleBasePage;
import com.companies.Pages.google.GooglePage;
import com.companies.Utility.BrowserUtilities;
import com.companies.Utility.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailTest extends GoogleBasePage {

    GooglePage googlePage = new GooglePage();
    GmailPage gmailPage = new GmailPage();


    @Test(description = "TC #3: Back and forth navigation\n" +
            "1-\tOpen a chrome browser\n" +
            "2-\tGo to: https://google.com\n" +
            "3-\tClick to Gmail from top right.\n" +
            "4-\tVerify title contains:\n" +
            "\tExpected: Gmail\n" +
            "5-\tGo back to Google by using the .back();\n" +
            "6-\tVerify title equals:\n" +
            "\tExpected: Google\n")

    public void titleContainGmailVerify() {

        googlePage.clickGmail();

        String actualTitle = BrowserUtilities.getTitle();
        String expectedText = "Gmail";

        Assert.assertTrue(actualTitle.contains(expectedText));
        Driver.getDriver().navigate().back();

        String expectedTitle = "Google";
        actualTitle = BrowserUtilities.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }




}
