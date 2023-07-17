package com.headway.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class SuccessCreateSeriePage extends BasePage {

    @FindBy(css = ".MuiDialog-root ._title_x6167_5")
    WebElement createdMessage;

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

    private static final String SERIE_NAME_LOCATOR_TEMPLATE = "NOMBREX";

    public void validateCreatedMessage(String message) {
        assertEquals(createdMessage.getText(), message);
    }

    public void logoCreatedMessageIsDisplayed() {
        assertTrue(logoCreatedMessage.isDisplayed());
    }

    public void crossCreatedMessageIsDisplayed() {
        assertTrue(crossCreatedMessage.isDisplayed());
    }

    public void longCreatedMessageIsCorrect() {
        assertTrue(longCreatedMessage.getText().contains(SERIE_NAME_LOCATOR_TEMPLATE));
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
