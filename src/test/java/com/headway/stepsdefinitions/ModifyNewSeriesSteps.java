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

    @Then("it types INA in the field Company")
    public void TypeINAFieldCompany() {
        modifyNewSeriesPage.TypeINAFieldCompany();
    }

    @And("the platform performs a sequential search and displays the following options in the drop-down list: GDM ARGENTINA, GDM CHINA")
    public void sequentialSearchDisplayed() {
        //modifyNewSeriesPage.sequentialSearchDisplayed();
    }

    @When("it types ZZ in the field Company")
    public void TypeZZFieldCompany() {
        modifyNewSeriesPage.TypeZZFieldCompany();
    }

    @Then("the platform performs a sequential search and displays the message No Options in the dropdown")
    public void displaysMessageNoOptions() {
        modifyNewSeriesPage.displaysMessageNoOptions();
    }

    @When("it pushes the dropdown field Year")
    public void clickYearDropdown() {
        modifyNewSeriesPage.clickYearDropdown();
    }

    @Then("the platform displays a dropdown with the actual year and the next")
    public void sequentialSearchDisplayedForYearField() {
        //modifyNewSeriesPage.sequentialSearchDisplayedForYearField();
    }

    @When("it types 0 in the field Year")
    public void typeInTheFieldYear() {
        modifyNewSeriesPage.typeInTheFieldYear();
    }

    @When("it types AA in the field Year")
    public void typesInTheFieldYearWrong() {
        modifyNewSeriesPage.typeInTheFieldYearWrong();
    }

    @Then("the platform performs a sequential search and displays the message No Options in the dropdown for year field")
    public void displaysMessageNoOptionsForYear() {
        modifyNewSeriesPage.displaysMessageNoOptionsForYear();
    }

    @When("it pushes the dropdown field Breeding Method")
    public void clickDropdownFieldBreeding() {
        modifyNewSeriesPage.clickDropdownFieldBreeding();
    }

    @Then("the platform displays the dropdown with the FWS - FWB Simple cross message")
    public void displayDropdownWithValues() {
        modifyNewSeriesPage.displayDropdownWithValues();
    }

    @When("it types CROSS in the field Breeding Method")
    public void typeInTheFieldBreeding() {
        modifyNewSeriesPage.typeInBreedingField();
    }

    @Then("the platform performs a sequential search and displays the options in the dropdown list")
    public void displaysBreeding() {
        modifyNewSeriesPage.displaysBreeding();
    }

    @When("it pushes the drop-down field Trait")
    public void clickOnDropDownFieldTrait() {
        modifyNewSeriesPage.clickOnDropDownFieldTrait();
    }

    @Then("the platform displays the dropdown with the elements")
    public void traitDisplaysTheDropdownWithElements() {
        modifyNewSeriesPage.traitDisplaysTheDropdownWithElements();
    }

    @When("it types CON in the field Trait")
    public void itTypesInTheFieldTrait() {

    }

    @When("it types SS in the field Trait")
    public void typesInTheFieldTrait() {
        modifyNewSeriesPage.typesInTheFieldTrait();
    }

    @Then("the platform performs a sequential search and displays the message No Options")
    public void traitDisplaysTheMessageNoOptions() {
        modifyNewSeriesPage.traitDisplaysTheMessageNoOptions();
    }

    @When("it pushes the dropdown field Cycle")
    public void clickOnDropdownFieldCycle() {
        modifyNewSeriesPage.clickOnDropdownFieldCycle();
    }

    @Then("the platform displays the dropdown with data")
    public void displaysCycleDropdownWithData() {
        modifyNewSeriesPage.displaysCycleDropdownWithData();
    }

    @When("it types CR in the field Cycle")
    public void typesInTheFieldCycle() {
        modifyNewSeriesPage.typesInTheFieldCycle();
    }

    @When("it types {string} in the field Cycle")
    public void typeInFieldCycle(String var) {
        modifyNewSeriesPage.typeInFieldCycle(var);
    }

    @Then("the platform performs a sequential search and displays the message {string} in the drop-down")
    public void cycleNoOptionMessage(String var) {
        modifyNewSeriesPage.cycleNoOptionMessage(var);
    }

    @When("it pushes the cancel button")
    public void clickOnCancelButton() {
        modifyNewSeriesPage.clickOnCancelButton();
    }

    @And("the Series will not be modified")
    public void seriesNotModified() {
        modifyNewSeriesPage.seriesNotModified();
    }

    @And("it types {string} in drop-down {string}")
    public void selectYear(String text, String dropDown) {
        modifyNewSeriesPage.typesInDropDown(text, dropDown);
    }

}
