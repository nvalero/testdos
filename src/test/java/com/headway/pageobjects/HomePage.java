package com.headway.pageobjects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @Inject
    LocatorsDictionary locatorsDictionary = new LocatorsDictionary();

    @FindBy(id = "i0116")
    WebElement username;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div > div > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElement clickUser;

    @FindBy(id = "i0118")
    WebElement password;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.animate.has-identity-banner.slide-in-next > div > div.password-reset-links-container.ext-password-reset-links-container > div.win-button-pin-bottom.boilerplate-button-bottom > div > div > div > div")
    WebElement clickPassword;

    @FindBy(css = "#lightbox > div:nth-child(3) > div > div.pagination-view.has-identity-banner.animate.slide-in-next" +
            " > div > div:nth-child(8) > div.row.move-buttons > div > div > div:nth-child(2)")
    WebElement Next2;

    @FindBy(css = "#root > div > header > div > div > section > h1 > span")
    WebElement title;

    @FindBy(css = "._newseriesbutton_1bgk0_26")
    WebElement createSerie;

    @FindBy(className = "_companylogo_yahwz_54")
    WebElement companyLogo;

    By signOutBtn = By.cssSelector("._medium_1cvem_146._ghost_1cvem_75");

    By seriesManagerLogo = By.cssSelector("._xxl_ypyit_72");

    By hamburgerMenuBtn = By.cssSelector("._hamburgerMenu_yahwz_13");

    @FindBy(className = "_container_1bgk0_77")
    WebElement seriesContainer;

    By nurseryAppBtn = By.cssSelector("#root > div > nav > div > ul > li:nth-child(2) > a > div > svg");

    @FindBy(css = "#root > div > nav > div > ul > li:nth-child(4) > a > div > svg")
    WebElement seriesManagerBtn;

    @FindBy(css = "#root > div > nav > div > ul > li:nth-child(5) > a > div > svg")
    WebElement addNewSeriesHamburgerBtn;

    @FindBy(css = "#root > div > nav > div > ul > li:nth-child(1) > div > button > svg")
    WebElement closeHamburgerBtn;

    @FindBy(css = ".MuiPopover-root.MuiMenu-root.MuiModal-root a")
    WebElement disableButton;

    @FindBy(css = "#root > div > section > main > div > article > table > tbody > tr:nth-child(1) > td:nth-child(14) > span > div > a:nth-child(2) > svg")
    WebElement deleteSerie;

    @FindBy(css = "_container_1rw5t_8 _new_1rw5t_18")
    WebElement statusSerie;

    private static final String SERIE_LINK_LOCATOR_TEMPLATE = "//span[@title=\"%s\"]";
    private static final String SERIE_ANCESTOR_LINK_LOCATOR_TEMPLATE = "//span[@title=\"%s\"]/ancestor::td/ancestor::tr";
    private static final String EDIT_SERIE_LINK_LOCATOR_TEMPLATE = "//td[@title=\"%s\"]/ancestor::tr/ancestor::tr//td" +
            "[14]//span//div//a[1]";
    private static final String DELETE_SERIE_LINK_LOCATOR_TEMPLATE = "//td[@title=\"%s\"]/ancestor::tr/ancestor::tr" +
            "//td[14]//span//div//a[2]";

    private static final String SERIE_LINK_LOCATOR_TEMPLATEXX = "//td[@title=\"%s\"]";
    private static final String DISABLE_SERIE_LINK_LOCATOR_TEMPLATE = "//td[@title=\"%s\"]//ancestor::tr//td[14]//span//div//span";
    private static final String STATUS_SERIE_LINK_LOCATOR_TEMPLATE = "//td[@title=\"%s\"]//ancestor::tr//td[6]";
    private static final String LINK_SERIE_LOCATOR_TEMPLATE = "//td[@title=\"%s\"]//ancestor::tr//td[1]//a";
    private static final String STATUS_SERIE_LOCATOR_TEMPLATE = "//div[text()=\"%s\"]//ancestor::tr//td[1]//a";
    private static final String COLUMN_LOCATOR_TEMPLATE = "//td[@title=\"%s\"]//ancestor::tr//td[%s]//span";
    private static final String ENVIRONMENT_LOCATOR_TEMPLATE = "//td[@title=\"%s\"]//ancestor::tr//td[11]//span";
    private static final String CYCLEYEAR_LOCATOR_TEMPLATE = "//td[@title=\"%s\"]//ancestor::tr//td[12]//span";


    public void statusIsValue(String serie, String status) {
        assertEquals(getStatus(serie), status.toUpperCase());
    }

    public String getStatus(String serie) {
        return getDriver().findElement(By.xpath(String.format(STATUS_SERIE_LINK_LOCATOR_TEMPLATE, serie))).getText().toUpperCase();
    }

    public void disableSerieRow(String serie) {
        getDriver().findElement(By.xpath(String.format(DISABLE_SERIE_LINK_LOCATOR_TEMPLATE, serie))).click();
        disableButton.click();
    }

    public void disableSerieRowisEnabled(String serie) {
        getDriver().findElement(By.xpath(String.format(DISABLE_SERIE_LINK_LOCATOR_TEMPLATE, serie))).click();
        disableButton.click();
    }

    public void clickSerie(String serie) {
        getDriver().findElement(By.xpath(String.format(LINK_SERIE_LOCATOR_TEMPLATE, serie))).click();
    }
    public void getSerieRow(String serie) {
        getDriver().findElement(By.xpath(String.format(SERIE_ANCESTOR_LINK_LOCATOR_TEMPLATE, serie)));
    }

    public WebElement editSerieRow(String serie) {
        return getDriver().findElement(By.xpath(String.format(EDIT_SERIE_LINK_LOCATOR_TEMPLATE, serie)));
    }

    public WebElement deleteSerieRow(String serie) {
        return getDriver().findElement(By.xpath(String.format(DELETE_SERIE_LINK_LOCATOR_TEMPLATE, serie)));
    }

    public void isHamburgerMenuDisplayed(){
        webElementIsEnabled(hamburgerMenuBtn, true);
        getDriver().findElement(hamburgerMenuBtn).click();
        webElementIsDisplayed(nurseryAppBtn, true);
        seriesManagerBtn.isDisplayed();
        addNewSeriesHamburgerBtn.isDisplayed();
        companyLogo.isDisplayed();
        closeHamburgerBtn.click();
    }

    public void isHeaderDisplayed(){
        webElementIsDisplayed(signOutBtn, true);
        companyLogo.isDisplayed();
    }

    public void isMiddleDisplayed(){
        seriesContainer.isDisplayed();
        createSerie.isDisplayed();
    }

    public void isDeleteSerieDisplayed(boolean displayed){ assertEquals(deleteSerie.isDisplayed(), displayed); }

    public void isEditSerieDisplayed(boolean isDisplayed, String serie){
        boolean foundElement;
        try{
            foundElement = editSerieRow(serie).isDisplayed();
        } catch (Exception exception){
            foundElement = false;
        }
        assertEquals(isDisplayed, foundElement);
    }

    public void isSpecificDeleteSerieDisplayed(boolean isDisplayed, String serie){
        boolean foundElement;
        try{
            foundElement = deleteSerieRow(serie).isDisplayed();
        } catch (Exception exception){
            foundElement = false;
        }
        assertEquals(isDisplayed, foundElement);
    }
    public void validate() {
        waitForElement().until(ExpectedConditions.visibilityOf(title));
        assertEquals(title.getText(), "Series Manager");
    }

    public void createSerie() {
        createSerie.click();
    }

    public void deleteSerie(){ deleteSerie.click();}

    public void selectsSerieWithStatus(String status) {
        getDriver().findElement(By.xpath(String.format(STATUS_SERIE_LOCATOR_TEMPLATE, status))).click();
    }

    public void hasValuesInColumn(String value, String serie, String column) {
        waitForElement().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(COLUMN_LOCATOR_TEMPLATE, serie, locatorsDictionary.columnDictionary.get(
                column)))));
        assert(getDriver().findElement(By.xpath(String.format(COLUMN_LOCATOR_TEMPLATE, serie, locatorsDictionary.columnDictionary.get(
                column)))).getText().equals(value));
    }
}