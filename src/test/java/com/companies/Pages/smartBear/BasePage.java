package com.companies.Pages.smartBear;

import com.companies.Utility.ConfigurationReader;
import com.companies.Utility.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class BasePage {


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @BeforeClass()
    public void setup(){

        Driver.getDriver().get(ConfigurationReader.getProperty("urlSmartBear"));
    }

}
