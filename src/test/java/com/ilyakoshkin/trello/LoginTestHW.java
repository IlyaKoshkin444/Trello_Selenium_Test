package com.ilyakoshkin.trello;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestHW extends TestBase{

    @BeforeMethod

    public void ensurePreconditions() throws InterruptedException {
    if(isAvatarPresentOnHeader()){
        logout();
    }
    }

    @Test
    public void testLoginHW() throws InterruptedException {
        openSite("https://trello.com/ ");

        fillLoginForm();
        Assert.assertTrue
                (isAvatarPresentOnHeader());

    }

    @Test
    public void testLoginHW1() throws InterruptedException {
        openSite("https://trello.com/ ");

        fillLoginForm();
        Assert.assertTrue
                (isAvatarPresentOnHeader());

    }

}

