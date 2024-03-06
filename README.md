         Weather App Automation Test Report
Overview:
The weather-app automation project aimed to develop and test the MVP backend for a weather-related application. The project utilized Java, Selenium, Cucumber, TestNG, and Maven for test automation, with the addition of an external reporting framework for enhanced reporting capabilities.

Project Structure:   
The project utilizes Java, Selenium, Cucumber, TestNG, and Maven for test automation. It follows a Behavior-Driven Development (BDD) approach with Cucumber scenarios defined in feature files. TestNG is used for test execution and reporting, while Maven manages project dependencies and builds.

Additional Frameworks:
Selenium: Used for browser automation to test additional fields from the OpenWeatherMap website.
Cucumber: Provides a BDD approach for defining test scenarios in feature files.
TestNG: Used for test execution and reporting.
Maven: Manages project dependencies and builds.
External Reporting Framework: Integrated for enhanced reporting capabilities, providing detailed test results.

Project Components:
src/main/java/com/example/weatherapi: Contains classes related to interacting with the weather API.
src/test/java/com/example/weatherapi: Contains test cases, step definitions, and helper classes.
src/test/resources/features: Contains Cucumber feature files defining test scenarios.
pom.xml: Maven configuration file specifying project dependencies and plugins.
README.md: Project overview, instructions, and additional information.

Here's a simplified structure of the project:weather-app-automation/
weather-app/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── weatherapi/
│   │                   ├── service/
│   │                   │   ├── WeatherAPI.java
│   │                   │   └── HelperAPI.java
│   │                   ├── model/
│   │                   │   └── WeatherData.java
│   │                   ├── selenium/                
│   │                   │   └── OpenWeatherMapPage.java
│   │                   └── util/
│   │                       └── HTTPClient.java
│   │
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── weatherapi/
│       │               ├── steps/                
│       │               │   └── weathersteps.java
│       │               └── services.tests/
│       │                   └── WeatherAPITest.java  
│       └── resources/
│           └── features/
│               └── weather.feature
│
├── drivers/
│   └── chromedriver.exe                              
│
├── pom.xml                                           
└── README.md                                         


Test Execution Summary:
Total Scenarios Executed: 5
Total Steps: 25
Passing Scenarios: 5
Failing Scenarios: 0
Test Results:
Scenario 1: Verify weather condition based on condition ID
Result: Passed
Description: The scenario verified that the weather condition returned by the API matches the condition ID.

Scenario 2: Verify temperature conversion from Fahrenheit to Celsius
Result: Passed
Description: The scenario confirmed that the temperature conversion from Fahrenheit to Celsius is accurate based on the provided formula and rounding rules.

Scenario 3: Verify weather description based on temperature in Celsius
Result: Passed
Description: This scenario ensured that the weather description suffix is correctly calculated based on the temperature in Celsius.

Scenario 4: Set temperature via Helper API and verify updated temperature
Result: Passed
Description: This scenario tested the functionality of the Helper API to set the temperature and verified that the temperature update reflects correctly in the weather API response.

Scenario 5: Set weather condition via Helper API and verify updated condition
Result: Passed
Description: Similar to Scenario 4, this scenario tested the Helper API to set the weather condition and verified that the condition update reflects correctly in the weather API response.

Bonus Task
Task 1: Verify Main Page's Search Field Placeholder Text
Description: This task ensures that the search field on the main page of the OpenWeatherMap website contains the correct placeholder text.
Steps:
.Launch the OpenWeatherMap website.
.Locate the search field element.
.Verify that the placeholder text of the search field is "Search".
Result: Passed

Task 2: Search for Sydney, and Select Sydney, AU from the List
Description: This task validates the functionality of searching for a city and selecting it from the search results on the OpenWeatherMap website.
Steps:
.Launch the OpenWeatherMap website.
.Enter "Sydney" into the search field.
.Wait for the search results to appear.
.Click on the search result for "Sydney, AU".
.Verify that the selected city's title is "Sydney, AU".
.Verify that the date shown is correct.
.Verify that the time shown is correct.
Result: Passed

How to Run the Tests

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Ensure that you have Java and Maven installed.
4. Run `mvn clean test` from the command line to execute the tests.
5. View the test results in the test report generated by the chosen reporting framework.

Conclusion:
The weather app backend MVP has been successfully tested with automated scenarios covering various aspects such as weather condition, temperature conversion, and description calculation. All test scenarios passed without any failures, demonstrating the reliability and accuracy of the backend API.



Submitted By,
Neethu Mary THomas
06642682926
neethumarythomas@gmail.com