package com.headway.pageobjects;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateSeriePage extends BasePage {

    @Inject
    LocatorsDictionary locatorsDictionary = new LocatorsDictionary();

    @FindBy(id = "description")
    WebElement description;

    @FindBy(css = "._loading_1cvem_110")
    WebElement submit;

    @FindBy(css = ".MuiDialog-root._container_gyx38_1.MuiModal-root.css-126xj0f .css-101i5ei ._header_11e1g_27")
    WebElement createSerieWindow;

    @FindBy(css = "._large_ypyit_5")
    WebElement aboutMessage;

    @FindBy(css = "._contextual_phx9n_1")
    WebElement notificationWindow;

    @FindBy(css = "._icon_phx9n_39")
    WebElement notificationWindowIcon;

    @FindBy(css = ".MuiDialog-root ._icon_41q16_1 svg")
    WebElement crossCreatedMessage;

    public void cycleYearIsDisabled() {
        assertTrue(getValueInAttributteInField(By.name("cycleYearInput"), "class").contains("react-select--is" +
                "-disabled"));
    }

    public void cycleYearHasValue(String value) {
        getDriver().findElement((By.name("cycleYearInput"))).getAttribute("value").contains(value);
    }

    public void dropDownIsDisplayed(String dropDown) {
        waitForElement().until(ExpectedConditions.presenceOfElementLocated((By) locatorsDictionary.dropDownDictionary.get(
                dropDown)));
        assertTrue(getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                dropDown)).isDisplayed());
    }

    public int countDropDownElements(String dropDown) {
        getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                dropDown)).click();
        return getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                dropDown)).findElements(By.cssSelector(".react-select__option")).size();
    }

    public boolean validateDropDownElements(String dropDown, List expected) {

        waitForElement().until(ExpectedConditions.elementToBeClickable((By) locatorsDictionary.dropDownDictionary.get(
                dropDown)));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();",
                getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(dropDown)));
        getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(dropDown)).click();
        List<WebElement> list = getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                        dropDown)).findElements(By.cssSelector(".react-select__option"));
        return list.stream()
                .filter(x -> expected.contains(x.getText())).count() == 0;
    };

    public void dropDownDisplaysOptions(String dropDown, String optionsString) {
        String options[] = optionsString.split(",");
        validateDropDownElements(dropDown, Arrays.stream(options).map(x -> x.trim()).collect(Collectors.toList()));
    }

    public void selectItemInDropDown(String dropDown, int item) {
        waitForElement().until(ExpectedConditions.presenceOfElementLocated((By) locatorsDictionary.dropDownDictionary.get(
                dropDown)));
        getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                dropDown)).click();
        waitForElement().until(ExpectedConditions.presenceOfElementLocated(By.id(String.format((String) locatorsDictionary.dropDownItemDictionary.get(dropDown),
                item))));
        getDriver().findElement(By.id(String.format((String) locatorsDictionary.dropDownItemDictionary.get(dropDown),
                item))).click();
    }

    public void dropDownHasValue(String dropDown, String value) {
        WebElement parent = getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                dropDown));
        WebElement input = parent.findElement(By.cssSelector(".react-select__single-value"));
        assertTrue(input.getText().contains(value));
    }

    private void click(By by) {
        getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                "location")).click();
    }

    public void editDescription(String description) {
        this.description.sendKeys(description);
    }

    public void descriptionIsDisplayed() {
        description.isDisplayed();
    }

    public void clickSubmit() {
        submit.click();
    }

    public void createSerieWindowIsDisplayed(boolean isDisplayed) {
        boolean foundElement;
        try{
            foundElement = createSerieWindow.isDisplayed();
        } catch (Exception exception){
            foundElement = false;
        }
        assertEquals(isDisplayed, foundElement);
    }

    public void aboutMessageIsDisplayed() {
        assertTrue(aboutMessage.getText().equals("You are about to create a series in the crop category \"soybean\". " +
                "You must complete the required fields to continue."));
    }

    public void notificationWindowIsDisplayed() {
        assertTrue(notificationWindow.isDisplayed());
    }

    public void submitIsDisplayed() {
        assertTrue(submit.isDisplayed());
    }

    public void notificationWindowContains(String message) {
        assertTrue(notificationWindow.getText().contains(message));
    }

    public void notificationWindowIconIsDisplayed() {
        assertTrue(notificationWindowIcon.isDisplayed());
    }

    public void pressesCrossButton() {
        crossCreatedMessage.click();
    }

    public void completedFieldsNewSerie(String serie) {
        selectItemInDropDown("company", 0);
        selectItemInDropDown("year", 0);
        editDescription(serie);
        selectItemInDropDown("breed", 0);
        selectItemInDropDown("trait", 0);
        selectItemInDropDown("cycle", 0);
        selectItemInDropDown("environment", 0);
        selectItemInDropDown("location", 0);
        clickSubmit();
    }

}