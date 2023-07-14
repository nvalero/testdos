package com.headway.pageobjects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

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

    @FindBy(className = "_medium_1cvem_146_ghost_1cvem_75")
    WebElement signOutBtn;

    @FindBy(className = "_xxl_ypyit_72")
    WebElement seriesManagerLogo;

    @FindBy(className = "_hamburgerMenu_yahwz_13")
    WebElement hamburgerMenuBtn;

    @FindBy(className = "_container_1bgk0_77")
    WebElement seriesContainer;

    @FindBy(css = "#root > div > nav > div > ul > li:nth-child(2) > a > div > svg")
    WebElement nurseryAppBtn;

    @FindBy(css = "#root > div > nav > div > ul > li:nth-child(4) > a > div > svg")
    WebElement seriesManagerBtn;

    @FindBy(css = "#root > div > nav > div > ul > li:nth-child(5) > a > div > svg")
    WebElement addNewSeriesHamburgerBtn;

    @FindBy(css = "#root > div > nav > div > ul > li:nth-child(1) > div > button > svg")
    WebElement closeHamburgerBtn;

    @FindBy(css = "#root > div > section > main > div > article > table > tbody > tr:nth-child(1) > td:nth-child(14) > span > div > a:nth-child(2) > svg")
    WebElement deleteSerie;

    @FindBy(css = "_container_1rw5t_8 _new_1rw5t_18")
    WebElement statusSerie;

    private static final String SERIE_LINK_LOCATOR_TEMPLATE = "//span[@title=\"%s\"]";
    private static final String SERIE_ANCESTOR_LINK_LOCATOR_TEMPLATE = "//span[@title=\"%s\"]/ancestor::td/ancestor::tr";
    private static final String EDIT_SERIE_LINK_LOCATOR_TEMPLATE = "//span[@title=\"%s\"]/ancestor::td/ancestor::tr//td[14]//span//div//a[1]";
    private static final String DELETE_SERIE_LINK_LOCATOR_TEMPLATE = "//span[@title=\"%s\"]/ancestor::td/ancestor::tr" +
            "//td[14]//span//div//a[2]";

    public void getSerie(String serie) {
        getDriver().findElement(By.xpath(String.format(SERIE_LINK_LOCATOR_TEMPLATE, serie)));
    }
    public void getSerieRow(String serie) {
        getDriver().findElement(By.xpath(String.format(SERIE_ANCESTOR_LINK_LOCATOR_TEMPLATE, serie)));
    }

    public void editSerieRow(String serie) {
        getDriver().findElement(By.xpath(String.format(EDIT_SERIE_LINK_LOCATOR_TEMPLATE, serie)));
    }

    public void deleteSerieRow(String serie) {
        getDriver().findElement(By.xpath(String.format(DELETE_SERIE_LINK_LOCATOR_TEMPLATE, serie)));
    }
    public void connect() {
        username.sendKeys(("ext.nvalero@gdmseeds.com"));
        clickUser.click();
        password.sendKeys("NV2023gdm+");
        clickPassword.click();
        Next2.click();
    }

    public void isHamburgerMenuDisplayed(){
        hamburgerMenuBtn.click();
        nurseryAppBtn.isDisplayed();
        seriesManagerBtn.isDisplayed();
        addNewSeriesHamburgerBtn.isDisplayed();
        companyLogo.isDisplayed();
        closeHamburgerBtn.click();
    }

    public void isHeaderDisplayed(){
        signOutBtn.isDisplayed();
        seriesManagerLogo.isDisplayed();
    }

    public void isMiddleDisplayed(){
        seriesContainer.isDisplayed();
        createSerie.isDisplayed();
    }

    public void isDeleteSerieDisplayed(){ assertTrue(deleteSerie.isDisplayed()); }

    public void validate() {
        assertEquals(title.getText(), "Series Manager");
    }

    public void createSerie() {
        createSerie.click();
    }

    public void deleteSerie(){ deleteSerie.click();}

}