package cucumber.steps;

import org.example.core.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseUiSteps {
    protected  static  final WebDriver driver = WebDriverFactory.getDriver();
}

