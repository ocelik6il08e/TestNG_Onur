package com.companies.Pages.google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends GoogleBasePage {

    @FindBy(className = "gb_g")
    private WebElement gmailLink;

    public void clickGmail(){
        gmailLink.click();
    }
}
