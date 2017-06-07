Feature: FizzBuzz strategy
  This is a strategy to reply with buzz anytime you input a number which is dividable by 5

  Scenario: Provide a few numbers
    Given That the FizzBuzzStrategy applies since it can divided by both 3 and 5
    When we ask for the text of number:15 ,it should be fizzbuzz cause of FizzBuzzStrategy
    When we ask for the text of number:30 ,it should be fizzbuzz cause of FizzBuzzStrategy
    When we ask for the text of number:45 ,it should be fizzbuzz cause of FizzBuzzStrategy
    When we ask for the text of number:60 ,it should be fizzbuzz cause of FizzBuzzStrategy
    When we ask for the text of number:75 ,it should be fizzbuzz cause of FizzBuzzStrategy
    When we ask for the text of number:90 ,it should be fizzbuzz cause of FizzBuzzStrategy