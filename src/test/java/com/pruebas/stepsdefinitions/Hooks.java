package com.pruebas.stepsdefinitions;

import com.pruebas.pageobjects.ConnectionPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    ConnectionPage connectionPage;

    @After
    public void afterScenario(){
        connectionPage.quitDriver();
    }

    @Before
    public void beforeScenario(){
        connectionPage.getDriver().manage().window().maximize();
    }
}
