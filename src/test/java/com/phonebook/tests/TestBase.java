package com.phonebook.tests;

import com.phonebook.fw.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser",
            Browser.CHROME.browserName()));

//    @BeforeMethod
    @BeforeSuite
    public void setUP(){
        app.init();
    }

//    @AfterMethod(enabled = false)
    @AfterSuite
    public void tearDown(){
        app.stop();
    }
}
