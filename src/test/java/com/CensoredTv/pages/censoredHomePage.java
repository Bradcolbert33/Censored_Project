package com.CensoredTv.pages;

import com.CensoredTv.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class censoredHomePage {

    public censoredHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@type='text']")
    public WebElement homePageSearchButton;
}
