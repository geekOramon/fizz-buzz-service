package junit;

import com.FizzBuzz.FizzBuzzStrategy;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by vasilis on 19-5-17.
 */

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzStrategyTest {

    FizzBuzzStrategy SUT;

    private static final String EXPECTED_FIZZBUZZ = "fizzbuzz";

    private static final int POINTED_WITH_FIFTEEN = 15;

    private static final int POINTED_WITH_THIRTY = 30;


    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{
                new Object[]{POINTED_WITH_FIFTEEN, EXPECTED_FIZZBUZZ},
                new Object[]{POINTED_WITH_THIRTY, EXPECTED_FIZZBUZZ},
        };
    }

    @Before
    public void setup() {

        SUT = new FizzBuzzStrategy();
    }


    @Test
    @Parameters(method = "getPointedNumbersAndSayNumbers")
    public void provideNumber_When_Gets_Number_Answers_ExpectedValue(int givenNumber, String expectedString) {

        //act
        final String actual = SUT.printResponse(givenNumber);

        //Assert
        Assert.assertEquals("Expected value is " + expectedString, expectedString, actual);

    }
}
