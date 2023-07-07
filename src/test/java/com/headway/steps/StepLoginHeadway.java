package com.headway.steps;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StepLoginHeadway extends PageObject {

    @FindBy(css = "#root > div > div._leftpanel_1ogk7_29 > div:nth-child(1) > button")
    WebElement login;

    public void clickLogin() {
        login.click();
    }
}