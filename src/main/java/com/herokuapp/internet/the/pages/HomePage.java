package com.herokuapp.internet.the.pages;

import com.herokuapp.internet.the.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginPageMessage =By.xpath("//h2[text()='Login Page']");


// We are verifying that user is on login page by checking welcome message on page

    public String checkUserIsOnLoginPage(){

        return  getTextFromElement(loginPageMessage);

    }



}
