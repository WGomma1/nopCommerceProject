package testRunners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "C:\\Users\\Waleed\\IdeaProjects\\nopCommerceProject\\src\\main\\resources",
        glue ={"stepDefinition"},
        plugin = {  "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"
                 },
        tags = "@smoke"
)
public class runners extends AbstractTestNGCucumberTests{
}
