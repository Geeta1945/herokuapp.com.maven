package com.herokuapp.internet.the.testbase;

import com.herokuapp.internet.the.utility.Utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    // set up browser
    String browser="chrome";
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);

    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }

}
