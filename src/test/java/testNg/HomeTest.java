package testNg;

import org.example.pages.HomePage;
import org.example.core.data.dataProviderMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.untils.WaitUtils.waitUntilElementISVisible;

public class HomeTest extends  BaseTest{


        @Test(dataProvider = "dataForHomeTest", dataProviderClass = dataProviderMethods.class)
        public void canSearch(String value) {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        waitUntilElementISVisible(driver, homePage.getElInput());
        homePage.getElInput().sendKeys("Laptop", Keys.ENTER);

        Assert.assertTrue(homePage.getEl().getText().contains(value));
        }
}
