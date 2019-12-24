package com.ilyakoshkin.trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    @AfterClass
    public void tearDown() {
        wd.quit();

    }
    public void openSite(String url) {
        wd.get(url);
    }

    protected void fillLoginForm() throws InterruptedException {
        InitLogin();
        Type(By.id("user"), "eliyahu.kosh44@gmail.com");
        pause(10000);
        clickLogin("login");
        clickLogin("login-submit");
        Type(By.id("password"), "trel23081967");
        clickLogin("login-submit");
        pause(20000);
    }

    protected void Type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    protected void clickLogin(String login) {
        wd.findElement(By.id(login)).click();
    }

    protected void InitLogin() {
        wd.findElement(By.cssSelector("[href='/login']")).click();
    }

    protected void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}