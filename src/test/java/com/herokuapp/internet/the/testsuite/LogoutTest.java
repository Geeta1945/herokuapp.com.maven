package com.herokuapp.internet.the.testsuite;

import com.herokuapp.internet.the.pages.LogOutPage;
import com.herokuapp.internet.the.testbase.TestBase;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {
    // check whether logout button is clicked and take you to home page again
    @Test
        public void checkLogoutButton(){

        LogOutPage logOutPageObj = new LogOutPage();
        HomePageTest homePageTestObj =new HomePageTest();

        LoginPageTest loginPageTestObj = new LoginPageTest();

        loginPageTestObj.userShouldLoginSuccessfullyWithValidCredentials();
        logOutPageObj.clickOnLogoutButton();
        homePageTestObj.isLoginMessageDisplayed();


    }
}
