package com.companies.Test.etsy;

import com.companies.Pages.etsy.EtsyBasePage;
import com.companies.Pages.etsy.SearchPage;
import com.companies.Utility.BrowserUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_Test extends EtsyBasePage {

    SearchPage searchPage = new SearchPage();


    @Test(description = "TC #1: Etsy Title Verification\n" +
            "1. Open Chrome browser\n" +
            "2. Go to https://www.etsy.com\n" +
            "3. Search for “wooden spoon”\n" +
            "4. Verify title:\n" +
            "Expected: “Wooden spoon | Etsy”")

    public void etsyTitleVerification(){
        String searchText="wooden spoon";

        System.out.println("Before Search Text : "+ BrowserUtilities.getTitle());
        searchText(searchText);
        String actualTitle = BrowserUtilities.getTitle();
        System.out.println("After Search Text : "+ actualTitle  );
        String expectedTitle ="Wooden spoon | Etsy";

        Assert.assertEquals(actualTitle,expectedTitle,"They are NOT Match!");









    }


}
