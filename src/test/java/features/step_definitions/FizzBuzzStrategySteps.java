package features.step_definitions;

import com.FizzBuzz.FizzBuzzStrategy;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by vasilis on 31-5-17.
 */
public class FizzBuzzStrategySteps {
    FizzBuzzStrategy fbStrategy = new FizzBuzzStrategy();
    int numberProvided= 0;

    @Given("That the FizzBuzzStrategy applies since it can divided by both (.+) and (.+)")
    public void provideNumber(final Integer number, final Integer secondNumber){
        numberProvided = number * secondNumber;
        Assert.assertEquals("The strategy Applies",true, fbStrategy.strategyApplies(numberProvided));
    }


    @When("we ask for the text of number:(.+) ,it should be (.+) cause of FizzBuzzStrategy")
    public void printResponse(Integer number, String expected){
        String actual = fbStrategy.printResponse(number);
        Assert.assertEquals("expected reply is fizzbuzz", expected, actual);
    }


}
