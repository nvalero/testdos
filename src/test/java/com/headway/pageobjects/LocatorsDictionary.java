package com.headway.definitions;

import org.openqa.selenium.By;

import java.util.Dictionary;
import java.util.Hashtable;

public class LocatorsDictionary {

    public Dictionary dropDownDictionary = new Hashtable();

    public LocatorsDictionary() {
        dropDownDictionary.put("company", By.id("company"));
        dropDownDictionary.put("year", By.id("year"));
        dropDownDictionary.put("trait", By.id("trait"));
        dropDownDictionary.put("breeding", By.id("breeding"));
        dropDownDictionary.put("cycle", By.id("cycle"));
        dropDownDictionary.put("location", By.id("location"));
        dropDownDictionary.put("environment", By.id("environment"));
        dropDownDictionary.put("cycleyear", By.id("cycleYear"));
    }

}
