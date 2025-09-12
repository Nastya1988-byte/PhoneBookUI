package com.phonebook.tests;

import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateAccountTests extends TestBase {
    SoftAssert softAssert = new SoftAssert();

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {
//        int i = (int)((System.currentTimeMillis()/1000)%3600);
        app.getUser().clickOnLoginLink();
        app.getUser().fillRegisterLoginForm(new User().setEmail("test258phone$@gmail.com").setPassword("Nastya12#!"));
        app.getUser().clickOnRegistretionButton();
        Assert.assertTrue(app.getUser().isSignOutButtonPresent());//css div:nth-child(1) button
    }


    @Test()
    public void existetUserRegistrationNegative() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillRegisterLoginForm(new User().setEmail("test258phone$@gmail.com").setPassword("Nastya12#!"));
        app.getUser().clickOnRegistretionButton();
        softAssert.assertTrue(app.getUser().isAlertDisplayed());
        softAssert.assertTrue(app.getUser().isErroeMessagePresent());
        softAssert.assertAll();
    }

}
