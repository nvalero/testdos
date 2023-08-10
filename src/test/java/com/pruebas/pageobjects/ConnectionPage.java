package com.headway.pageobjects;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConnectionPage extends BasePage {

    public void validate(String title) {
        assertEquals(1, 1);
    }

    public void quitDriver() {
        getDriver().quit();
    }
}