package com.headway.stepsdefinitions;

import com.headway.pageobjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HomeSteps {
    @Steps
    HomePage homePage;

    @Steps
    com.headway.pageobjects.EnableDisableSeriePage enableDisableSeriePage;

    @Then("the Series Manager Page is displayed")
    public void canSeeHomePage() {
        homePage.validate();
    }

    @And("it pressed the Create Series button")
    public void createSerie() {
        homePage.createSerie();
    }

    @And("the Hamburger Menu is displayed")
    public void hamburgerMenuIsDisplayed(){ homePage.isHamburgerMenuDisplayed(); }

    @And("the Header Menu is displayed")
    public void headerMenuIsDisplayed(){ homePage.isHeaderDisplayed(); }

    @And("the Middle Section Menu is displayed")
    public void middleMenuIsDisplayed(){ homePage.isMiddleDisplayed(); }

    @And("disable serie {string}")
    @And("enable serie {string}")
    public void disableSerie(String serie){ homePage.disableSerieRow(serie); }

    @And("the serie {string} has status {string}")
    public void statusIsValue(String serie, String status) {
        homePage.statusIsValue(serie, status);
    }

    @And("complete {string} serie {string}")
    public void completeDisableSerie(String status, String serie){
        if (!homePage.getStatus(serie).equals(status)){
            homePage.disableSerieRow(serie);
            enableDisableSeriePage.clickSubmit();
            enableDisableSeriePage.disableSerieWindowIsDisplayed(false);
        }
    }
}