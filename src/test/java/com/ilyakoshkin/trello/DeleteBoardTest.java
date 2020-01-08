package com.ilyakoshkin.trello;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteBoardTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditionsTestDeleteBoard() throws InterruptedException {
    if (!app.isAvatarPresentOnHeader()) {
       app.fillLoginForm();
        }
    }

    @Test
    public void testDeleteBoard() throws InterruptedException {
        int before = app.getBoardsCount();

        app.clickIconBoard();
        app.clickBoardMenuBackButton();
        app.clickBoardMenuOpenMore();
        app.clickBoardMenuCloseBoard();
        app.clickConfirmCloseBoard();
        app.clickPermanentlyDeleteBoard();
        app.clickConfirmPermanentlyDeleteBoard();
        app.returnToHomePage();

        int after = app.getBoardsCount();
        Assert.assertEquals(after, before - 1);
        System.out.println("Count Boards after delete is: " + after);
    }

}
