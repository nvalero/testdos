package com.headway.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class StepHomePage extends PageObject {

    @FindBy(css = "#i0116")
    WebElementFacade username;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div > div > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElementFacade clickUser;

    @FindBy(css = "#i0118")
    WebElementFacade password;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.animate.has-identity-banner.slide-in-next > div > div.password-reset-links-container.ext-password-reset-links-container > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElementFacade clickPassword;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.has-identity-banner.animate.slide-in-next" +
            " > div > div:nth-child(8) > div.row.move-buttons > div > div > div:nth-child(2)")
    WebElementFacade Next2;

    @FindBy(css = "#root > div > header > div > div > section > h1 > span")
    WebElementFacade title;

    public void connect() {
        username.sendKeys(("ext.nvalero@gdmseeds.com"));
        clickUser.click();
        password.sendKeys("NV2023gdm+");
        clickPassword.click();
        Next2.click();
    }

    public void validate() {
        assertEquals(title.getText(), "Series Manager");
    }

}