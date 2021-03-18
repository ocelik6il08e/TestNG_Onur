package com.companies.Pages.smartBear;

import com.companies.Utility.ConfigurationReader;
import com.companies.Utility.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userID_InputPlace;

    public void inputUserID() {
        userID_InputPlace.sendKeys(ConfigurationReader.getProperty("smartBearUserName"));
    }


    @FindBy(id = "ctl00_MainContent_password")
    private WebElement userPassword_InputPlace;

    public void inputUserPASS() {
        userPassword_InputPlace.sendKeys(ConfigurationReader.getProperty("smartBearUserPass"));
    }

    @FindBy(id = "ctl00_MainContent_login_button")
    private WebElement loginButton;
    public void clickLogin() {
        loginButton.click();
    }
}
