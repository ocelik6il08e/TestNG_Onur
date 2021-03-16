package com.companies.Pages.etsy;

import com.companies.Utility.Driver;

public class EtsyPracticePage {

    public String etsyUrl(){

        return Driver.getDriver().getCurrentUrl();
    }

    public String getTitle(){
        return   Driver.getDriver().getTitle();
    }

}
