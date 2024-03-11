package com.example.weatherapi.steps;
import com.example.weatherapi.service.HelperAPI;
import com.example.weatherapi.service.WeatherAPI;
import com.example.weatherapi.model.WeatherData;
import com.example.weatherapi.selenium.OpenWeatherMapPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class weathersteps {
	private OpenWeatherMapPage openWeatherMapPage = new OpenWeatherMapPage();
	
	
	
    private WeatherData weatherData;

    @Given("I fetch weather data")
    public void fetchWeatherData() {
        weatherData = WeatherAPI.getWeather();
    }

    @Then("I verify the weather condition")
    public void verifyWeatherCondition() {
        // Add assertion to verify weather condition
        assertEquals("clear", weatherData.getCondition());
    }

    @Then("I verify temperature conversion from Fahrenheit to Celsius")
    public void verifyTemperatureConversion() {
        // Add assertion to verify temperature conversion
        assertEquals(15, weatherData.getWeather().getTempInCelsius());
    }

    @Then("I verify weather description based on temperature in Celsius")
    public void verifyWeatherDescription() {
        // Add assertion to verify weather description
        assertEquals("The weather is mild", weatherData.getDescription());
    }

    @Given("I set temperature via Helper API")
    public void setTemperatureViaHelperAPI() {
        HelperAPI.setTemperature(17);
    }

    @Then("I verify updated temperature")
    public void verifyUpdatedTemperature() {
        WeatherData updatedData = WeatherAPI.getWeather();
        assertEquals(17, updatedData.getWeather().getTempInCelsius());
    }

    @Given("I set weather condition via Helper API")
    public void setWeatherConditionViaHelperAPI() {
        HelperAPI.setCondition(1);
    }

    @Then("I verify updated condition")
    public void verifyUpdatedCondition() {
        WeatherData updatedData = WeatherAPI.getWeather();
        assertEquals("clear", updatedData.getCondition());
    }
    
 // Bonus Task: OpenWeatherMap website testing

    @Given("I am on the OpenWeatherMap website")
    public void launchOpenWeatherMapWebsite() {
        openWeatherMapPage.navigateToHomePage();
    }

    @Then("I verify the main page's search field contains correct placeholder text")
    public void verifySearchFieldPlaceholder() {
        assertEquals("Search", openWeatherMapPage.getSearchFieldPlaceholderText());
    }

    @Then("I search for Sydney and select Sydney, AU from the list")
    public void searchAndSelectCity() {
        openWeatherMapPage.searchAndSelectCity("Sydney");
    }

    @Then("I verify the selected city's title is correct")
    public void verifySelectedCityTitle() {
        assertEquals("Sydney, AU", openWeatherMapPage.getSelectedCityTitle());
    }

    @Then("I verify that the date shown is correct")
    public void verifyDate() {
        String expectedDate = openWeatherMapPage.getCurrentDate();
        String actualDate = ""; // Fetch date shown on the page
        assertEquals(expectedDate, actualDate);
    }

    @Then("I verify that the time shown is correct")
    public void verifyTime() {
        String expectedTime = openWeatherMapPage.getCurrentTime();
        String actualTime = ""; // Fetch time shown on the page
        assertEquals(expectedTime, actualTime);
    }
}
    
    
    
    
    
    
    
    


