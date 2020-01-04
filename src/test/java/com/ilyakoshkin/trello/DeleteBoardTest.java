package com.ilyakoshkin.trello;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteBoardTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditionsTestDeleteBoard() throws InterruptedException {
    if (!isAvatarPresentOnHeader()) {
       fillLoginForm();
        }
    }

    @Test
    public void testDeleteBoard() throws InterruptedException {
        int before = getBoardsCount();


        clickIconBoard();
        clickBoardMenuBackButton();
        clickBoardMenuOpenMore();
        clickBoardMenuCloseBoard();
        clickConfirmCloseBoard();
        clickPermanentlyDeleteBoard();
        clickConfirmPermanentlyDeleteBoard();
        returnToHomePage();

        int after = getBoardsCount();
        Assert.assertEquals(after, before - 1);
        System.out.println("Count Boards after delete is: " + after);
    }

}
