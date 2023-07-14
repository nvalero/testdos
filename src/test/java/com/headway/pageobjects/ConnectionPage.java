package com.headway.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConnectionPage extends PageObject {

    @FindBy(css = "#i0116")
    WebElement username;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div > div > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElement clickUser;

    @FindBy(id = "i0118")
    WebElement password;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.animate.has-identity-banner.slide-in-next > div > div.password-reset-links-container.ext-password-reset-links-container > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElement clickPassword;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.has-identity-banner.animate.slide-in-next" +
            " > div > div.password-reset-links-container.ext-password-reset-links-container > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElement Next1;

    @FindBy(id = "idSIButton9")
    WebElement signinButton;

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

    @FindBy(id = "idSIButton9")
    WebElement yesButton;

    public void connect() {
        username.sendKeys(("ext.nvalero@gdmseeds.com"));
        clickUser.click();
        password.sendKeys("NV2023gdm+");
        clickPassword.click();
        signinButton.click();
    }

    public void validate(String title) {
        assertEquals(this.title.getText(), title);
    }

    public void validatesMicrosoftPopOpens() {
        assertTrue(username.isDisplayed());
    }

    public void enterValidEmail(String text) {
        username.sendKeys(text); //ext.hmartin@gdmseeds.com"));
    }

    public void enterInvalidEmail(String email) {
        username.sendKeys(email);
    }

    public void pressesNext() {
        clickUser.click();
    }

    public void validatesMicrosoftPasswordIsShown() {
        assertTrue(password.isDisplayed());
    }

    public void enterValidPassword(String text) {
        try {
            password.sendKeys(text);
        }catch (Exception e){
            password.sendKeys(text);
        }
    }

    public void pressesSignIn() {
        signinButton.click();
    }

    public void pressesKeepSessionButton() {
        yesButton.click();
    }

    public void pressesReceiveTextMessage() {
        textMessageButton.click();
        try {
            Thread.sleep(20000); // Wait for 20 seconds
        } catch (InterruptedException e) {
            // Handle InterruptedException
        }
    }

    public void validateEmailMessage(String message) {
            assertEquals(this.emailError.getText(), message);
    }

    public void validatePasswordMessage(String message) {
        assertEquals(this.passwordError.getText(), message);
    }

    public void enterInvalidPassword(String password) {
        this.password.sendKeys(password);
    }

    public void pressesContinueButton() {
        verifyButton.click();
    }

    public void staySignInCheckbox() {
        staySingInCheckbox.click();
    }

    public void staySignInYesButton() {
        yesButton.click();
    }

    public void quitDriver() {
        getDriver().quit();
    }
}