package com.ilyakoshkin.trello;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 public class CreateBoardTest extends TestBase {

     @BeforeMethod
     public void LogIn() throws InterruptedException {
         openSite("https://trello.com/ ");

         fillLoginForm();
     }

         @Test
         public void testCreateBoard () throws InterruptedException {

             click(By.cssSelector("[data-test-id='header-create-menu-button']"));
             pause(5000);
             click(By.cssSelector("[data-test-id='header-create-board-button']"));
             pause(5000);
             Type(By.cssSelector("[data-test-id='create-board-title-input']"), "MyTestBoard");
             click(By.xpath("//button[@class='W6rMLOx8U0MrPx']//span[@name='down']"));
             pause(5000);
             click(By.xpath("//span[@class='_1uK2vQ_aMRS2NU']"));
             pause(5000);
             click(By.xpath("//button[@class='_1Lkx3EjS3wCrs7']//span[@name='down']"));
             pause(5000);
             click(By.xpath("//div[@id='layer-manager-popover']//li[2]//button[1]"));
             pause(5000);
             click(By.xpath("//button[@class='_3UeOvlU6B5KUnS _2MgouXHqRQDP_5 _3ZPeWh5QQj47DA']"));
             pause(5000);
             click(By.cssSelector("[data-test-id='create-board-submit-button']"));
             pause(5000);
         }

 }
