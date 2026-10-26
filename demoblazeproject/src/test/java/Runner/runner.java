package Runner;

import io.cucumber.testng.*;
//
//@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "features/featuresE2E.feature",
	    glue = "stepdefinitions",
	    plugin = {"pretty", "html:target/cucumberReport.html"}
	)
public class runner extends AbstractTestNGCucumberTests {

}
