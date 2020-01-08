package com.ilyakoshkin.trello;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 public class CreateBoardTest extends TestBase {

     @BeforeMethod
     public void ensurePreconditionsTestCreateBoard() throws InterruptedException {
         if (!app.isAvatarPresentOnHeader()) {
             app.fillLoginForm();
         }

     }

         @Test
         public void testCreateBoard () throws InterruptedException {
             int before = app.getBoardsCount();
             app.clickPlusButton();
             app.clickCreateBoardButton();
             app.inputCreateBoardTitle();
             app.selectCreateBoardFromDropDownNoteam();
             app.selectCreateBoardFromDropDownPrivatePublic();
             app.clickCreateBoardPublic();
             app.clickConfirmMakeBoardPublicButton();
             app.clickConfirmCreateBoardButton();
             app.returnToHomePage();


             int after = app.getBoardsCount();
             Assert.assertEquals(after, before + 1);
             System.out.println("Count Boards after create is: " + after);
         }
      @AfterClass
     public void postActions() throws InterruptedException {
      int boardsCount =  app.getBoardsCount();
      while (boardsCount>4){
          app.deleteBoard();
          boardsCount =  app.getBoardsCount();
      }



 }

 }