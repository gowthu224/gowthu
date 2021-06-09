package com.CG.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",glue = "com.CG.StepDefinition", dryRun=true,monochrome = true,plugin ={"pretty","json:target/cucumber.json","html:target/index.html"})
public class TestRunner {

}
