package com.headway.definitions;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HomePageDefinitions {

    @Steps
    com.headway.steps.StepHomePage stepHomePage;

    @Then("User can see Home page")
    public void canSeeHomePage() {
        stepHomePage.validate();
    }

}