Feature: Buzz strategy
  This is a strategy to reply with buzz anytime you input a number which is dividable by 5

  Scenario Outline: Provide a few numbers
    Given That the BuzzStrategy applies for the number that can be divided by 5
    When we ask for the text of number:<number> ,it should be buzz cause of BuzzStrategy

    Examples:
    | number |
    | 5 |
    | 10 |
    | 15|
    | 20 |
    | 25 |

