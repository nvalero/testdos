package com.headway.stepsdefinitions;

import com.google.inject.Inject;
import com.headway.pageobjects.ConnectionPage;
import com.headway.pageobjects.HomePage;
import com.headway.pageobjects.ModifyNewSeriesPage;
import com.headway.pageobjects.LocatorsDictionary;
import com.headway.pageobjects.LoginHeadway;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.When;

public class ModifyNewSeriesSteps {

    @Steps
    HomePage stepHomePage;
    @Steps
    LoginHeadway loginHeadway;

    @Steps
    ModifyNewSeriesPage modifyNewSeriesPage;

    ConnectionPage connectionPage;
    @Inject
    LocatorsDictionary locatorsDictionary = new LocatorsDictionary();

    @When("it presses the Edit icon")
    public void clickEditIconButton() {
        modifyNewSeriesPage.clickEditIconButton();
    }

    @Then("edit Series drawer is displayed")
    public void editSeriesDrawerIsDisplayed() {
        modifyNewSeriesPage.editSeriesDrawerIsDisplayed();
    }

    @And("close icon is displayed")
    public void closeIconIsDisplayed() {
        modifyNewSeriesPage.closeIconIsDisplayed();
    }

    @And("a grey separator line is displayed")
    public void greySeparatorLineIsDisplayed() {
        modifyNewSeriesPage.dividerElement();
    }

    @And("the name of the series is displayed")
    public void seriesName() {
        modifyNewSeriesPage.getSeriesName();
    }

    @And("the Company drop-down is displayed")
    public void companyDropDownIsDisplayed() {
        modifyNewSeriesPage.companyDropDownIsDisplayed();
    }

    @And("the Year drop-down is displayed")
    public void YearDropDownIsDisplayed() {
        modifyNewSeriesPage.YearDropDownIsDisplayed();
    }

    @And("the Description field is displayed")
    public void descriptionFieldIsDisplayed() {
        modifyNewSeriesPage.descriptionFieldIsDisplayed();
    }

    @And("the Trait dropdown is displayed")
    public void traitDropdownIsDisplayed() {
        modifyNewSeriesPage.traitDropdownIsDisplayed();
    }

    @And("the Breading Method dropdown is displayed")
    public void breadingMethodDropdownIsDisplayed() {
        modifyNewSeriesPage.breadingDropdownIsDisplayed();
    }

    @And("the Cycle dropdown is displayed")
    public void cycleDropdownIsDisplayed() {
        modifyNewSeriesPage.cycleDropdownIsDisplayed();
    }

    @And("the Location dropdown is displayed")
    public void locationDropdownIsDisplayed() {
        modifyNewSeriesPage.locationDropdownIsDisplayed();
    }

    @And("the Environment dropdown is displayed")
    public void environmentDropdownIsDisplayed() {
        modifyNewSeriesPage.environmentDropdownIsDisplayed();
    }

    @And("the Cycle Year dropdown is displayed")
    public void cycleYearDropdownIsDisplayed() {
        modifyNewSeriesPage.cycleYearDropdownIsDisplayed();
    }

    @And("the message Make sure the information is correct is displayed")
    public void messageInformation() {
        modifyNewSeriesPage.messageInformation();
    }

    @Then("the Create Series button is displayed")
    public void createSeriesButtonIsDisplayed() {
        modifyNewSeriesPage.createSeriesButtonIsDisplayed();
    }

    @When("it pushes the close icon button")
    public void pushesTheCloseIconButton() {
        modifyNewSeriesPage.clickCloseIconButton();
    }

    @When("it pushes the dropdown company field")
    public void clickCompanyDropdown() {
        modifyNewSeriesPage.clickCompanyDropdown();
    }

    @Then("the platform displays the drop-down with the options GDM ARGENTINA, GDM BRAZIL, GDM CHINA, GDM EUROPE UNION, GDM UNITED STATES")
    public void validateCompanyOption() {
        modifyNewSeriesPage.validateCompanyOption();
    }
}
