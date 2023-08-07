package com.headway.stepsdefinitions;

import com.headway.pageobjects.DetailViewPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @And("the Serie Detail Page is displayed")
    public void validateDetailView(){
        detailViewPage.validateDetailViewHeaderIsDisplayed();
        detailViewPage.validateNavBarsIsDisplayed();
        detailViewPage.validateSerieContainerIsDisplayed();
    }

    @And("< Back to Series Manager option is displayed")
    public void backToSeriesManager(){ detailViewPage.backToSeriesManagerIsDisplayed(); }

    @And("it presses over < Back to Series Manager option")
    public void itPressedBackToSeriesManager(){ detailViewPage.clickBackToSeriesManager();}

    @And("a horizontal tabular navigation menu is displayed")
    public void validateHorizantalTabularNav(){ detailViewPage.validateNavBarsIsDisplayed();}

    @And("a Series detail box is placed below the horizontal navigation")
    public void validateContainerSerieBox(){ detailViewPage.validateSerieContainerIsDisplayed();}

    @And("within that box, a Series Status is displayed using the Stepper component")
    public void validateSerieBoxHeader(){ detailViewPage.serieBoxHeaderIsDisplayed();}

    @And("within an Overflow menu component available Series actions are accessible Delete Series, Edit Series and Disable")
    public void seriesActionIsDisplayed(){
        detailViewPage.clickSeriesActionsMenu();
        detailViewPage.validateSeriesActionMenu(); }

    @And("it has pressed over 3 dots icon in the series row")
    public void itPressedSeriesAction(){ detailViewPage.clickSeriesActionsMenu();}

    @And("it presses {string} option")
    public void itPressedAOption(String option){
        switch (option){
            case "Edit series":
                detailViewPage.clickEditSeries();
                break;
            case "Delete series":
                detailViewPage.clickDeleteSeries();
                break;
            case "Disable":
                detailViewPage.clickDisableSeries();
                break;
        }
    }
}
