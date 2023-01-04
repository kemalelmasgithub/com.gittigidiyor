package com.gittigidiyor.test;

import com.gittigidiyor.base.BaseTest;


import com.gittigidiyor.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    @Before
    public void before(){
        loginPage = new LoginPage(getWebDriver());
    }

    @Test
    public void test(){
        loginPage.sendKeysSearchBox();
        loginPage.clickSubmitButton();
        loginPage.popupKapatma();
        loginPage.scroll();
        loginPage.secondPage();






    }
    @After
    public void after(){
        //tearDown();
    }

}
