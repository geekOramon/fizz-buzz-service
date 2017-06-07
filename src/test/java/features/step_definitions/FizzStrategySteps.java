package features.step_definitions;

import com.FizzBuzz.FizzStrategy;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by vasilis on 31-5-17.
 */
public class FizzStrategySteps {
    FizzStrategy fizzStrategy = new FizzStrategy();
    int numberProvided= 0;

    @Given("That the FizzStrategy applies for the number that can be divided by (.+)")
    public void provideNumber(final Integer number){
        numberProvided = number;
        Assert.assertEquals("The strategy Applies",true, fizzStrategy.strategyApplies(numberProvided));
    }


    @When("we ask for the text of number:(.+) ,it should be (.+) cause of FizzStrategy")
    public void printResponse(Integer number, String expected){
        String actual = fizzStrategy.printResponse(number);
        Assert.assertEquals("expected reply is fizz", expected, actual);
    }


}
