package com.companies.Pages.zeroBank;

import com.companies.Utility.ConfigurationReader;
import com.companies.Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class ZeroBankBasePage {

    public ZeroBankBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @BeforeClass()
    public void setup(){

        Driver.getDriver().get(ConfigurationReader.getProperty("urlZeroBank"));
    }

}
