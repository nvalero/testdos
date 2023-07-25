package com.headway.stepsdefinitions;

import com.headway.pageobjects.AddParentsListsPage;
import io.cucumber.java.en.And;

public class AddParentsListSteps {

    AddParentsListsPage addParentsListsPage;

    @And("the Add Parents Lists drawer is displayed")
    public void AddParentsListsWindowIsDisplayed() {
        addParentsListsPage.AddParentsListsWindowIsDisplayed(true);
    }

    @And("the Add Parents Lists drawer is not displayed")
    public void AddParentsListsWindowIsNotDisplayed() {
        addParentsListsPage.AddParentsListsWindowIsDisplayed(false);
    }

    @And("it displays a list of files")
    public void ListOfFilesIsDisplayed() {
        addParentsListsPage.listOfFilesIsDisplayed();
    }

    @And("it selects a file from the list of files")
    public void selectsAFileFromListOfFilesIsDisplayed() {
        addParentsListsPage.selectCheckFileById(0);
    }

    @And("it selects two files from the list of files")
    public void selectsTwoFilesFromListOfFilesIsDisplayed() {
        addParentsListsPage.selectCheckFileById(0);
        addParentsListsPage.selectCheckFileById(1);
    }

    @And("it displays {string}")//You have selected 0 files
    public void validateFilesSelected(String message) {
        addParentsListsPage.validateFilesSelected(message);
    }

    @And("it presses Add Parents List Button in Modal")
    public void clickAddParentsButton() {
        addParentsListsPage.clickAddParentsButton();
    }

    @And("the Add Parents Lists Button in Modal is disabled")
    public void AddParentsListsButtonWindowIsDisabled() {
        addParentsListsPage.AddParentsListsButtonIsEnabled(false);
    }

    @And("it displays title {string} in Assign Parents windows")
    public void displaysTitle(String message) {
        addParentsListsPage.parentsAddedMessage(message);
    }
}
