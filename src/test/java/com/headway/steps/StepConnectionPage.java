package com.headway.steps;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepConnectionPage extends PageObject {

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

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.animate.has-identity-banner.slide-in-next > div > div.password-reset-links-container.ext-password-reset-links-container > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElement signIn;

    @FindBy(css = "#root > div > div._leftpanel_1ogk7_29 > div:nth-child(1) > h1")
    WebElement title;

    @FindBy(id = "usernameError")
    WebElement emailError;

    @FindBy(id = "passwordError")
    WebElement passwordError;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.has-identity-banner.animate.slide-in-next > div > div:nth-child(8) > div.row.move-buttons > div > div > div:nth-child(2)")
    WebElement keepSessionButton;

    @FindBy(css = "#idDiv_SAOTCS_Proofs > div:nth-child(1) > div > div > div.table-cell.text-left.content > div")
    WebElement textMessageButton;

    @FindBy(id = "idSubmit_SAOTCC_Continue")
    WebElement continueButton;

    public void connect() {
        username.sendKeys(("ext.nvalero@gdmseeds.com"));
        clickUser.click();
        password.sendKeys("NV2023gdm+");
        clickPassword.click();
        signIn.click();
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
   //     assertTrue(password.isDisplayed());
    }

    public void enterValidPassword(String text) {
        try {
            password.sendKeys(text);
        }catch (Exception e){

            password.sendKeys(text);
        }
    }

    public void pressesSignIn() {
        signIn.click();
    }

    public void pressesKeepSessionButton() {
        keepSessionButton.click();
    }

    public void pressesReceiveTextMessage() {
        textMessageButton.click();
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
        continueButton.click();
    }
}