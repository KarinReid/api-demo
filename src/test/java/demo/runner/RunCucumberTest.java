package demo.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.cli.Main;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"classpath:features"}
        // glue can be passed in by gradle task or at runtime using cli
)
public class RunCucumberTest {

    public static void main(String[] args) throws Throwable {

        Main.main(args);
    }
}