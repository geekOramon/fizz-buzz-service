package junit;

import com.FizzBuzz.BuzzStrategy;
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
public class BuzzStrategyTest {

    BuzzStrategy SUT;

    private static final String EXPECTED_BUZZ = "buzz";

    private static final int POINTED_WITH_FIVE = 5;

    private static final int POINTED_WITH_TEN = 10;


    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{
                new Object[]{POINTED_WITH_FIVE, EXPECTED_BUZZ},
                new Object[]{POINTED_WITH_TEN, EXPECTED_BUZZ},
        };
    }

    @Before
    public void setup() {

        SUT = new BuzzStrategy();
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
