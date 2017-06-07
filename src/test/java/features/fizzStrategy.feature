Feature: Fizzstrategy
  This is a strategy to reply with buzz anytime you input a number which is dividable by 3

  Scenario: Provide a bunch numbers
    Given That the FizzStrategy applies for the number that can be divided by 3
    When we ask for the text of number:3 ,it should be fizz cause of FizzStrategy
    When we ask for the text of number:6 ,it should be fizz cause of FizzStrategy
    When we ask for the text of number:9 ,it should be fizz cause of FizzStrategy
    When we ask for the text of number:12 ,it should be fizz cause of FizzStrategy
    When we ask for the text of number:15 ,it should be fizz cause of FizzStrategy
    When we ask for the text of number:18 ,it should be fizz cause of FizzStrategy