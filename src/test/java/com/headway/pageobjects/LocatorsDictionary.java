package com.headway.pageobjects;

import org.openqa.selenium.By;

import java.util.Dictionary;
import java.util.Hashtable;

public class LocatorsDictionary {

    public Dictionary dropDownDictionary = new Hashtable();
    public Dictionary dropDownItemDictionary = new Hashtable();
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
        dropDownDictionary.put("breeding", By.id("breeding"));
        dropDownDictionary.put("cycle", By.id("cycle"));
        dropDownDictionary.put("location", By.id("location"));
        dropDownDictionary.put("environment", By.id("environment"));
        dropDownDictionary.put("cycleyear", By.id("cycleYear"));

        dropDownItemDictionary.put("company", COMPANY_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("year", YEAR_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("trait", TRAIT_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("breeding", BREEDING_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("cycle", CYCLE_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("location", LOCATION_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("environment", ENVIRONMENT_ITEM_LOCATOR_TEMPLATE);
        dropDownItemDictionary.put("cycleyear", CYCLE_YEAR_ITEM_LOCATOR_TEMPLATE);
    }

}
