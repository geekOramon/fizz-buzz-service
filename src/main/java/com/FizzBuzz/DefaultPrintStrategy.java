package com.FizzBuzz;

/**
 * Created by vasilis on 19-5-17.
 */
public class DefaultPrintStrategy implements RulePrintStrategy {

    String response ="";


    public boolean strategyApplies(Integer value) {
        return true;
    }

    public String printResponse(Integer givenNumber) {
        return String.valueOf(givenNumber);
    }
}
