package com.example.weatherapi.service;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class HelperAPI {

	private static final String BASE_URL = "https://backend-interview.tools.gcp.viesure.io";

    // Method to set the temperature using the weather API
    public static void setTemperature(int temperature) {
        RestAssured.given()
                   .baseUri(BASE_URL)
                   .contentType(ContentType.JSON)
                   .body("{\"tempInFahrenheit\": " + temperature + "}")
                   .put("/weather/temp");
    }

    // Method to set the condition ID using the weather API
    public static void setCondition(int conditionId) {
        RestAssured.given()
                   .baseUri(BASE_URL)
                   .contentType(ContentType.JSON)
                   .body("{\"condition\": " + conditionId + "}")
                   .put("/weather/condition");
    }
}