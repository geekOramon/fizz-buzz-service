Feature: FizzBuzz Whole test
  This is a strategy to reply with buzz anytime you input a number which is dividable by 5

  Scenario Outline: Provide numbers to the fizzbuzz class
    Given that the set of rules are
      | "FizzStrategy" |
      | "BuzzStrategy" |
      | "FizzBuzzStrategy" |
      And default rules is DefaultRuleStrategy
    When we ask for the printed text of <number>
      Then text should be <text> cause of <Strategy>
    Examples:
      | Strategy | number | text |
      | FizzStrategy | 5 | fizz |
      | BuzzStrategy | 5 | buzz |
      | FizzBuzzStrategy | 15 | fizzbuzz |
