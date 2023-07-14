package com.headway.pageobjects;

import static org.junit.jupiter.api.Assertions.assertTrue;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteSeriePage extends PageObject {

    @FindBy(className = "_title_x6167_5")
    WebElement title;

    @FindBy (css = "body > div.MuiDialog-root._container_gyx38_1.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div._container_utv3n_1 > button._secondary_1cvem_39")
    WebElement backButton;

    @FindBy (css = "body > div.MuiDialog-root._container_gyx38_1.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div._container_utv3n_1 > button._primary_1cvem_5")
    WebElement acceptButton;

    @FindBy (css = "body > div.MuiDialog-root._container_gyx38_1.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > section > div._icon_41q16_1 > svg")
    WebElement closeButton;

    public void acceptButton(){ acceptButton.click(); waitFor(4);}

    public void backButton(){ backButton.click();}

    public  void closeButton(){ closeButton.click(); }

    public void validateDeleteSeriePage(){ assertTrue(title.isDisplayed()); }

}
