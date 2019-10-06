package stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\poorn\\IdeaProjects\\AutomationPractise2\\src\\test\\java\\",
        glue={"stepDefinition"},
        tags={"@sanity"},
        //tags= {},
        plugin = {"pretty","html:target/destination" +""}
)
public class TestRunner {}


