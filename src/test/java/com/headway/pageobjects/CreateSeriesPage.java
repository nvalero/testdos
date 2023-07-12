package com.headway.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateSeriesPage extends PageObject {

    @FindBy(id = "company")
    WebElement companyList;

    @FindBy(id = "year")
    WebElement yearList;

    @FindBy(id = "description")
    WebElement description;

    @FindBy(id = "trait")
    WebElement traitList;

    @FindBy(id = "breeding")
    WebElement breedingList;

    @FindBy(id = "cycle")
    WebElement cycleList;

    @FindBy(id = "location")
    WebElement locationList;

    @FindBy(id = "environment")
    WebElement environmentList;

    @FindBy(id = "cycleYear")
    WebElement cycleYearList;

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
        description.sendKeys("description");
        companyList.click();
    }

    public void clickSelectYearItem() {
        yearList.click();
        getDriver().findElement(By.id(YEAR_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickBreedingItem() {
        breedingList.click();
        getDriver().findElement(By.id(BREEDING_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickTraitItem() {
        traitList.click();
        getDriver().findElement(By.id(TRAIT_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickCycleItem() {
        cycleList.click();
        getDriver().findElement(By.id(CYCLE_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickLocationItem() {
        locationList.click();
        getDriver().findElement(By.id(LOCATION_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickEnvironmentItem() {
        environmentList.click();
        getDriver().findElement(By.id(ENVIRONMENT_ITEM_LOCATOR_TEMPLATE)).click();
    }

    public void clickCycleYearItem() {
        cycleYearList.click();
        getDriver().findElement(By.id(CYCLE_YEAR_ITEM_LOCATOR_TEMPLATE)).click();//class="_icon_41q16_1"
    }

    public void editDescription(String description) {
        this.description.sendKeys(description);
    }

    public void clickSubmit() {
        submit.click();
    }


    public void validateCreatedMessage() {
        assertEquals(createdMessage.getText(), "The Series was successfully Created");
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
}