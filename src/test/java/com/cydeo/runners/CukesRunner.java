package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html", // generating a report
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions", //hook classes
        dryRun = false,
        tags = "@ceos or @scientists",
        publish = true //generating a report with public link

)
public class CukesRunner {}
