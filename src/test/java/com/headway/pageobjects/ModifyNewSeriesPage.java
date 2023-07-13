package com.headway.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifyNewSeriesPage extends PageObject {

    @FindBy(css = "svg[data-testid='EditOutlinedIcon']")
    private WebElement editIconButton;

    @FindBy(className = "_title_x6167_5")
    private WebElement editSeriesTitle;

    @FindBy(css = "svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-vubbuv[data-testid='CloseIcon']")
    private WebElement closeIcon;

    @FindBy(className = "_large_ypyit_5")
    private WebElement editSeriesMessage;

    @FindBy(xpath = "//span[contains(@class, '_large_ypyit_5 _bold_ypyit_45')]")
    private WebElement seriesNameElement;

    @FindBy(className = "_children_1qoso_20[for='company'")
    private WebElement companyIconLabel;

    @FindBy(id = "company")
    private WebElement companyIconDropdown;

    @FindBy(css = "label._label_1qoso_5[for='year']")
    private WebElement yearIconLabel;

    @FindBy(id = "year")
    private WebElement yearIconDropDown;

    @FindBy(css = "label._label_1qoso_5[for='description']")
    private WebElement descriptionLabel;

    @FindBy(id = "description")
    private WebElement descriptionTextarea;

    @FindBy(css = "label._label_1qoso_5[for='trait']")
    private WebElement traitIconLabel;

    @FindBy(id = "trait")
    private WebElement traitIconDropdown;

    @FindBy(css = "label._label_1qoso_5[for='breeding']")
    private WebElement breedingIconLabel;

    @FindBy(id = "breeding")
    private WebElement breedingIconDropDown;

    @FindBy(css = "hr.MuiDivider-root._divider_14ef7_26")
    private WebElement dividerElement;

    @FindBy(css = "label._label_1qoso_5[for='cycle']")
    private WebElement cycleIconLabel;

    @FindBy(id = "cycle")
    private WebElement cycleIconDropDown;

    @FindBy(css = "label._label_1qoso_5[for='location']")
    private WebElement locationIconLabel;

    @FindBy(id = "location")
    private WebElement locationIconDropDown;

    @FindBy(css = "label._label_1qoso_5[for='environment']")
    private WebElement environmentIconLabel;

    @FindBy(id = "environment")
    private WebElement environmentIconDropDown;

    @FindBy(css = "label._label_1qoso_5[for='cycleYear']")
    private WebElement cycleYearIconLabel;

    @FindBy(id = "cycleYear")
    private WebElement cycleYearIconDropDown;

    @FindBy(className = "_secondary_1cvem_39")
    private WebElement cancelButton;

    @FindBy(css = "span._small_ypyit_21._bold_ypyit_45._textcolor_phx9n_142")
    private WebElement informationElement;

    @FindBy(xpath = "//button[@class='_loading_1cvem_110' and @type='submit']")
    private WebElement editSeriesButton;

    @FindBy(xpath = "//div[@class='react-select__menu-list']//div[@class='react-select__option']")
    private List<WebElement> companyDropdownOptions;

    @FindBy(id = "react-select-18-listbox")
    private WebElement noOptionMessage;

    @FindBy(id = "react-select-19-listbox")
    private WebElement yearNoOptionMessage;

    @FindBy(id = "react-select-19-option-0")
    private WebElement yearOption2023;

    @FindBy(id = "react-select-19-option-1")
    private WebElement yearOption2024;

    public void clickEditIconButton() {
        editIconButton.click();
    }

    public void editSeriesDrawerIsDisplayed() {
        editSeriesTitle.isDisplayed();
    }

    public void closeIconIsDisplayed() {
        closeIcon.isDisplayed();
    }

    public void dividerElement() {
        dividerElement.isDisplayed();
    }

    public void getSeriesName() {
        seriesNameElement.isDisplayed();
        String seriesName = seriesNameElement.getText();
        assertEquals(seriesNameElement.getText(), seriesName);
    }

    public void companyDropDownIsDisplayed() {
        companyIconDropdown.isDisplayed();
        assert !companyIconDropdown.getText().trim().isEmpty() : "Company dropdown is empty or does not have valid information";
    }

    public void YearDropDownIsDisplayed() {
        yearIconDropDown.isDisplayed();
        assert !yearIconDropDown.getText().trim().isEmpty() : "Year dropdown is empty or does not have valid information";

    }

    public void descriptionFieldIsDisplayed() {
        descriptionTextarea.isDisplayed();
        assert !descriptionTextarea.getText().trim().isEmpty() : "Description text area is empty or does not have valid information";

    }

    public void traitDropdownIsDisplayed() {
        traitIconDropdown.isDisplayed();
        assert !traitIconDropdown.getText().trim().isEmpty() : "Trait dropdown is empty or does not have valid information";

    }
    public void breadingDropdownIsDisplayed() {
        breedingIconDropDown.isDisplayed();
        assert !breedingIconDropDown.getText().trim().isEmpty() : "Breeding dropdown is empty or does not have valid information";

    }

    public void cycleDropdownIsDisplayed() {
        cycleIconDropDown.isDisplayed();
        assert !cycleIconDropDown.getText().trim().isEmpty() : "Cycle dropdown is empty or does not have valid information";

    }

    public void locationDropdownIsDisplayed() {
        locationIconDropDown.isDisplayed();
        assert !locationIconDropDown.getText().trim().isEmpty() : "Location dropdown is empty or does not have valid information";

    }

    public void environmentDropdownIsDisplayed() {
        environmentIconDropDown.isDisplayed();
        assert !environmentIconDropDown.getText().trim().isEmpty() : "Environment dropdown is empty or does not have valid information";

    }

    public void cycleYearDropdownIsDisplayed() {
        cycleYearIconDropDown.isDisplayed();
        assert !cycleYearIconDropDown.getText().trim().isEmpty() : "Cycle Year dropdown is empty or does not have valid information";

    }

    public void messageInformation() {
        informationElement.isDisplayed();
    }

    public void createSeriesButtonIsDisplayed() {
        editSeriesButton.isDisplayed();
    }

    public void clickCloseIconButton() {
        closeIcon.click();
    }

    public void clickCompanyDropdown() {
        companyIconDropdown.click();
    }

    public void validateCompanyOption() {
        companyIconDropdown.click();
        List<String> optionTexts = companyDropdownOptions.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        List<String> expectedOptions = Arrays.asList("GDM ARGENTINA", "GDM BRASIL", "GDM CHINA", "GDM EU", "GDM USA");

        for (String expectedOption : expectedOptions) {
            assert optionTexts.contains(expectedOption) : "Option '" + expectedOption + "' is missing in the dropdown.";
        }
    }

    public void TypeINAFieldCompany() {
        companyIconDropdown.sendKeys("INA");
    }

    public void sequentialSearchDisplayed() {
        List<String> optionTexts = companyDropdownOptions.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        List<String> expectedOptions = Arrays.asList("GDM ARGENTINA", "GDM CHINA");

        for (String expectedOption : expectedOptions) {
            assert optionTexts.contains(expectedOption) : "Option '" + expectedOption + "' is missing in the dropdown.";
        }
    }

    public void TypeZZFieldCompany(){
        companyIconDropdown.sendKeys("ZZ");
    }

    public void displaysMessageNoOptions() {
        noOptionMessage.isDisplayed();
    }

    public void clickYearDropdown() {
        yearIconDropDown.click();
    }

    public void sequentialSearchDisplayedForYearField() {
        yearOption2023.isDisplayed();
        yearOption2024.isDisplayed();
    }

    public void typeInTheFieldYear() {
        yearIconDropDown.sendKeys("0");
    }

    public void typeInTheFieldYearWrong() {
        yearIconDropDown.sendKeys("AA");
    }

    public void displaysMessageNoOptionsForYear() {
        yearNoOptionMessage.isDisplayed();
    }


}
