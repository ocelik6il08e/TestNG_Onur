package com.companies.Pages.etsy;

import com.companies.Utility.ConfigurationReader;
import com.companies.Utility.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class EtsyBasePage {

    public EtsyBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @BeforeClass()
    public void setup(){

        Driver.getDriver().get(ConfigurationReader.getProperty("urlEtsy"));
    }
    @FindBy(id = "global-enhancements-search-query")
    private WebElement searchInput;

    public void searchText(String text){
        searchInput.sendKeys(text + Keys.ENTER);

        }
    }

