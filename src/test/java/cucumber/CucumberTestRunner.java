package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/cucumber/featchers/checkSearchPage.feature", "src/test/java/cucumber/featchers/checkLaptopTitles.feature"},
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
