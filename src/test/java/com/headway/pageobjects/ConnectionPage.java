package com.headway.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConnectionPage extends BasePage {

    By username = By.cssSelector("#i0116");

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div > div > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElement clickUser;

    By password = By.id("i0118");

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.animate.has-identity-banner.slide-in-next > div > div.password-reset-links-container.ext-password-reset-links-container > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElement clickPassword;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.has-identity-banner.animate.slide-in-next" +
            " > div > div.password-reset-links-container.ext-password-reset-links-container > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElement Next1;

    By signinButton = By.id("idSIButton9");

    @FindBy(css = "#root > div > div._leftpanel_1ogk7_29 > div:nth-child(1) > h1")
    WebElement title;

    @FindBy(id = "usernameError")
    WebElement emailError;

    @FindBy(id = "passwordError")
    WebElement passwordError;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.has-identity-banner.animate.slide-in-next > div > div:nth-child(8) > div.row.move-buttons > div > div > div:nth-child(2)")
    WebElement keepSessionButton;

    @FindBy(css = "div[data-bind='text: display']")
    WebElement textMessageButton;

    @FindBy(id = "idChkBx_SAOTCC_TD")
    WebElement enterCodeCheckbox;

    @FindBy(id = "idSubmit_SAOTCC_Continue")
    WebElement verifyButton;

    @FindBy(id = "KmsiCheckboxField")
    WebElement staySingInCheckbox;

    By yesButton = By.id("idSIButton9");

    public void connect() {
        waitForElement().until(ExpectedConditions.presenceOfElementLocated(username));
        getDriver().findElement(username).sendKeys(("ext.nvalero@gdmseeds.com"));
        clickUser.click();
        getDriver().findElement(password).sendKeys("NV2023gdm+");
        clickPassword.click();
        getDriver().findElement(signinButton).click();
    }

    public void validate(String title) {
        assertEquals(this.title.getText(), title);
    }

    public void validatesMicrosoftPopOpens() {
        waitForElement().until(ExpectedConditions.visibilityOfElementLocated(username));
        assertTrue(getDriver().findElement(username).isDisplayed());
    }

    public void enterValidEmail(String text) {
        getDriver().findElement(username).sendKeys(text);
    }

    public void enterInvalidEmail(String email) {
        getDriver().findElement(username).sendKeys(email);
    }

    public void pressesNext() {
        clickUser.click();
    }

    public void validatesMicrosoftPasswordIsShown() {
        sleep(2000);
        webElementIsDisplayed(password, true);
        assertTrue(getDriver().findElement(password).isDisplayed());
    }

    public void enterValidPassword(String text) {
        try {
            waitForElement().until(ExpectedConditions.presenceOfElementLocated(By.id("i0118")));
            getDriver().findElement(password).sendKeys(text);
        }catch (Exception e){
            waitForElement().until(ExpectedConditions.presenceOfElementLocated(By.id("i0118")));
            getDriver().findElement(password).sendKeys(text);
        }
    }

    public void pressesSignIn() {
        try {
            waitForElement().until(ExpectedConditions.elementToBeClickable(signinButton));
            getDriver().findElement(signinButton).click();
        }catch (Exception e){
            waitForElement().until(ExpectedConditions.elementToBeClickable(signinButton));
            getDriver().findElement(signinButton).click();
        }
    }

    public void pressesKeepSessionButton() {
        try {
            waitFor(ExpectedConditions.presenceOfElementLocated(By.id("idSIButton9")));
            getDriver().findElement(yesButton).click();
        } catch (Exception e){
            waitFor(ExpectedConditions.presenceOfElementLocated(By.id("idSIButton9")));
            getDriver().findElement(yesButton).click();
        }
        waitFor(ExpectedConditions.invisibilityOfElementLocated(yesButton));
        waitFor(ExpectedConditions.invisibilityOfElementLocated((By.cssSelector(
                ".loadingspinner_1wi9x_25"))));
    }

    public void pressesReceiveTextMessage() {
        textMessageButton.click();
        sleep(20000);
    }

    public void validateEmailMessage(String message) {
            assertEquals(this.emailError.getText(), message);
    }

    public void validatePasswordMessage(String message) {
        assertEquals(this.passwordError.getText(), message);
    }

    public void enterInvalidPassword(String password) {
        getDriver().findElement(this.password).sendKeys(password);
    }

    public void pressesContinueButton() {
        verifyButton.click();
    }

    public void staySignInCheckbox() {
        staySingInCheckbox.click();
    }

    public void staySignInYesButton() {
        getDriver().findElement(yesButton).click();
    }

    public void quitDriver() {
        getDriver().quit();
    }
}