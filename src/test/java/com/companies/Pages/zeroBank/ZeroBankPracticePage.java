package com.companies.Pages.zeroBank;

import com.companies.Utility.Driver;

public class ZeroBankPracticePage {

    public String zeroBankUrl(){

        return Driver.getDriver().getCurrentUrl();
    }

    public String getTitle(){
        return   Driver.getDriver().getTitle();
    }
}
