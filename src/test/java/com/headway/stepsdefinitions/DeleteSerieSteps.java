package com.headway.stepsdefinitions;

import com.headway.pageobjects.DeleteSeriePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class DeleteSerieSteps {

    @Steps
    DeleteSeriePage deleteSeriePage;

    @Then("the Delete Serie Page is displayed")
    public void canSeeDeleteSeriePage() { deleteSeriePage.validateDeleteSeriePage(); }

    @And("it pressed the close button")
    public void closeButton(){ deleteSeriePage.closeButton();}

    @And("it pressed the accept button for delete")
    public void acceptDeleteSerie() { deleteSeriePage.acceptButton(); }

    @And("it pressed the back button")
    public void backToMenu(){ deleteSeriePage.backButton(); }

}
