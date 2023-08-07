package com.headway.pageobjects;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailViewPage extends BasePage {


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

}
