package com.headway.stepsdefinitions;

import com.headway.pageobjects.DetailViewPage;
import io.cucumber.java.en.And;

public class DetailViewSteps {
    
    DetailViewPage detailViewPage;

    @And("it presses Parent Selection option")
    public void pressesParentSelection() {
        detailViewPage.clickParentsSelectionLink();
    }

    @And("it displays informative text {string}")
    public void displaysInformativeText(String message) {
        detailViewPage.displaysInformativeText(message);
    }

    @And("it displays status {string}")
    public void displayStatus(String message) {
        detailViewPage.validateStatusText(message);
    }

    @And("it presses Add Parents Lists Button in Detail View")
    public void pressesAddParentsListsButton() {
        detailViewPage.clickAddParentsListsButton();
    }

    @And("the Add Parents Lists Button in Detail View is enabled")
    public void AddParentsListsButtonIsEnabled() {
        detailViewPage.AddParentsListsButtonIsEnabled(true);
    }

}
