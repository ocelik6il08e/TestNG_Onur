package com.companies.Test.google;

import com.companies.Pages.google.GoogleBasePage;
import com.companies.Pages.google.GooglePage;
import org.testng.annotations.Test;

public class GmailPageTest extends GoogleBasePage {

    GooglePage googlePage = new GooglePage();

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


    }


}
