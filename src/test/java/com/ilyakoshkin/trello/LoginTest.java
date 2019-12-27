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
        InitLogin();
        Type(By.id("user"), "eliyahu.kosh44@gmail.com");
        pause(10000);
       if (wd.findElement(By.id("password")).isDisplayed()){
           Type(By.id("password"), "trel23081967");
        }
        clickLogin("login");
        if (isElementPresent(By.id("login-submit"))){
            clickLogin("login-submit");
            Type(By.id("password"), "trel23081967");
            clickLogin("login-submit");
        pause(20000);

         }




    }

    public boolean isElementPresent(By locator){
     return wd.findElements(locator).size()>0;
    }


    }

