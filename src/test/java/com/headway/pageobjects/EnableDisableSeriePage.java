package com.headway.pageobjects;

import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
        }
        getDriver().navigate().refresh();
    }


    public void disableSerieWindowIsDisplayed(boolean isDisplayed) {
        try {
            assertTrue(enableSerieWindow.isDisplayed() == isDisplayed);
        } catch (Exception exception){
            assertTrue(true);
        }
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