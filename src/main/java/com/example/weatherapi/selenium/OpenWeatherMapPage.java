package com.example.weatherapi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenWeatherMapPage {
    private WebDriver driver;
	private Object expectedTitle;

    // Constructor
    public OpenWeatherMapPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to verify search field placeholder text
    public boolean verifySearchFieldPlaceholder() {
        WebElement searchField = driver.findElement(By.id("q"));
        String placeholderText = searchField.getAttribute("placeholder");
        return placeholderText.equals("Search");
    }
 // Method to search for a city and select it
    public void searchAndSelectCity(String cityName) {
        WebElement searchField = driver.findElement(By.id("q"));
        searchField.sendKeys(cityName);

        // Wait for the search results to appear
        // You can add explicit wait logic here

        WebElement cityResult = driver.findElement(By.xpath("//ul[@id='searchList']/li[contains(text(), '" + cityName + "')]"));
        cityResult.click();
    }

    // Method to verify selected city's title
    public boolean verifySelectedCityTitle() {
        WebElement cityTitle = driver.findElement(By.cssSelector("h2"));
        return cityTitle.getText().equals(expectedTitle);
    }

    // Method to verify date
    public boolean verifyDate() {
        // Add verification logic for date
        return true; // Placeholder return value, replace with actual verification
    }

    // Method to verify time
    public boolean verifyTime() {
        // Add verification logic for time
        return true; // Placeholder return value, replace with actual verification
    }

    
    
}

