package com.headway.pageobjects;

import com.google.inject.Inject;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateSeriePage extends PageObject {

    @Inject
    LocatorsDictionary locatorsDictionary = new LocatorsDictionary();

    @FindBy(id = "description")
    WebElement description;

    @FindBy(css = "._loading_1cvem_110")
    WebElement submit;

    @FindBy(css = ".MuiDialog-root ._title_x6167_5")
    WebElement createdMessage;

    @FindBy(css = ".MuiDialog-root ._title_x6167_5")
    WebElement logoCreatedMessage;

    @FindBy(css = ".MuiDialog-root ._icon_41q16_1 svg")
    WebElement crossCreatedMessage;

    @FindBy(css = "._container_1iw2j_1._drawerContent_1t7x3_25")
    WebElement longCreatedMessage;

    @FindBy(css = "._secondary_1cvem_39")
    WebElement goToSeriesButton;

    @FindBy(css = "._primary_1cvem_5")
    WebElement addParentsButton;

    @FindBy(css = ".MuiDialog-root")
    WebElement createSerieWindow;

    @FindBy(css = "._large_ypyit_5")
    WebElement aboutMessage;

    @FindBy(css = "._contextual_phx9n_1")
    WebElement notificationWindow;

    @FindBy(css = "._icon_phx9n_39")
    WebElement notificationWindowIcon;

    private static final String COMPANY_ITEM_LOCATOR_TEMPLATE = "react-select-2-option-0";//GDM ARGENTINA
    private static final String YEAR_ITEM_LOCATOR_TEMPLATE = "react-select-3-option-0";//2023
    private static final String TRAIT_ITEM_LOCATOR_TEMPLATE = "react-select-4-option-0";//CONVENTIONAL
    private static final String BREEDING_ITEM_LOCATOR_TEMPLATE = "react-select-5-option-0";//FWS - FWB Simple cross
    private static final String CYCLE_ITEM_LOCATOR_TEMPLATE = "react-select-6-option-0";//AxB - Initial cross
    private static final String LOCATION_ITEM_LOCATOR_TEMPLATE = "react-select-7-option-0";//CHACABUCO
    private static final String ENVIRONMENT_ITEM_LOCATOR_TEMPLATE = "react-select-8-option-0";//GREENHOUSE
    private static final String CYCLE_YEAR_ITEM_LOCATOR_TEMPLATE = "react-select-9-option-0";//2024
    private static final String SERIE_NAME_LOCATOR_TEMPLATE = "NOMBREX";
    private static final String SERIE_LINK_LOCATOR_TEMPLATE = "//span[@title=\"%s\"]";

    public void getSerie(String serie) {
        getDriver().findElement(By.xpath(String.format(SERIE_LINK_LOCATOR_TEMPLATE, serie)));//_loading_1cvem_110
    }

    public void clickSelectCompanyItem() {
        //description.sendKeys("description");
    }

    public String getValueInAttributteInField(By by, String  attribute) {
        return getDriver().findElement(by).getAttribute(attribute);
    }

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
        List options = List.of(optionsString.split(","));
        validateDropDownElements(dropDown, options);
    }

    public void clickSelectYearItem() {
        getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                "year")).click();
        getDriver().findElement(By.id(YEAR_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickBreedingItem() {
         getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                        "breeding")).click();
        getDriver().findElement(By.id(BREEDING_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickTraitItem() {
        getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                "trait")).click();
        getDriver().findElement(By.id(TRAIT_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickCycleItem() {
        getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                "cycle")).click();
        getDriver().findElement(By.id(CYCLE_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickLocationItem() {
        click((By) locatorsDictionary.dropDownDictionary.get(
                "location"));
        getDriver().findElement(By.id(LOCATION_ITEM_LOCATOR_TEMPLATE)).click();
    }

    private void click(By by) {
        getDriver().findElement((By) locatorsDictionary.dropDownDictionary.get(
                "location")).click();
    }

    public void clickEnvironmentItem() {
        getDriver().findElement(By.id(ENVIRONMENT_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickCycleYearItem() {
        getDriver().findElement(By.id(CYCLE_YEAR_ITEM_LOCATOR_TEMPLATE)).click();//class="_icon_41q16_1"
    }

    public void editDescription(String description) {
        this.description.sendKeys(description);
    }

    public void descriptionIsDisplayed() {
        this.description.isDisplayed();
    }

    public void clickSubmit() {
        submit.click();
    }

    public void validateCreatedMessage(String message) {
        assertEquals(createdMessage.getText(), message);
    }

    public void logoCreatedMessageIsDisplayed() {
        assertTrue(logoCreatedMessage.isDisplayed());
    }

    public void crossCreatedMessageIsDisplayed() {
        assertTrue(crossCreatedMessage.isDisplayed());
    }

    public void longCreatedMessageIsCorrect() {
        assertTrue(longCreatedMessage.getText().contains(SERIE_NAME_LOCATOR_TEMPLATE));
    }

    public void goToSeriesButtonIsDisplayed() {
        assertTrue(goToSeriesButton.isDisplayed());
    }

    public void addParentsButtonButtonIsDisplayed() {
        assertTrue(addParentsButton.isDisplayed());
    }

    public void clickGoToSeries() {
        goToSeriesButton.click();
    }

    public void clickAddParents() {
        addParentsButton.click();
    }

    public void createSerieWindowIsDisplayed(boolean isDisplayed) {
        assertTrue(createSerieWindow.isDisplayed() == isDisplayed);
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
}