package com.example.weatherapi.steps;

import com.example.weatherapi.selenium.OpenWeatherMapPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class weathersteps {
    private WebDriver driver;
    private OpenWeatherMapPage openWeatherMapPage;

    @Given("I open the OpenWeatherMap website")
    public void i_open_the_OpenWeatherMap_website() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        openWeatherMapPage = new OpenWeatherMapPage(driver);
        driver.manage().window().maximize();
        driver.get("https://openweathermap.org/");
    }

    @When("I verify the main page's search field contains correct placeholder text")
    public void i_verify_the_main_page_search_field_placeholder_text() {
        Assert.assertEquals(openWeatherMapPage.verifySearchFieldPlaceholder(), "Search");
    }

    @When("I search for {string} and select {string}")
    public void i_search_for_and_select(String cityName, String selectedCity) {
        openWeatherMapPage.searchAndSelectCity(cityName);
        openWeatherMapPage.searchAndSelectCity(selectedCity);
    }

    @Then("I verify the selected city's title is correct")
    public void i_verify_selected_city_title_correct() {
        Assert.assertTrue(openWeatherMapPage.verifySelectedCityTitle());
    }

    @Then("I verify that the date shown is correct")
    public void i_verify_date_shown_correct() {
        Assert.assertTrue(openWeatherMapPage.verifyDate());
    }

    @Then("I verify that the time shown is correct")
    public void i_verify_time_shown_correct() {
        Assert.assertTrue(openWeatherMapPage.verifyTime());
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}
