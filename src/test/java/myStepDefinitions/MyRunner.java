package myStepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium_WS\\Cucum_demo1\\myFeatures\\demo_tags.feature",glue = "myStepDefinitions",tags = {"@Regression,@Smoke"})



public class MyRunner {

}
