package com.FizzBuzz;

import java.util.List;

/**
 * Created by Bill on 17/5/2017.
 */
public class FizzBuzz {

    private final List<RulePrintStrategy> rules;

    private final RulePrintStrategy defaultRule;
    public FizzBuzz(List<RulePrintStrategy> rules, RulePrintStrategy defaultRule){
        this.rules = rules;
        this.defaultRule = defaultRule;
    }

    public String provideNumber(int providedNumber) {
        String returnedString;
         ReplyStrategy replyStrategy = ReplyStrategy.getInstance(getRules(),getDefaultRule());
        returnedString = replyStrategy.print(providedNumber);
        return returnedString;
    }
    public List<RulePrintStrategy> getRules() {
        return rules;
    }

    public RulePrintStrategy getDefaultRule() {
        return defaultRule;
    }
}

