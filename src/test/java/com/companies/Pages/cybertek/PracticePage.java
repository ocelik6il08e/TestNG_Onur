package com.companies.Pages.cybertek;

import com.companies.Utility.Driver;

public class PracticePage extends CybertekBasePage{

    public String cybertekUrl(){

       return Driver.getDriver().getCurrentUrl();
    }

    public String getTitle(){
      return   Driver.getDriver().getTitle();
    }



}
