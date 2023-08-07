package com.headway.pageobjects;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailViewPage extends BasePage {


    @FindBy(className = "_xxl_sz2ax_76")
    WebElement title;

    @FindBy(className = "_cycleCross_1lh8z_32")
    WebElement cycleCross;

    @FindBy(className = "_primaryNavigation_1gwdd_1")
    WebElement primaryNav;

    @FindBy(className = "_secondaryNavigation_z1ncb_1")
    WebElement secondaryNave;

    @FindBy(className = "_container_on69i_21")
    WebElement serieContainer;

    @FindBy(partialLinkText = "Back to Series Manager")
    WebElement backToSeriesManager;

    @FindBy(className = "_contentHeader_on69i_35")
    WebElement serieBoxContentHeader;

    @FindBy(css = "#root > div > section > main > article > span > span > svg")
    WebElement dotMenu;

    @FindBy(linkText = "Delete Series")
    WebElement deleteSeries;

    @FindBy(linkText = "Edit Series")
    WebElement editSeries;

    @FindBy(linkText = "Disable")
    WebElement disableSeries;

    @FindBy(linkText = "Parents Selection")
    WebElement parentsSelectionLink;

    @FindBy(linkText = "Series Information")
    WebElement seriesInformationLink;

    @FindBy(linkText = "Cross Prediction")
    WebElement crossPredictionLink;

    @FindBy(linkText = "Rules")
    WebElement rulesLink;

    @FindBy(linkText = "Guidelines")
    WebElement guidelinesLink;

    @FindBy(css = "._container_1rw5t_8._new_1rw5t_18")
    WebElement statusText; //-> PARENT ASSIGNED

    By parentSelectionMessage = By.cssSelector("#root div section main article div div"); //--> You have already added a List of
    // Parents.

    By AddParentsListsButton = By.partialLinkText("Add Parents Lists +");

    By parentThTableBy = By.cssSelector("._columns_16dgm_11"); // lista de encabezados
    By parentTrRowsBy = By.cssSelector("._rows_16dgm_83"); // filas

    By totalMessageBy = By.cssSelector("._lightBlue_qd19q_1 ._small_ypyit_21._bold_ypyit_45._textColor_qd19q_22");
    By LinksBy = By.cssSelector("span._medium_ypyit_13._bold_ypyit_45._downloadLink_9jsbb_107");

    public void clickParentsSelectionLink(){
        parentsSelectionLink.click();
    }

    public void clickAddParentsListsButton() {
        getDriver().findElement(AddParentsListsButton).click();
    }

    public void displaysInformativeText(String message) {
        assertEquals(getDriver().findElement(parentSelectionMessage).getText().replace("\n", " "), message);
    }

    public void validateStatusText(String message) {
        assertEquals(statusText.getText(), message);
    }

    public void AddParentsListsButtonIsEnabled(boolean enabled) {
        webElementIsEnabled(AddParentsListsButton, enabled);
    }

    public void validateDetailViewHeaderIsDisplayed(){
        assertTrue(title.isDisplayed());
        assertTrue(cycleCross.isDisplayed()); }

    public void validateNavBarsIsDisplayed(){
        assertTrue(primaryNav.isDisplayed());
        assertTrue(secondaryNave.isDisplayed()); }

    public void validateSerieContainerIsDisplayed(){ assertTrue(serieContainer.isDisplayed()); }

    public void backToSeriesManagerIsDisplayed(){ assertTrue(backToSeriesManager.isDisplayed()); }

    public void serieBoxHeaderIsDisplayed(){ assertTrue(serieBoxContentHeader.isDisplayed()); }

    public void clickBackToSeriesManager(){ backToSeriesManager.click();}

    public void clickSeriesActionsMenu() { dotMenu.click(); }

    public void validateSeriesActionMenu(){
        assertTrue(deleteSeries.isDisplayed());
        assertTrue(editSeries.isDisplayed());
        assertTrue(disableSeries.isDisplayed());
    }

    public void clickDeleteSeries(){ deleteSeries.click();}

    public void clickEditSeries(){ editSeries.click();}

    public void clickDisableSeries(){ disableSeries.click();}




}
