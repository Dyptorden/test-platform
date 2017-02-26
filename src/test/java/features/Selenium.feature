@tags
Feature: Get price for the iPhone 7

@tags
  Scenario: Verify that the price is smaller than a value
    Given that i am on emag page
    When I search for "iPhone 7"
    And I see the details for a phone
    Then the price is smaller than "3.34"