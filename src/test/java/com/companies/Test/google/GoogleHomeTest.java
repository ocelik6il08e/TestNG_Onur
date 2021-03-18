package com.companies.Test.google;

import com.companies.Pages.google.GoogleBasePage;
import com.companies.Utility.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleHomeTest extends GoogleBasePage {


    @Test(priority = 1)
    public void googleTitleVerify() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test(priority = 0)
    public void afterSendTextTitleVerification() {

        String text = "onur";
        System.out.println("Before Search : " + Driver.getDriver().getTitle());
        searchText(text);
        System.out.println("After Search : " + Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(text), "There is no " + text + " in the title.");

    }

    @Test(priority = 2)

    public void afterSendTextTitleVerification2() {
        String text = "apple";
        System.out.println("Before Search : " + Driver.getDriver().getTitle());
        searchText(text);
        System.out.println("After Search : " + Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith(text), "There is no " + text + " in the title.");

    }
}
