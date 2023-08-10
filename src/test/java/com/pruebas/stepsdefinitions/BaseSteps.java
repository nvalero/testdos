package com.pruebas.stepsdefinitions;

import com.pruebas.pageobjects.BasePage;
import io.cucumber.java.en.And;

public class BaseSteps {
    
    BasePage basePage;

    @And("the {string} page is displayed")
    public void validatePageIsDisplayed(String page) {
        basePage.validatePageIsDisplayed(page);
    }

}
