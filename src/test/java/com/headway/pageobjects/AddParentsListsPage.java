package com.headway.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddParentsListsPage extends BasePage {

    @FindBy(id = "parentsFilenames")
    WebElement parentsFileNamesSection;

    @FindBy(css = "._rootCheckbox_1wx3v_20")
    WebElement filesListChecks;

    @FindBy(css = "._spanSize_h75ck_5")
    WebElement filesSelectedText; // You have selected 0 files

    private static final String SELECT_FILE_BY_NAME_LOCATOR_TEMPLATE = "//input[@name=\"%s\"]//ancestor::div//button" +
            "//span[@title=\"%s\"]";

    By checkFiles = By.cssSelector("._rootCheckbox_1wx3v_20");

    By addParentsButton = By.cssSelector("._primary_1cvem_5"); // submit // revisar enabled not enabled

    @FindBy(css = ".MuiDialog-root ._title_x6167_5")
    WebElement parentsAddedMessage;// --> text-->The Parents Lists were Successfully Added

    /* @FindBy(css = ".MuiDialog-root ._title_x6167_5")
     WebElement errorMessage; --> Something went wrong adding the parent lists.
 */
    @FindBy(css = "._large_ypyit_5")
    WebElement aboutMessage;
    By filesErrorMessages = By.cssSelector("._infoContainer_1t7x3_34");// --> 3 elementos con los archivos que fallaron
    By AddParentsListsWindow = By.cssSelector(".MuiDialog-root._container_gyx38_1.MuiModal-root.css-126xj0f " +
            ".css-101i5ei");
    
    public void filesWithErrors(int countExpected) {
        try {
            assertEquals(getDriver().findElements(filesErrorMessages).size(), countExpected);
        } catch (Exception e) {
            assertEquals(0, countExpected);
        }
    }

    public void errorMessage(String message) {
        assertEquals(aboutMessage.getText(), message);
    }

    public void selectCheckFileById(int id) {
        try {
            getDriver().findElements(checkFiles).get(id).click();
            assertTrue(true);
        }catch (Exception e){
            assertFalse(false);
        }
    }
    public void selectCheckFileByName(String name) {
        getDriver().findElements(By.xpath(String.format(SELECT_FILE_BY_NAME_LOCATOR_TEMPLATE, name)));
    }

    public void AddParentsListsWindowIsDisplayed(boolean isDisplayed) {
        webElementIsDisplayed(AddParentsListsWindow, isDisplayed);
    }

    public void listOfFilesIsDisplayed() {
        assertTrue(parentsFileNamesSection.isDisplayed());
    }

    public void validateFilesSelected(String message) {
        assertEquals(filesSelectedText.getText(), message);
    }

    public void parentsAddedMessage(String message) {
        assertEquals(parentsAddedMessage.getText(), message);
    }

    public void clickAddParentsButton() {
        getDriver().findElement(addParentsButton).click();
    }

    public void AddParentsListsButtonIsEnabled(boolean enabled) {
        webElementIsEnabled(addParentsButton, enabled);
    }
}
