package com.ilyakoshkin.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testLogin() throws InterruptedException {

        //clicLogin
        clickLoginLink();

    }
    public void clickLoginLink() throws InterruptedException {
        app.InitLogin();
        app.Type(By.id("user"), "eliyahu.kosh44@gmail.com");
        app.pause(10000);
       if (app.isPassword()){
           app.Type(By.id("password"), "trel23081967");
        }
        app.clickLogin("login");
        if (isElementPresent(By.id("login-submit"))){
            app.clickLogin("login-submit");
            app.Type(By.id("password"), "trel23081967");
            app.clickLogin("login-submit");
        app.pause(20000);

         }




    }

    public boolean isElementPresent(By locator){
     return ApplicationManager.wd.findElements(locator).size()>0;
    }


    }

