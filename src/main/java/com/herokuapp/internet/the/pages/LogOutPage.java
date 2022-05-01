package com.herokuapp.internet.the.pages;

import com.herokuapp.internet.the.utility.Utility;
import org.openqa.selenium.By;

public class LogOutPage extends Utility {

    By logoutButton = By.xpath("//a[@class='button secondary radius']");


    public void clickOnLogoutButton(){

        mouseHoverToElementAndClick(logoutButton);

    }


}
