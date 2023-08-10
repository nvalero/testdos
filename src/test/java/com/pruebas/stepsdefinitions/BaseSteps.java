package com.headway.stepsdefinitions;

import com.headway.pageobjects.BasePage;
import io.cucumber.java.en.And;

public class BaseSteps {
    
    BasePage basePage;

    @And("the {string} page is displayed")
    public void validatePageIsDisplayed(String page) {
        basePage.validatePageIsDisplayed(page);
    }

}
