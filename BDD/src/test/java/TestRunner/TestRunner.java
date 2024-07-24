package TestRunner;

//This is my test runner class
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features//Customers.feature",
		glue="StepDefinitions",
		monochrome=true,
		//		tags= "@sanity", 
		//{"@sanity","@regression"} this will run both scenarios, acts as AND
		//{"@sanity,@regression"} this will run both scenarios, if available, acts as OR
		//dryRun=false;//shows unimplemented methods
		plugin= {"pretty","html:test-output"}
		)
public class TestRunner {

}