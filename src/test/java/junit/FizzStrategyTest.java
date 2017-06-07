package junit;

import com.FizzBuzz.FizzStrategy;
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
public class FizzStrategyTest {

    FizzStrategy SUT;

    private static final String EXPECTED_FIZZ = "fizz";

    private static final int POINTED_WITH_THREE = 3;

    private static final int POINTED_WITH_SIX = 6;


    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{
                new Object[]{POINTED_WITH_THREE, EXPECTED_FIZZ},
                new Object[]{POINTED_WITH_SIX, EXPECTED_FIZZ},
        };
    }

    @Before
    public void setup() {

        SUT = new FizzStrategy();
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
