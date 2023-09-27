package org.example.untils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public final class WebDriverUtils {
    public static File getScreenshoot(WebDriver driver){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        return  takesScreenshot.getScreenshotAs(OutputType.FILE);
    }



}
