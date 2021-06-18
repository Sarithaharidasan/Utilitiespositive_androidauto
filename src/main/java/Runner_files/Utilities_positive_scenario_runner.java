package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Utilities_positive_scenarios\\Utilities_positive_scenarios.feature",
glue= {"Utilities_positive_scenarios"},
monochrome = true,publish = true)
public class Utilities_positive_scenario_runner extends AbstractTestNGCucumberTests {

}