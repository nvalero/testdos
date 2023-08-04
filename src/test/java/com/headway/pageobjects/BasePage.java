package com.headway.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasePage extends PageObject {

    public String getValueInAttributteInField(By by, String  attribute) {
        return getDriver().findElement(by).getAttribute(attribute);
    }

    public void validateValues(String firstValue, String secondValue) {
        assertEquals(firstValue, secondValue);
    }

    public void validatePageIsDisplayed(String url) {
        waitFor(ExpectedConditions.urlContains(url));
    }

    public void validateByIsDisplayed(By by, boolean isDisplayed) {
        boolean foundElement;
        try{
            foundElement = getDriver().findElement(by).isDisplayed();
        } catch (Exception exception){
            foundElement = false;
        }
        assertEquals(isDisplayed, foundElement);
    }

    public void webElementIsEnabled(By by, boolean isEnabled) {
        boolean foundElement;
        try{
            foundElement = getDriver().findElement(by).isEnabled();
        } catch (Exception exception){
            foundElement = false;
        }
        assertEquals(isEnabled, foundElement);
    }

    public void sleep(long i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
        }
    }

    public boolean isByDisplayed(By by, boolean isDisplayed) {
        boolean foundElement;
        try{
            foundElement = getDriver().findElement(by).isDisplayed();
        } catch (Exception exception){
            foundElement = false;
        }
        return isDisplayed == foundElement;
    }
}
