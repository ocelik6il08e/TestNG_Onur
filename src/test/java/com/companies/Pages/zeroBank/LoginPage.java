package com.companies.Pages.zeroBank;

import com.companies.Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    public String zeroBankUrl(){

        return Driver.getDriver().getCurrentUrl();
    }
    @FindBy(xpath = "//div[@class='page-header']/h3")
    private WebElement headerName;

    public String getHeaderName(){
        return headerName.getText();
    }

    public String getTitle(){
        return   Driver.getDriver().getTitle();
    }
}
