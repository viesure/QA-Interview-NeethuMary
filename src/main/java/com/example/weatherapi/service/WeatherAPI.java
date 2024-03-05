package com.example.weatherapi.service;


import com.example.weatherapi.model.WeatherData;
import io.restassured.RestAssured;
//import io.restassured.response.Response;

public class WeatherAPI {

	private static final String BASE_URL = "https://backend-interview.tools.gcp.viesure.io";
    private static final String WEATHER_ENDPOINT = "/weather";

    static {
        RestAssured.baseURI = BASE_URL;
    }

    // Method to set the temperature using the weather API
    public static void setTemperature(int temperature) {
        RestAssured.given()
                   .contentType("application/json")
                   .body("{\"tempInFahrenheit\": " + temperature + "}")
                   .put(WEATHER_ENDPOINT + "/temp");
    }

    // Method to set the condition ID using the weather API
    public static void setConditionId(int conditionId) {
        RestAssured.given()
                   .contentType("application/json")
                   .body("{\"condition\": " + conditionId + "}")
                   .put(WEATHER_ENDPOINT + "/condition");
    }

    // Method to retrieve weather information from the weather API
    public static WeatherData getWeather() {
        return RestAssured.given()
                          .accept("application/json")
                          .get(WEATHER_ENDPOINT)
                          .as(WeatherData.class);
    }
}


