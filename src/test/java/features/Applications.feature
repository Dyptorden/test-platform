@tags
Feature: Verify the applications work properly
  As a user
  I want to use calculator, selection sort and test parse
  So that i receive the correct results


  Scenario: Test java calculator
    Given that i have numbers "12" and "8"
    When i call "sum" function from calculator
    Then the received response is "20"

    When i call "multiply" function from calculator
    Then the received response is "96"

    When i call "average" function from calculator
    Then the received response is "10"


  Scenario: Test text parser
    Given that i have the text "The email you are looking for is food@food.com to order the best pizza in town"
    When I call the email extract method
    Then the returned response is "food@food.com"

  Scenario Outline: Test java calculator scenario outline example
    Given that i have numbers "<no1>" and "<no2>"
    When i call "sum" function from calculator
    Then the received response is "<result>"

    Examples:
     |no1 | no2  | result |
     | 2  |  3   |   5    |
     | 21 |  33  |   54   |
     | 82 |  27  |  109   |
     | 91 |  10  |  101   |
     | 52 |  13  |  65    |

