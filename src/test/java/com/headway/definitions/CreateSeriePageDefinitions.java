package com.headway.definitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class CreateSeriePageDefinitions {

    @Steps
    com.headway.steps.CreateSeriePage createSeriePage;

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

    @And("it displays the Confirmation Window of Sucess")
    public void validateCreatedMessage() {
        createSeriePage.validateCreatedMessage();
    }

    @And("it displays the cross button")
    public void validateCrossButton() {
        createSeriePage.crossCreatedMessageIsDisplayed();
    }

    @And("it displays the Sucess logo")
    public void validateSucessLog() {
        createSeriePage.logoCreatedMessageIsDisplayed();
    }

    @And("it displays title Series Created Message")
    public void validateSeriesCreated() {
        createSeriePage.validateCreatedMessage();
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
}