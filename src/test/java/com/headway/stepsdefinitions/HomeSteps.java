package com.headway.stepsdefinitions;

import com.headway.pageobjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class HomeSteps {
    @Steps
    HomePage homePage;

    @Steps
    com.headway.pageobjects.EnableDisableSeriePage enableDisableSeriePage;

    @Steps
    com.headway.pageobjects.CreateSeriePage createSeriePage;

    @Then("the Series Manager Page is displayed")
    public void canSeeHomePage() {
        homePage.validate();
    }

    @And("it pressed the Create Series button")
    public void createSerie() {
        homePage.createSerie();
        createSeriePage.createSerieWindowIsDisplayed(true);
    }

    @And("the Hamburger Menu is displayed")
    public void hamburgerMenuIsDisplayed(){ homePage.isHamburgerMenuDisplayed(); }

    @And("the Header Menu is displayed")
    public void headerMenuIsDisplayed(){ homePage.isHeaderDisplayed(); }

    @And("the Middle Section Menu is displayed")
    public void middleMenuIsDisplayed(){ homePage.isMiddleDisplayed(); }

    @And("it selects option to disable serie {string}")
    @And("it selects option to enable serie {string}")
    public void disableSerie(String serie){ homePage.disableSerieRow(serie); }

    @And("it selects serie {string}")
    public void selectsSerie(String serie){ homePage.clickSerie(serie); }

    @And("the serie {string} has status {string}")
    public void statusIsValue(String serie, String status) {
        String currentStatus= homePage.getStatus(serie);
        if (currentStatus.toUpperCase().equals("NEW"))
            currentStatus = "ENABLED";
        homePage.validateValues(currentStatus.toUpperCase(), status.toUpperCase());
    }

    @And("it sets serie {string} to status {string}")
    public void completeDisableSerie(String serie, String status){
        String currentStatus= homePage.getStatus(serie);
        if (currentStatus.toUpperCase().equals("NEW"))
            currentStatus = "ENABLED";
        if (!currentStatus.equals(status.toUpperCase())){
            homePage.disableSerieRow(serie);
            enableDisableSeriePage.clickSubmit();
            enableDisableSeriePage.disableSerieWindowIsDisplayed(false);
        }
    }

    @And("it pressed the Delete Series button")
    public void deleteSerie(){ homePage.deleteSerie();}

    @Then("the Delete Series Button is displayed")
    public void validateDeleteSerie(){ homePage.isDeleteSerieDisplayed(true);}

    @And("the Delete Series Button is not displayed")
    public void validateDeleteSerieNotDisplayed(){ homePage.isDeleteSerieDisplayed(false);}

    @And("the Edit Series Button is not displayed for serie {string}")
    public void editSpecificSerieIsNotDisplayed(String serie) {
        homePage.isEditSerieDisplayed(false, serie);
    }

    @And("the Delete Series Button is not displayed for serie {string}")
    public void deleteSpecificSerieIsNotDisplayed(String serie) {
        homePage.isSpecificDeleteSerieDisplayed(false, serie);
    }

    @And("it selects serie with status {string}")
    public void selectsSerieWithStatus(String status) {
        homePage.selectsSerieWithStatus(status);
    }

    @And("it has value {string} in field {string} in serie {string}")
    public void hasValuesInLocationColumn(String value, String field, String serie) {
        homePage.hasValuesInColumn(value, serie, field);
    }

}