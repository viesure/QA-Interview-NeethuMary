package com.example.weatherapi.services.tests;



import com.example.weatherapi.service.HelperAPI;
import com.example.weatherapi.service.WeatherAPI;
import com.example.weatherapi.model.WeatherData;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WeatherAPITest {
@BeforeClass
    public void setUp() {
        new HelperAPI();
    }

    @Test(description = "Verify weather API returns correct data")
    public void testWeatherAPI() {
        // Set up the API with sample data
        HelperAPI.setTemperature(60); // Fahrenheit
        HelperAPI.setCondition(1); // Clear condition

        // Retrieve weather data
        WeatherData weather = WeatherAPI.getWeather();

        // Verify the returned data
        Assert.assertEquals(weather.getCity(), "Vienna", "Incorrect city name");
        Assert.assertEquals(weather.getCondition(), "clear", "Incorrect weather condition");
        Assert.assertEquals(weather.getIcon(), "clear.PNG", "Incorrect icon");
        Assert.assertEquals(weather.getConditionId(), 1, "Incorrect condition ID");
        Assert.assertEquals(weather.getDescription(), "The weather is mild", "Incorrect description");
        Assert.assertEquals(weather.getTempInFahrenheit(), 60, "Incorrect temperature in Fahrenheit");
        Assert.assertEquals(weather.getTempInCelsius(), 15, "Incorrect temperature in Celsius");
    }
}