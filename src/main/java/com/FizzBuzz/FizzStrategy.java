package com.FizzBuzz;

/**
 * Created by vasilis on 19-5-17.
 */
public class FizzStrategy implements RulePrintStrategy {

    public static final Integer FIZZ_VALUE = 3;
    public static final String FIZZ_STR = "fizz";

    public boolean strategyApplies(Integer value) {
        boolean result = false;
        if(Math.floorMod(value,FIZZ_VALUE) == 0){
            result = true;
        }
        return result;
    }

    public String printResponse(Integer givenNumber) {
        return FIZZ_STR;
    }
}
