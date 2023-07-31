package com.headway.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class SuccessCreateSeriePage extends BasePage {

    @FindBy(css = ".MuiDialog-root ._title_x6167_5")
    WebElement logoCreatedMessage;

    @FindBy(css = ".MuiDialog-root ._icon_41q16_1 svg")
    WebElement crossCreatedMessage;

    @FindBy(css = "._container_1iw2j_1._drawerContent_1t7x3_25")
    WebElement longCreatedMessage;

    @FindBy(css = "._secondary_1cvem_39")
    WebElement goToSeriesButton;

    @FindBy(css = "._primary_1cvem_5")
    WebElement addParentsButton;

    By createdMessage = By.cssSelector(".MuiDialog-root ._title_x6167_5");

    private static final String LONG_MESSAGE_LOCATOR_TEMPLATE = "has been successfully created. Now you can go back to the " +
            "beginning or add the list of parents.";

    public void validateCreatedMessage(String message) {
        sleep(10000);
        waitFor(ExpectedConditions.textToBePresentInElementLocated(createdMessage, message));
        assertEquals(getDriver().findElement(createdMessage).getText(), message);
    }

    public void logoCreatedMessageIsDisplayed() {
        assertTrue(logoCreatedMessage.isDisplayed());
    }

    public void crossCreatedMessageIsDisplayed() {
        assertTrue(crossCreatedMessage.isDisplayed());
    }

    public void longCreatedMessageIsCorrect() {
        assertTrue(longCreatedMessage.getText().contains(LONG_MESSAGE_LOCATOR_TEMPLATE));
    }

    public void goToSeriesButtonIsDisplayed() {
        assertTrue(goToSeriesButton.isDisplayed());
    }

    public void addParentsButtonButtonIsDisplayed() {
        assertTrue(addParentsButton.isDisplayed());
    }

    public void clickGoToSeries() {
        goToSeriesButton.click();
    }

    public void clickAddParents() {
        addParentsButton.click();
    }

}
