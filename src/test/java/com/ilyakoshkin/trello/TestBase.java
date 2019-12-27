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
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        openSite("https://trello.com/ ");


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

    public boolean isAvatarPresentOnHeader() {
        return isElementPresent
                (By.cssSelector("[data-test-id='header-member-menu-button']"));
    }

    public  boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }


    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void logout() throws InterruptedException {

        click(By.cssSelector("[data-test-id='header-member-menu-button']"));

        click(By.cssSelector("[data-test-id='header-member-menu-logout']"));
    pause(15000);
    }



    public void clickConfirmCreateBoardButton() throws InterruptedException {
    click(By.cssSelector("[data-test-id='create-board-submit-button']"));
    pause(5000);
}

    public void clickConfirmMakeBoardPublicButton() throws InterruptedException {
    click(By.xpath("//button[@class='_3UeOvlU6B5KUnS _2MgouXHqRQDP_5 _3ZPeWh5QQj47DA']"));
    pause(5000);
}

    public void clickCreateBoardPublic() throws InterruptedException {
    click(By.xpath("//div[@id='layer-manager-popover']//li[2]//button[1]"));
    pause(5000);
}

    public void selectCreateBoardFromDropDownPrivatePublic() throws InterruptedException {
    click(By.xpath("//button[@class='_1Lkx3EjS3wCrs7']//span[@name='down']"));
    pause(5000);
}

    public void selectCreateBoardFromDropDownNoteam() throws InterruptedException {
    click(By.xpath("//button[@class='W6rMLOx8U0MrPx']//span[@name='down']"));
    pause(5000);
    click(By.xpath("//span[@class='_1uK2vQ_aMRS2NU']"));
    pause(5000);
}

    public void inputCreateBoardTitle() {
    Type(By.cssSelector("[data-test-id='create-board-title-input']"), "MyTestBoard");
}

    public void clickCreateBoardButton() throws InterruptedException {
    click(By.cssSelector("[data-test-id='header-create-board-button']"));
    pause(5000);
}

    public void clickPlusButton() throws InterruptedException {
    click(By.cssSelector("[data-test-id='header-create-menu-button']"));
    pause(5000);
}
}
