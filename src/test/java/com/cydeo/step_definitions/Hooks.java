package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In this class we ll be able to create "pre" and "post" conditions for all of the scenarios and even STEPS.
 */
public class Hooks {
    @Before
    public void setupMethod() {
        System.out.println("--> @Before: running before each scenario");
    }

    /*
    Will be executed automatically after EVERY scenario in the project.
     */
    @After
    public void teardownMethod(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        System.out.println("--> @After: running after each scenario");
        Driver.closeDriver();
    }

    // @BeforeStep
    public void setupStep() {
        System.out.println("--> @BeforeStep: running before each step");
    }

    //@AfterStep
    // public void teardownStep() {

    //System.out.println("--> @AfterStep: running after each step");
}

