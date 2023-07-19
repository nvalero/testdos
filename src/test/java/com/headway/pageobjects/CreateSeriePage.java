package com.headway.pageobjects;

import com.google.inject.Inject;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(css = ".MuiDialog-root")
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
        getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                dropDown)).click();
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
        getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                dropDown)).click();

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


}