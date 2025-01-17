package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features/Login.feature","features/Login2.feature"},
glue = {"step.definitions"},
plugin = {"html:htmlreport/cucumber-test-report.html","json:target/cucumber-report.json","pretty"},
tags = 	"@tag123"	)
public class TestRunner extends AbstractTestNGCucumberTests{

}