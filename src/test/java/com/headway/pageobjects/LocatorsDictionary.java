package com.headway.pageobjects;

import org.openqa.selenium.By;

import java.util.Dictionary;
import java.util.Hashtable;

public class LocatorsDictionary {

    public Dictionary dropDownDictionary = new Hashtable();
    public Dictionary dropDownItemDictionary = new Hashtable();
    public Dictionary columnDictionary = new Hashtable();
    public Dictionary inputDictionary = new Hashtable();
    private static final String COMPANY_ITEM_LOCATOR_TEMPLATE = "react-select-2-option-%s";
    private static final String YEAR_ITEM_LOCATOR_TEMPLATE = "react-select-3-option-%s";
    private static final String TRAIT_ITEM_LOCATOR_TEMPLATE = "react-select-4-option-%s";
    private static final String BREEDING_ITEM_LOCATOR_TEMPLATE = "react-select-5-option-%s";
    private static final String CYCLE_ITEM_LOCATOR_TEMPLATE = "react-select-6-option-%s";
    private static final String LOCATION_ITEM_LOCATOR_TEMPLATE = "react-select-7-option-%s";
    private static final String ENVIRONMENT_ITEM_LOCATOR_TEMPLATE = "react-select-8-option-%s";
    private static final String CYCLE_YEAR_ITEM_LOCATOR_TEMPLATE = "react-select-9-option-%s";
    private static final String SERIE_LINK_LOCATOR_TEMPLATE = "//span[@title=\"%s\"]";

    public LocatorsDictionary() {
        dropDownDictionary.put("company", By.id("company"));
        dropDownDictionary.put("year", By.id("year"));
        dropDownDictionary.put("trait", By.id("trait"));
        dropDownDictionary.put("breed", By.id("breeding"));
        dropDownDictionary.put("cycle", By.id("cycle"));
        dropDownDictionary.put("location", By.id("location"));
        dropDownDictionary.put("environment", By.id("environment"));
        dropDownDictionary.put("cycleyear", By.id("cycleYear"));

        dropDownItemDictionary.put("company", COMPANY_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("year", YEAR_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("trait", TRAIT_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("breed", BREEDING_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("cycle", CYCLE_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("location", LOCATION_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("environment", ENVIRONMENT_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("cycleyear", CYCLE_YEAR_ITEM_LOCATOR_TEMPLATE);

        columnDictionary.put("year", 3);
        columnDictionary.put("breed", 5);
        columnDictionary.put("trait", 7);
        columnDictionary.put("company", 8);
        columnDictionary.put("cycle", 9);
        columnDictionary.put("location", 10);
        columnDictionary.put("environment", 11);
        columnDictionary.put("cycleyear", 12);

        inputDictionary.put("company", By.id("react-select-2-input"));
        inputDictionary.put("year", By.id("react-select-3-input"));
        inputDictionary.put("trait", By.id("react-select-4-input"));
        inputDictionary.put("breed", By.id("react-select-5-input"));
        inputDictionary.put("cycle", By.id("react-select-6-input"));
        inputDictionary.put("location", By.id("react-select-7-input"));
        inputDictionary.put("environment", By.id("react-select-8-input"));
    }
}
