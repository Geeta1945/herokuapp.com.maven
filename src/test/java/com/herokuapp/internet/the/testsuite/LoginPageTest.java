package com.herokuapp.internet.the.testsuite;

import com.herokuapp.internet.the.pages.LoginProcessPage;
import com.herokuapp.internet.the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginProcessPage loginProcessPageObj = new LoginProcessPage();

    //1. when user enter valid credentials
    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials() {

        loginProcessPageObj.enterUsername("tomsmith");
        loginProcessPageObj.enterPassword("SuperSecretPassword!");
        loginProcessPageObj.clickOnLoginButton();

        String actualWelcomeMessage = loginProcessPageObj.welcomeMessageReceived();
        Assert.assertTrue(actualWelcomeMessage.contains("Welcome to the Secure Area. When you are done click logout below."),"You haven't entered right credentials");


    }

    //2. When user enter invalid username

    @Test

    public void verifyTheUsernameErrorMessage() {
        loginProcessPageObj.enterUsername("tomsmith1");
        loginProcessPageObj.enterPassword("SuperSecretPassword!");
        loginProcessPageObj.clickOnLoginButton();
        String expectedErrorMessage = " Your username is invalid!";
        String actualErrorMessage = loginProcessPageObj.errorMessageReceived();

        // Here assertTrue is checking whether the condition given is true or not and if not then will throw AssertionError.
        Assert.assertTrue(actualErrorMessage.contains("Your username is invalid!"), "You are not on right page");

    }
    //3. when User Enter Invalid Password - Your password is invalid!

    @Test
    public void verifyThePasswordErrorMessage()
    {
        loginProcessPageObj.enterUsername("tomsmith");
        loginProcessPageObj.enterPassword("SuperSecretPassword");
        loginProcessPageObj.clickOnLoginButton();
        String expectedErrorMessage = "Your password is invalid!!";
        String actualErrorMessage = loginProcessPageObj.errorMessageReceived();

        // Here assertTrue is checking whether the condition given is true or not and if not then will throw AssertionError.

        Assert.assertTrue(actualErrorMessage.contains("Your password is invalid!"), "You are not on right page");


    }
}