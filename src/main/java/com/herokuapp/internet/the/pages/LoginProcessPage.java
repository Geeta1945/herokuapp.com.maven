package com.herokuapp.internet.the.pages;

import com.herokuapp.internet.the.utility.Utility;
import org.openqa.selenium.By;

public class LoginProcessPage extends Utility {

    By emailField = By.id("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
    By errorMessage = By.xpath("//div[@id='flash']");
    By welcomeMessage =By.xpath("//h4[@class ='subheader']");


    //sending email address
    public void enterUsername(String email)
    {
        sendTextToElement(emailField,email);
    }
    // sending password
    public void enterPassword(String password){

        sendTextToElement(passwordField,password);
    }
    // clicking on login button
    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }
    // checking welcome message when user logged in with valid credentials

    public void checkWelcomeMessage(){


    }

    public String welcomeMessageReceived(){

        return getTextFromElement(welcomeMessage);
    }

    // this method will return error message when user have entered wrong credentials
    public String errorMessageReceived(){

        return getTextFromElement(errorMessage);
    }




}
