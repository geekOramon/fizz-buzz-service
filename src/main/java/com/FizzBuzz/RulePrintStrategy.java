package com.FizzBuzz;

/**
 * Created by vasilis on 19-5-17.
 */
public interface RulePrintStrategy {
    boolean strategyApplies(Integer value);

    String printResponse(Integer value);
}
