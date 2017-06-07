package junit;

import com.FizzBuzz.DefaultPrintStrategy;
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
public class DefaultPrintStrategyTest {

    DefaultPrintStrategy SUT;

    private static final String EXPECTED_ONE = "1";
    private static final String EXPECTED_TWO = "2";
    private static final int POINTED_WITH_ONE = 1;
    private static final int POINTED_WITH_TWO = 2;

    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{
                new Object[]{POINTED_WITH_ONE, EXPECTED_ONE},
                new Object[]{POINTED_WITH_TWO, EXPECTED_TWO},
        };
    }

    @Before
    public void setup() {

        SUT = new DefaultPrintStrategy();
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
