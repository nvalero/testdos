package com.headway.stepsdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class CreateSerieSteps {

    @Steps
    com.headway.pageobjects.CreateSeriePage createSeriePage;

    @Steps
    com.headway.pageobjects.SuccessCreateSeriePage successCreateSeriePage;

    @And("it completed all fields with the correct data")
    public void completedFieldsNewSerie() {
        createSeriePage.clickSelectCompanyItem();
     /*   createSeriePage.clickSelectYearItem();
        createSeriePage.editDescription("new test");
        createSeriePage.clickBreedingItem();
        createSeriePage.clickTraitItem();
        createSeriePage.clickCycleItem();
        createSeriePage.clickEnvironmentItem();
        createSeriePage.clickLocationItem();
        createSeriePage.clickSubmit();*/
    }

    @And("it displays the cross button")
    public void validateCrossButton() {
        successCreateSeriePage.crossCreatedMessageIsDisplayed();
    }

    @And("it displays the Success logo")
    public void validateSuccessLog() {
        successCreateSeriePage.logoCreatedMessageIsDisplayed();
    }

    @And("it displays title {string}")
    public void validateSeriesCreated(String message) {
        successCreateSeriePage.validateCreatedMessage(message);
    }

    @And("it displays the long title Series Created")
    public void validateLongTitleSeriesCreated() {
        successCreateSeriePage.longCreatedMessageIsCorrect();
    }

    @And("it presses the button Go to Series Manager")
    public void pressesButtonGoToSeriesManager() {
        successCreateSeriePage.clickGoToSeries();
        createSeriePage.createSerieWindowIsDisplayed(false);
    }

    @And("it displays the button Go to Series Manager")
    public void validateButtonGoToSeriesManager() {
        successCreateSeriePage.goToSeriesButtonIsDisplayed();
    }

    @And("it displays the button Add Parents List")
    public void validateButtonGoToAddParentsList() {
        successCreateSeriePage.addParentsButtonButtonIsDisplayed();
    }

    @And("it presses Add Parents List button")
    public void pressesButtonGoToAddParentsList() {
        successCreateSeriePage.clickAddParents();
        createSeriePage.createSerieWindowIsDisplayed(false);
    }

    @And("the {string} drop-down is displayed")
    public void dropDownIsDisplayed(String dropDown) {
        createSeriePage.dropDownIsDisplayed(dropDown);
    }

    @And("the New Series drawer is displayed")
    public void createSerieWindowIsDisplayed() {
        createSeriePage.createSerieWindowIsDisplayed(true);
    }

    @And("a notification box is displayed")
    public void notificationWindowIsDisplayed() {
        createSeriePage.notificationWindowIsDisplayed();
    }

    @And("the description field is displayed")
    public void descriptionIsDisplayed() {
        createSeriePage.descriptionIsDisplayed();
    }

    @And("a notification box contains {string}")
    public void notificationWindowContains(String message) {
        createSeriePage.notificationWindowContains(message);
    }

    @And("a notification box contains the attention icon")
    public void notificationWindowIconIsDisplayed() {
        createSeriePage.notificationWindowIconIsDisplayed();
    }

    @And("the submit button is displayed")
    public void submitIsDisplayed() {
        createSeriePage.submitIsDisplayed();
    }

    @And("the {string} drop-down displays {string}")
    public void dropDownDisplaysOptions(String dropDown, String options) {
        createSeriePage.dropDownDisplaysOptions(dropDown, options);
    }

    @And("the cycleyear has value {string}")
    public void cycleYearHasValue(String value) {
        createSeriePage.cycleYearHasValue(value);
    }

    @And("it selects item {int} in drop-down {string}")
    public void selectYear(int item, String dropDown) {
        createSeriePage.selectItemInDropDown(dropDown, item);
    }
    @And("the {string} drop-down has value {string}")
    public void dropDownHasValue(String dropDown, String value) {
        createSeriePage.dropDownHasValue(dropDown, value);
    }
    @And("it presses the cross button")
    public void pressesCrossButton() {
        createSeriePage.pressesCrossButton();
        createSeriePage.createSerieWindowIsDisplayed(false);
    }

    @And("it presses the Go Back button")
    public void clickGoBackButton() {
        successCreateSeriePage.clickGoBackButton();
    }
}