Feature: Weather API Testing

  Background:
    Given the base URL is "https://backend-interview.tools.gcp.viesure.io/"
    
  Scenario: Verify weather details for a fixed city
    When I fetch the weather details
    Then the city should be "Vienna"
    And the condition should be "clear"
    And the icon should be "clear.PNG"
    And the condition ID should be 1
    And the description should be "The weather is mild"
    And the temperature in Fahrenheit should be 60
    And the temperature in Celsius should be 15

  Scenario: Update temperature and verify description
    Given the temperature is set to 32 Fahrenheit
    When I fetch the weather details
    Then the description should be "warm"

  Scenario: Update condition and verify condition
    Given the condition is set to 2 (windy)
    When I fetch the weather details
    Then the condition should be "windy"

