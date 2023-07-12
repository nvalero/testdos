package com.headway.stepsdefinitions;

import com.headway.pageobjects.CreateSeriesPage;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class CreateSeriesSteps {

    @Steps
    CreateSeriesPage createSeriesPage;

    @And("it completed all fields with the correct data")
    public void completedFieldsNewSerie() {
        createSeriesPage.clickSelectCompanyItem();
        createSeriesPage.clickSelectYearItem();
        createSeriesPage.editDescription("new test");
        createSeriesPage.clickBreedingItem();
        createSeriesPage.clickTraitItem();
        createSeriesPage.clickCycleItem();
        createSeriesPage.clickEnvironmentItem();
        createSeriesPage.clickLocationItem();
        createSeriesPage.clickSubmit();
    }

    @And("it displays the Confirmation Window of Sucess")
    public void validateCreatedMessage() {
        createSeriesPage.validateCreatedMessage();
    }

    @And("it displays the cross button")
    public void validateCrossButton() {
        createSeriesPage.crossCreatedMessageIsDisplayed();
    }

    @And("it displays the Sucess logo")
    public void validateSucessLog() {
        createSeriesPage.logoCreatedMessageIsDisplayed();
    }

    @And("it displays title Series Created Message")
    public void validateSeriesCreated() {
        createSeriesPage.validateCreatedMessage();
    }

    @And("it displays the long title Series Created")
    public void validateLongTitleSeriesCreated() {
        createSeriesPage.longCreatedMessageIsCorrect();
    }

    @And("it displays the button Go to Series Manager")
    public void validateButtonGoToSeriesManager() {
        createSeriesPage.goToSeriesButtonIsDisplayed();
    }

    @And("it displays the button Add Parents List")
    public void validateButtonGoToAddParentsList() {
        createSeriesPage.addParentsButtonButtonIsDisplayed();
    }
}