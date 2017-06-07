package com.FizzBuzz;

/**
 * Created by vasilis on 19-5-17.
 */
public class FizzBuzzStrategy implements RulePrintStrategy {

    public static final Integer FIZZ_BUZZ_VALUE = 15;
    public static final String FIZZ_BUZZ_STR = "fizzbuzz";

    public boolean strategyApplies(Integer value) {
        boolean result = false;
        if(Math.floorMod(value, FIZZ_BUZZ_VALUE) == 0){
            result = true;
        }
        return result;
    }

    public String printResponse(Integer givenNumber) {
        return FIZZ_BUZZ_STR;
    }
}
