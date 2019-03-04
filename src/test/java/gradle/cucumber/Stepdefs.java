package gradle.cucumber;

import cucumber.api.java.en.Given;

public class Stepdefs {
    @Given("^I print out text$")
    public void i_have_a_value_of_A() {
        System.out.println("Printing out this text");
    }
}