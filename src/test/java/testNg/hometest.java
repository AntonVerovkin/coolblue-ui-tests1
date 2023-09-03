package testNg;

import org.example.pages.homePage;
import org.example.core.data.dataProviderMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.untils.WaitUtils.waitUntilElementISClickable;
import static org.example.untils.WaitUtils.waitUntilElementISVisible;

public class hometest extends  BaseTest{


        @Test(dataProvider = "dataForHomeTest", dataProviderClass = dataProviderMethods.class)
        public void canSearch(String value) {
        homePage homePage = new homePage(driver);
        homePage.open();
        waitUntilElementISVisible(driver, homePage.getElInput());
        homePage.getElInput().sendKeys("Laptop", Keys.ENTER);

        Assert.assertTrue(homePage.getEl().getText().contains(value));
        }
}
