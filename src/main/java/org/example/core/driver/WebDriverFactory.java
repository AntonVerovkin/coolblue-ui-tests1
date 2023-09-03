package org.example.core.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.core.Browsers;
import org.example.untils.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
    private static final String BROWSER = System.getProperty("browser");
    private static WebDriver driver;

    public static WebDriver getDriver() {
        String browserType = BROWSER != null ? BROWSER : ConfigProvider.getBROWSER();

        return getDriver(Browsers.valueOf(browserType.toUpperCase()));
    }

    public static WebDriver getDriver(Browsers browsers){
        return switch (browsers) {
            case CHROME -> getChromeDriver();
            case SAFARI -> getSafariDriver();
            case FIREFOX -> getFirefoxDriver();

            default -> throw new IllegalCallerException("Wrong browser was chosen");
        };

    }

    public static WebDriver getChromeDriver(){
        if( driver == null) {
            WebDriverManager.chromedriver().clearDriverCache().setup();
            WebDriverManager.chromedriver().clearResolutionCache().setup();
            //WebDriverManager.chromedriver().driverVersion("109.0.5414.120").setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriver getSafariDriver(){
        if( driver == null) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }
        return driver;
    }



    public static WebDriver getFirefoxDriver(){
        if( driver == null) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
