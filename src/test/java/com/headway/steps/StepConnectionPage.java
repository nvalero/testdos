package com.headway.steps;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepConnectionPage extends PageObject {

    @FindBy(css = "#i0116")
    WebElementFacade username;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div > div > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElementFacade clickUser;

    @FindBy(css = "#i0118")
    WebElementFacade password;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.animate.has-identity-banner.slide-in-next > div > div.password-reset-links-container.ext-password-reset-links-container > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElementFacade clickPassword;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.has-identity-banner.animate.slide-in-next" +
            " > div > div.password-reset-links-container.ext-password-reset-links-container > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElementFacade Next1;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.animate.has-identity-banner.slide-in-next > div > div.password-reset-links-container.ext-password-reset-links-container > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElementFacade signIn;

    @FindBy(css = "#root > div > div._leftpanel_1ogk7_29 > div:nth-child(1) > h1")
    WebElementFacade title;

    @FindBy(id = "passwordError")
    WebElementFacade passwordError;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.has-identity-banner.animate.slide-in-next > div > div:nth-child(8) > div.row.move-buttons > div > div > div:nth-child(2)")
    WebElementFacade keepSessionButton;

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

    public void enterValidEmail() {
        username.sendKeys(("ext.nvalero@gdmseeds.com"));
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

    public void enterValidPassword() {
        password.sendKeys(("NV2023gdm+"));
    }

    public void pressesSignIn() {
        signIn.click();
    }

    public void pressesKeepSessionButton() {
        keepSessionButton.click();
    }

    public void validateEmailMessage(String message) {
            assertEquals(this.title.getText(), message);
    }

    public void validatePasswordMessage(String message) {
        assertEquals(this.passwordError.getText(), message);
    }
    public void enterInvalidPassword(String password) {
        this.password.sendKeys(password);
    }
}