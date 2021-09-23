package com.CensoredTv.pages;

import com.CensoredTv.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class censoredLoginPage {

    public censoredLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='email']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@id='login-submit-button']")
    public WebElement login;
}
