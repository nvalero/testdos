package com.headway.stepsdefinitions;

import com.headway.pageobjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HomeSteps {
    @Steps
    HomePage homePage;

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
}