package demo.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"classpath:gradle/cucumber"},
        glue = {"gradle.cucumber"}
)
public class RunCucumberTest {

    public static void main(String[] args) {
        JUnitCore.main(RunCucumberTest.class.getName());
    }
}