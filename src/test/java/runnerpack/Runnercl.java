package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature", glue= {"stepdefination"}, tags="@Smoke")

public class Runnercl {
	

}
