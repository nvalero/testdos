package com.headway.pageobjects;

import static com.openhtmltopdf.util.Util.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeleteSeriePage extends PageObject {

    @FindBy(className = "_title_x6167_5")
    WebElement title;

    @FindBy (css = "body > div.MuiDialog-root._container_gyx38_1.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div._container_utv3n_1 > button._secondary_1cvem_39")
    WebElement backButton;

    @FindBy (css = "body > div.MuiDialog-root._container_gyx38_1.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div._container_utv3n_1 > button._primary_1cvem_5")
    WebElement acceptButton;

    @FindBy (css = "body > div.MuiDialog-root._container_gyx38_1.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > section > div._icon_41q16_1 > svg")
    WebElement closeButton;

    @FindBy(css = ".MuiDialog-root")
    WebElement deleteSerieWindow;

    public void acceptButton(){ acceptButton.click(); sleep(6000);}

    public void backButton(){ backButton.click();}

    public  void closeButton(){ closeButton.click(); }

    public void validateDeleteSeriePage(){ assertTrue(title.isDisplayed()); }

    public void disableSerieWindowIsDisplayed(boolean isDisplayed) {
        boolean foundElement;
        try {
            if (isDisplayed) {
                waitFor(ExpectedConditions.visibilityOf(deleteSerieWindow));
                foundElement = true;
            }else {
                waitFor(ExpectedConditions.not(ExpectedConditions.visibilityOf(deleteSerieWindow)));
                foundElement = false;
            }
        } catch (Exception exception){
            foundElement = false;
        }
        assertEquals(isDisplayed, foundElement);
    }
}
