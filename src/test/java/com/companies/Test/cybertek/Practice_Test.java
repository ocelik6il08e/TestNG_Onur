package com.companies.Test.cybertek;

import com.companies.Pages.cybertek.CybertekBasePage;
import com.companies.Pages.cybertek.PracticePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_Test extends CybertekBasePage {
    PracticePage practicePage = new PracticePage();


    @Test(description = "TC #2: Cybertek verifications\n" +
            "1. Open Chrome browser\n" +
            "2. Go to https://practice.cybertekschool.com\n" +
            "3. Verify URL contains\n" +
            "Expected: cybertekschool\n"
            )

    public void urlContainsVerification() {
        String expectedUrlContain = "cybertekschool";
        String actualFullUrl = practicePage.cybertekUrl();
        Assert.assertTrue(actualFullUrl.contains(expectedUrlContain));


    }

    @Test(description = "4. Verify title:\n" +
            "Expected: Practice")
    public void titleVerification(){

        String actualTitle = practicePage.getTitle();
        String expectedTitle = "Practice";

        Assert.assertEquals(actualTitle,expectedTitle,"Wrong Title!");

    }



}
