package com.example.weatherapi.steps;



import com.example.weatherapi.service.HelperAPI;
import com.example.weatherapi.service.WeatherService;
import com.example.weatherapi.model.WeatherData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class weathersteps {

    private WeatherAPI weatherAPI;
    private Weather weather;

    @Given("^I set the temperature to (\\d+) Fahrenheit$")
    public void setTemperatureToFahrenheit(int temperature) {
        HelperAPI.setTemperature(temperature);
    }

    @Given("^I set the condition ID to (\\d+)$")
    public void setConditionId(int conditionId) {
        HelperAPI.setCondition(conditionId);
    }

    @When("^I request weather information$")
    public void requestWeatherInformation() {
        weatherAPI = new WeatherAPI();
        weather = weatherAPI.getWeather();
    }

    @Then("^the city should be \"([^\"]*)\"$")
    public void verifyCity(String expectedCity) {
        Assert.assertEquals(expectedCity, weather.getCity());
    }

    @Then("^the condition should be \"([^\"]*)\"$")
    public void verifyCondition(String expectedCondition) {
        Assert.assertEquals(expectedCondition, weather.getCondition());
    }

    @Then("^the temperature should be (\\d+) Fahrenheit$")
    public void verifyTemperatureFahrenheit(int expectedTemperatureFahrenheit) {
        Assert.assertEquals(expectedTemperatureFahrenheit, weather.getTempInFahrenheit());
    }

    @Then("^the temperature should be (\\d+) Celsius$")
    public void verifyTemperatureCelsius(int expectedTemperatureCelsius) {
        Assert.assertEquals(expectedTemperatureCelsius, weather.getTempInCelsius());
    }

    @Then("^the description should be \"([^\"]*)\"$")
    public void verifyDescription(String expectedDescription) {
        Assert.assertEquals(expectedDescription, weather.getDescription());
    }
}
