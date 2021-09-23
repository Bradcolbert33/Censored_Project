package com.CensoredTv.tests.base;

import com.CensoredTv.pages.censoredLoginPage;
import com.CensoredTv.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest {

    @Test
    public void censored_Login_Test() throws InterruptedException {

        //1- Get https://censored.tv/login
        Driver.getDriver().get("https://censored.tv/login");

        //create object of class
        censoredLoginPage censoredLoginPageButton = new censoredLoginPage();

        //1- login to censored.tv
        censoredLoginPageButton.username.sendKeys("bradcolbert33@gmail.com");
        censoredLoginPageButton.password.sendKeys("OgLm042(9@Bc");
        censoredLoginPageButton.login.click();
    }
}
