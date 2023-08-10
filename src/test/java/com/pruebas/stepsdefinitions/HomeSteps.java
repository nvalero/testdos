package com.headway.stepsdefinitions;

import com.headway.pageobjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class HomeSteps {
    @Steps
    HomePage homePage;

    @Then("the Page is displayed")
    public void canSeeHomePage() {
        homePage.validate();
    }

}