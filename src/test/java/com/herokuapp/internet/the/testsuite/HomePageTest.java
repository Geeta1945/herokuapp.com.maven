package com.herokuapp.internet.the.testsuite;

import com.herokuapp.internet.the.pages.HomePage;
import com.herokuapp.internet.the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test

    public void isLoginMessageDisplayed(){

        HomePage homePageObj = new HomePage();
        String expectedMessage ="Login Page";
      String actualMessage =  homePageObj.checkUserIsOnLoginPage();
        Assert.assertEquals(actualMessage,expectedMessage);

    }
}
