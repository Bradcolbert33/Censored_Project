package com.CensoredTv.tests.base;

import com.CensoredTv.utilities.ConfigurationReader;
import com.CensoredTv.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class testBase {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        String browser = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }


}
