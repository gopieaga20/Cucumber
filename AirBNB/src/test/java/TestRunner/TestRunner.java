package TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Airbnb.com.Baseclass.Baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resources\\reports\\E_report.html"},
features ="src\\test\\java\\Feature",glue = "Stepdefinition" ,dryRun = false)

public class TestRunner extends Baseclass {

	
	@AfterClass
	public static void quit() {
		// TODO Auto-generated method stub
driver.quit();
	}
}
