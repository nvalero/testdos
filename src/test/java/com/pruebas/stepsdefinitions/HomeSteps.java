package com.pruebas.stepsdefinitions;

import com.pruebas.pageobjects.HomePage;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HomeSteps {
    @Steps
    HomePage homePage;

    @Then("the Page is displayed")
    public void canSeeHomePage() {
        homePage.validate();
    }

}