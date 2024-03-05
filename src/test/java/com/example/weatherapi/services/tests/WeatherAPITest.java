package com.example.weatherapi.services.tests;



import com.example.weatherapi.service.HelperAPI;
import com.example.weatherapi.model.WeatherData;
import com.example.weatherapi.util.HttpClient;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WeatherAPITest {

	private HelperAPI helperAPI;

    @BeforeClass
    public void setUp() {
        helperAPI = new HelperAPI();
    }

    @Test(description = "Verify weather API returns correct data")
    public void testWeatherAPI() {
        // Set up the API with sample data
        helperAPI.setTemperature(60); // Fahrenheit
        helperAPI.setConditionId(1); // Clear condition

        // Retrieve weather data
        Weather weather = helperAPI.getWeather();

        // Verify the returned data
        assertEquals(weather.getCity(), "Vienna", "Incorrect city name");
        assertEquals(weather.getCondition(), "clear", "Incorrect weather condition");
        assertEquals(weather.getIcon(), "clear.PNG", "Incorrect icon");
        assertEquals(weather.getConditionId(), 1, "Incorrect condition ID");
        assertEquals(weather.getDescription(), "The weather is mild", "Incorrect description");
        assertEquals(weather.getTempInFahrenheit(), 60, "Incorrect temperature in Fahrenheit");
        assertEquals(weather.getTempInCelsius(), 15, "Incorrect temperature in Celsius");
    }
}