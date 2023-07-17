package com.headway.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
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

    @FindBy(id = "react-select-42-listbox")
    private WebElement companyDropdownMenuAr;

    @FindBy(id = "react-select-42-option-2")
    private WebElement companyDropdownMenuChina;

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

    @FindBy(css = ".react-select__menu.css-1nmdiq5-menu")
    private WebElement optionsMenuElement;

    @FindBy(css = ".react-select__menu-list.css-qr46ko .react-select__option")
    private List<WebElement> cycleDropdownOptionsDisplayed;

    //@FindBy(css = ".react-select__input")
    //private WebElement cycleClickeableDropdownField;

    @FindBy(css = ".react-select__menu-notice")
    private WebElement cycleNoOptionMessage;

    public ModifyNewSeriesPage() {
    }

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
        companyIconDropdown.click();

        WebElement inputElement = companyIconDropdown.findElement(By.cssSelector("input.react-select__input"));
        inputElement.sendKeys("INA");

        try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            // Handle InterruptedException
        }
    }

    public void sequentialSearchDisplayed() {
        WebElement selectedOptionAr = companyDropdownMenuAr.findElement(By.cssSelector(".react-select__option--is-selected"));
        String valueAr = selectedOptionAr.getText();
        //assertEquals("GDM ARGENTINA", valueAr);

    }

    public void TypeZZFieldCompany(){
        companyIconDropdown.click();

        WebElement inputElement = companyIconDropdown.findElement(By.cssSelector("input.react-select__input"));
        inputElement.sendKeys("ZZ");

        try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            // Handle InterruptedException
        }
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
        yearIconDropDown.click();
        try {
            Thread.sleep(5000); // Wait for 10 seconds
        } catch (InterruptedException e) {
            // Handle InterruptedException
        }
        yearIconDropDown.sendKeys("0");
        try {
            Thread.sleep(5000); // Wait for 10 seconds
        } catch (InterruptedException e) {
            // Handle InterruptedException
        }
    }

    public void typeInTheFieldYearWrong() {
        yearIconDropDown.sendKeys("AA");
    }

    public void displaysMessageNoOptionsForYear() {
        yearNoOptionMessage.isDisplayed();
    }

    public void clickDropdownFieldBreeding() {
        breedingIconDropDown.click();
    }

    @FindBy(xpath = "//div[contains(@class, 'react-select__single-value')]")
    private WebElement fwsFwbSimpleCross;
    public void displayDropdownWithValues() {
        fwsFwbSimpleCross.isDisplayed();
        boolean equals = fwsFwbSimpleCross.getText().equals("FWS - FWB Simple cross");
    }

    public void typeInBreedingField() {
        breedingIconDropDown.click();

        WebElement inputElement = breedingIconDropDown.findElement(By.className("react-select__single-value"));
        inputElement.sendKeys("CROSS");

        try {
            Thread.sleep(3000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            // Handle InterruptedException
        }
    }

    public void displaysBreeding() {
        WebElement inputElement = breedingIconDropDown.findElement(By.className("react-select__single-value"));
        inputElement.isDisplayed();
    }

    public void clickOnDropDownFieldTrait() {
        traitIconDropdown.click();
    }

    public void traitDisplaysTheDropdownWithElements() {
        traitIconDropdown.isDisplayed();
    }

    public void typesInTheFieldTrait () {
        traitIconDropdown.click();

        WebElement inputElement = traitIconDropdown.findElement(By.cssSelector(".react-select__control.css-13q36ur-control"));
        inputElement.sendKeys("SS");

        try {
            Thread.sleep(3000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            // Handle InterruptedException
        }
    }

    public void traitDisplaysTheMessageNoOptions() {
        optionsMenuElement.isDisplayed();
    }

    public void clickOnDropdownFieldCycle() {
        cycleIconDropDown.click();
    }

    public void displaysCycleDropdownWithData() {
        for (WebElement cycleElements : cycleDropdownOptionsDisplayed) {
            cycleElements.isDisplayed();
        }
    }

    public void typesInTheFieldCycle() {
        WebElement cycleClickeableDropdownField = cycleIconDropDown.findElement(By.cssSelector(".react-select__input"));
        cycleClickeableDropdownField.sendKeys("CR");
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException ignored) { }
        for (WebElement cycleElements : cycleDropdownOptionsDisplayed) {
            String optionText = cycleElements.getText();
            cycleElements.isDisplayed();
            assertEquals(optionText, "AxB - Initial cross>");
        }
    }

    public void typeInFieldCycle(String var) {
        WebElement cycleClickeableDropdownField = cycleIconDropDown.findElement(By.cssSelector(".react-select__input"));
        cycleClickeableDropdownField.sendKeys(var);
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException ignored) { }
    }

    public void cycleNoOptionMessage(String var) {
        String noOptionText = cycleNoOptionMessage.getText();
        assertEquals(noOptionText, var);
    }

    public void clickOnCancelButton() {
        cancelButton.click();;
    }

    @FindBy(css = "tr._rows_16dgm_83 td")
    private List<WebElement> columnRows;

    public void seriesNotModified() {
        for (WebElement row : columnRows) {
            List<WebElement> spanElements = row.findElements(By.tagName("span"));
            System.out.println("print all the elements inside the row: " + spanElements);
            // for (WebElement span : spanElements) {
            //     String spanText = span.getText();
            //     System.out.println("print a specific column inside the row: " + spanText);
            // }
        }
    }
}
