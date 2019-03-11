package demo.stepdefs;

import cucumber.api.java.en.Given;

public class printSteps {
    @Given("^I print out text$")
    public void i_have_a_value_of_A() {
        System.out.println("Printing out this text");
    }

    @Given("^I print out def$")
    public void i_print_out_def() {
        System.out.println("Printing out this def");
    }
}