package com.headway.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HomePageDefinitions {
    @Steps
    com.headway.steps.StepHomePage stepHomePage;

    @Then("the Series Manager Page is displayed")
    public void canSeeHomePage() {
        stepHomePage.validate();
    }

    @And("it pressed the Create Series button")
    public void createSerie() {
        stepHomePage.createSerie();
    }

}