package com.FizzBuzz; /**
 * Created by vasilis on 19-5-17.
 */


import java.util.ArrayList;
import java.util.List;

public class ReplyStrategy {

    public static final String INVALID_NUMBER = "Invalid Number";
    public static ReplyStrategy singleton;

    private List<RulePrintStrategy> rules;
    private RulePrintStrategy defaultRule;

    public String print(Integer number) {
        String reply = "";
        boolean appliedAStrategy = false;
        for (RulePrintStrategy rule : rules) {
            if (rule.strategyApplies(number)) {
                reply = rule.printResponse(number);
                appliedAStrategy = true;
                break;
            }
        }
        if(!appliedAStrategy)
            reply = defaultRule.printResponse(number);
        return reply;
    }

    private ReplyStrategy() {
        defineRules();
    }

    public ReplyStrategy(List<RulePrintStrategy> rules, RulePrintStrategy defaultRule) {
        this.rules = rules;
        this.defaultRule = defaultRule;
    }

    private void defineRules() {
        rules = new ArrayList<RulePrintStrategy>();
        rules.add(new FizzBuzzStrategy());
        rules.add(new BuzzStrategy());
        rules.add(new BuzzStrategy());

        defaultRule = new DefaultPrintStrategy();

    }

    public static ReplyStrategy getInstance(List<RulePrintStrategy> rules, RulePrintStrategy defaultRule) {
        if (singleton == null) {
            if (rules != null) {
                singleton = new ReplyStrategy(rules, defaultRule);
            } else {
                singleton = new ReplyStrategy();
            }
        }
        return singleton;
    }

}