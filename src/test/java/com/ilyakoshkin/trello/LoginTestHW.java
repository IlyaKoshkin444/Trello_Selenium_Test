package com.ilyakoshkin.trello;

import org.testng.annotations.Test;

public class LoginTestHW extends TestBase{

    @Test
    public void testLoginHW() throws InterruptedException {
        openSite("https://trello.com/ ");

        fillLoginForm();

    }


}

