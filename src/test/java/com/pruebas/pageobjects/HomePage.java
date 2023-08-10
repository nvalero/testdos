package com.headway.pageobjects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy(css = "#root > div > header > div > div > section > h1 > span")
    WebElement title;

    public void validate() {
        waitForElement().until(ExpectedConditions.visibilityOf(title));
        assertEquals(title.getText(), "Series Manager");
    }

}