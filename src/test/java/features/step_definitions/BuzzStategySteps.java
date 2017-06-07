package features.step_definitions;

import com.FizzBuzz.BuzzStrategy;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 * Created by vasilis on 31-5-17.
 */


public class BuzzStategySteps {
    BuzzStrategy buzzStrategy = new BuzzStrategy();
    int numberProvided= 0;

    @Given("That the BuzzStrategy applies for the number that can be divided by (.+)")
    public void provideNumber(final Integer number){
        numberProvided = number;
        Assert.assertEquals("The strategy Applies",true, buzzStrategy.strategyApplies(numberProvided));
    }


    @When("we ask for the text of number:(.+) ,it should be (.+) cause of BuzzStrategy")
    public void printResponse(Integer number, String expected){
        String actual = buzzStrategy.printResponse(number);
       Assert.assertEquals("expected reply is buzz", expected, actual);
    }


}
