Feature: Weather API Testing

  Scenario: Fetch and verify weather data
    Given I fetch weather data
    Then I verify the weather condition
    And I verify temperature conversion from Fahrenheit to Celsius
    And I verify weather description based on temperature in Celsius

  Scenario: Set temperature via Helper API and verify updated temperature
    Given I set temperature via Helper API
    Then I verify updated temperature

  Scenario: Set weather condition via Helper API and verify updated condition
    Given I set weather condition via Helper API
    Then I verify updated condition

Feature: OpenWeatherMap Website Testing (Bonus Tasks)

  Scenario: Verify main page's search field placeholder text
    Given I am on the OpenWeatherMap website
    Then I verify the main page's search field contains correct placeholder text

  Scenario: Search for a city and select it
    Given I am on the OpenWeatherMap website
    When I search for "Sydney" and select "Sydney, AU" from the list
    Then I verify the selected city's title is correct

  Scenario: Verify the date shown is correct
    Given I am on the OpenWeatherMap website
    Then I verify that the date shown is correct

  Scenario: Verify the time shown is correct
    Given I am on the OpenWeatherMap website
    Then I verify that the time shown is correct
