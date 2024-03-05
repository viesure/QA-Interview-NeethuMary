package com.example.weatherapi.util;


import io.restassured.RestAssured;

public class HttpClient {

    private static final String BASE_URL = "https://backend-interview.tools.gcp.viesure.io";

    static {
        RestAssured.baseURI = BASE_URL;
    }
}
