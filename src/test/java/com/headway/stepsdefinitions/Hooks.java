package com.headway.stepsdefinitions;

import com.headway.pageobjects.ConnectionPage;
import io.cucumber.java.After;

public class Hooks {

    ConnectionPage connectionPage;

    @After
    public void afterScenario(){
        connectionPage.quitDriver();
        System.out.println("This will run after the Scenario");
    }
}