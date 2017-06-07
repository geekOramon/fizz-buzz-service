package features.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by vasilis on 31-5-17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "json:target/"},
        features = {"src/test/java/resources/feature/fizzStrategy/"}
)
public class FizzStrategyTest {
}
