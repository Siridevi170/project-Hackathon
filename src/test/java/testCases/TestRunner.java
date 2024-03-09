package testCases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			//features= {".//FeatureFiles/Feature.feature"},
		features= {"C:\\Users\\2303757\\eclipse-workspace\\hackathon (2)\\hackathon\\hackathon\\src\\test\\resources\\FeatureFile\\Feature.feature"},
			glue="stepDefnitions" ,
			plugin= {"html:Reports/CucumberReport.html",
					  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
			 
			
	 
	public class TestRunner {
		
	 
	}

//"rerun:target/rerun.txt"
