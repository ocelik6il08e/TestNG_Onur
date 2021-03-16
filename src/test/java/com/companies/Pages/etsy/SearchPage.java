package com.companies.Pages.etsy;

import com.companies.Utility.Driver;

public class SearchPage {

    public String etsyUrl(){

        return Driver.getDriver().getCurrentUrl();
    }



}
