package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
        glue = "StepDefinitions",
        tags = " @validLogin or  @adminLogin or @scenarioOutline or @dataTable or @testcase2 or @database or  @DataTable or @searchId or @jobTitle",
        dryRun = false,
        plugin = {"pretty","html:target/Cucumber.html","json:target/Cucumber.json","rerun:target/failed.txt"})

public class smokeRunner {

    //target folder is mostly used for storing the test case execution reports generated using Cucumber

}
