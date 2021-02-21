package com.learning.assignment.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/reports.html"},
		tags= "@smoke",
		features = "src/test/java/com/learning/assignment/features", 
		glue = { "com.learning.assignment.utility","com.learning.assignment.stepdefinitions" },dryRun=false, monochrome= true
		)
public class RunCucumberTest {

}
