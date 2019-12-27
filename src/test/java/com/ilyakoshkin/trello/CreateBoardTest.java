package com.ilyakoshkin.trello;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 public class CreateBoardTest extends TestBase {

     @BeforeMethod

     public void ensurePreconditionsTestCreateBoard() throws InterruptedException {
         if(!isAvatarPresentOnHeader()){
             fillLoginForm();
         }
     }
     @Test
     public void testCreateBoard () throws InterruptedException {

         clickPlusButton();
         clickCreateBoardButton();
         inputCreateBoardTitle();
         selectCreateBoardFromDropDownNoteam();
         selectCreateBoardFromDropDownPrivatePublic();
         clickCreateBoardPublic();
         clickConfirmMakeBoardPublicButton();
         clickConfirmCreateBoardButton();
     }

 }
