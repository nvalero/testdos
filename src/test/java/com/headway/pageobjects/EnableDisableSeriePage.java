package com.headway.pageobjects;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnableDisableSeriePage extends BasePage {

    @Inject
    LocatorsDictionary locatorsDictionary = new LocatorsDictionary();

    @FindBy(id = "description")
    WebElement description;

    @FindBy(css = "._secondary_1cvem_39")
    WebElement cancelButton;

    @FindBy(css = "._loading_1cvem_110")
    WebElement submit;

    @FindBy(css = ".MuiDialog-root")
    WebElement enableSerieWindow;

    @FindBy(css = "._large_ypyit_5")
    WebElement aboutMessage;

    @FindBy(css = ".MuiDialog-root ._icon_41q16_1 svg")
    WebElement crossMessage;

    public void editDescription(String description) {
        this.description.sendKeys(description);
    }

    public void descriptionIsDisplayed() {
        description.isDisplayed();
    }

    public void cancelButtonIsDisplayed() {
        cancelButton.isDisplayed();
    }

    public void clickSubmit() {
        submit.click();
        disableSerieWindowIsDisplayed(false);
        getDriver().navigate().refresh();
    }

    public void disableSerieWindowIsDisplayed(boolean isDisplayed) {
        boolean foundElement;
        try {
            if (isDisplayed) {
                waitFor(ExpectedConditions.visibilityOf(enableSerieWindow));
                foundElement = true;
            }else {
                waitFor(ExpectedConditions.not(ExpectedConditions.visibilityOf(enableSerieWindow)));
                foundElement = false;
            }
        } catch (Exception exception){
            foundElement = false;
        }
        assertEquals(isDisplayed, foundElement);
    }

    public void aboutMessageIsDisplayed() {
        assertTrue(aboutMessage.getText().equals("You are about to create a series in the crop category \"soybean\". " +
                "You must complete the required fields to continue."));
    }

    public void submitIsDisplayed() {
        assertTrue(submit.isDisplayed());
    }

    public void pressesCrossButton() {
        crossMessage.click();
    }

    public void pressesCancelButton() {
        cancelButton.click();
    }
}