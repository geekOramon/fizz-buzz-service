package features.step_definitions;

import com.FizzBuzz.*;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import sun.plugin2.gluegen.runtime.StructAccessor;

import java.util.List;

/**
 * Created by vasilis on 2-6-17.
 */
public class FizzBuzzSteps {
    int numberProvided= 0;
    private  List<RulePrintStrategy> rules;
    private  RulePrintStrategy defaultRule;
    @Given("that the set of rules are")
    public void provideRules(List<String> rules){
        for(String rule : rules){
            if(rule.startsWith("FizzBuzz")){
                this.rules.add(new FizzBuzzStrategy());
            }
            else if(rule.startsWith("Buzz")){
                this.rules.add(new BuzzStrategy());
            }
            else if(rule.startsWith("Fizz")){
                this.rules.add(new FizzStrategy());
            }
        }

    }
    @And("default rules is (.+)")
    public void provideDefaultRule(String defaultRule){
        if(defaultRule == "DefaultRuleStrategy")
        this.defaultRule = new DefaultPrintStrategy();
    }


    @When("we ask for the printed text of (.+)")
    public void printResponse(Integer number){
        numberProvided = number;

    }
    @Then("text should be (.+) cause of (.+)")
    public void assertResult(String expected, String strategy){
        String actual = "";
        RulePrintStrategy myStrategy;
        if(strategy.contains("FizzBuzz")){
            myStrategy = new FizzBuzzStrategy();
            actual =  myStrategy.printResponse(numberProvided);
        }
        else if(strategy.contains("Buzz")){
            myStrategy = new BuzzStrategy();
            actual =  myStrategy.printResponse(numberProvided);
        }
        else if(strategy.contains("Fizz")){
            myStrategy = new FizzStrategy();
            actual =  myStrategy.printResponse(numberProvided);
        }
        Assert.assertEquals("expected reply is " +expected +  "cause of "+ strategy, expected, actual);
    }
}
