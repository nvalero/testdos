package com.headway.stepsdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class CreateSerieSteps {

    @Steps
    com.headway.pageobjects.CreateSeriePage createSeriePage;

    @And("it completed all fields with the correct data")
    public void completedFieldsNewSerie() {
        createSeriePage.clickSelectCompanyItem();
        createSeriePage.clickSelectYearItem();
        createSeriePage.editDescription("new test");
        createSeriePage.clickBreedingItem();
        createSeriePage.clickTraitItem();
        createSeriePage.clickCycleItem();
        createSeriePage.clickEnvironmentItem();
        createSeriePage.clickLocationItem();
        createSeriePage.clickSubmit();
    }

    //TODO fix this method
    @And("it displays the Confirmation Window of Success")
    public void validateCreatedMessage() {
        //createSeriePage.validateCreatedMessage();
    }

    @And("it displays the cross button")
    public void validateCrossButton() {
        createSeriePage.crossCreatedMessageIsDisplayed();
    }

    @And("it displays the Success logo")
    public void validateSuccessLog() {
        createSeriePage.logoCreatedMessageIsDisplayed();
    }

    @And("it displays title {string}")
    public void validateSeriesCreated(String message) {
        createSeriePage.validateCreatedMessage(message);
    }

    @And("it displays the long title Series Created")
    public void validateLongTitleSeriesCreated() {
        createSeriePage.longCreatedMessageIsCorrect();
    }

    @And("it displays the button Go to Series Manager")
    public void validateButtonGoToSeriesManager() {
        createSeriePage.goToSeriesButtonIsDisplayed();
    }

    @And("it displays the button Add Parents List")
    public void validateButtonGoToAddParentsList() {
        createSeriePage.addParentsButtonButtonIsDisplayed();
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

    @And("it selects a year")
    public void selectYear(String dropDown) {
        createSeriePage.clickSelectYearItem();
    }
}