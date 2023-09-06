package testNg;

import org.example.pages.HomePage2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest2 extends BaseTest{
    @Test
    public void IsValue() {
        HomePage2 homePage2 = new HomePage2(driver);
        homePage2.open();

        homePage2.getElCockies().click();

        homePage2.getElButton().click();

        homePage2.ensureOpened();

        Assert.assertEquals(homePage2.getEl(), 14);
    }
}
