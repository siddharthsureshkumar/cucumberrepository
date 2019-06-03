package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features\\tagDemo.feature",glue= {"stepDef"},plugin= {"html:cucumber-html-report"},tags= {"@SmokeTest", "~@End2End"})
public class run {
	
	

}