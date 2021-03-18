package com.companies.Pages.smartBear;

import com.companies.Utility.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userID_Input;

    public void inputUserID() {
        userID_Input.sendKeys(ConfigurationReader.getProperty("smartBearUserName"));
    }


    @FindBy(id = "ctl00_MainContent_password")
    private WebElement userPassword_Input;

    public void inputUserPASS() {
        userPassword_Input.sendKeys(ConfigurationReader.getProperty("smartBearUserPass"));
    }

    @FindBy(id = "ctl00_MainContent_login_button")
    private WebElement loginButton;
    public void clickLogin() {
        loginButton.click();
    }

    public void login(String username, String password){
        userID_Input.sendKeys(username);
        userPassword_Input.sendKeys(password+ Keys.ENTER);

    }
}
