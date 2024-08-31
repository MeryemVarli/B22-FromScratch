package com.luma.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/lumaProject",  //path until the feature directory not until the file
        glue = "com/luma/stepDefinitions", //path to stepdef
        dryRun = false,
        plugin = {"pretty", "html:target/uiReport.html","rerun:target/uiFailedTests.txt",
                "json:target/cucumber-reports/cucumber.json"}


)
public class LumaRunner {
}
