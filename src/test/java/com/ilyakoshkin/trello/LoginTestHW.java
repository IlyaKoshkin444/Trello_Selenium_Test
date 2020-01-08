package com.ilyakoshkin.trello;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestHW extends TestBase{

    @BeforeMethod

    public void ensurePreconditions() throws InterruptedException {
    if(app.isAvatarPresentOnHeader()){
        app.logout();
    }
    }

    @Test
    public void testLoginHW() throws InterruptedException {

        app.fillLoginForm();
        Assert.assertTrue
                (app.isAvatarPresentOnHeader());

    }

    @Test
    public void testLoginHW1() throws InterruptedException {


        app.fillLoginForm();
        Assert.assertTrue
                (app.isAvatarPresentOnHeader());

    }

}

