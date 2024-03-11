package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features/weather.feature", "src/test/resources/features/bonus_tasks.feature"},
        glue = "com.example.weatherapi.steps",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
