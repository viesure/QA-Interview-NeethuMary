package com.example.weatherapi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;

public class OpenWeatherMapPage {
    private static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void navigateToHomePage() {
        driver.get("https://openweathermap.org/");
    }

    public String getSearchFieldPlaceholderText() {
        WebElement searchField = driver.findElement(By.cssSelector("input[placeholder='Search']"));
        return searchField.getAttribute("placeholder");
    }

    public void searchAndSelectCity(String cityName) {
        WebElement searchField = driver.findElement(By.cssSelector("input[placeholder='Search']"));
        searchField.sendKeys(cityName);
        // Simulate selection from the list
    }

    public String getSelectedCityTitle() {
        WebElement selectedCity = driver.findElement(By.className("city_header"));
        return selectedCity.getText();
    }

    public String getCurrentDate() {
        WebElement dateElement = driver.findElement(By.xpath("//div[@class='date']"));
        String dateText = dateElement.getText();
        return dateText.split(",")[1].trim(); // Extract date from the date element
    }

    public String getCurrentTime() {
        WebElement timeElement = driver.findElement(By.xpath("//div[@class='time']"));
        return timeElement.getText(); // Extract time from the time element
    }

    public void close() {
        driver.quit();
    }
}
