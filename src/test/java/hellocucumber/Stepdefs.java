package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {
    private String today;
    private String actualAnswer;
    private int numberX;
    private int numberY;
    private int sumXY;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("The number X and the number Y")
    public void define_NumberX_NumberY() {
        numberX = NumberStored.randomNumber();
        System.out.println("The number X is "+numberX);
        numberY = NumberStored.randomNumber();
        System.out.println("The number Y is "+numberY);
    }

    @When("I add X to Y")
    public void iAddXToY() {
        sumXY = (numberX + numberY);
    }

    @Then("The result should be the sum X+Y")
    public void theResultShouldBeTheSumXY() {
        assertEquals(numberX+numberY,sumXY);
        System.out.println();
        System.out.println("Sum of X and Y is "+sumXY);
    }
}

