package cucumber.steps;

import com.beust.ah.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage3;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

import static org.example.untils.WaitUtils.waitUntilElementISVisible;

public class CheckSearchRusultsSteps extends BaseUiSteps {
    HomePage3 homePage3 = new HomePage3(driver);
    @Given("User wrote request down")
    @Test
    public void writeSearchingRequestDown(){
        homePage3.open();
        homePage3.getElIput().sendKeys("sdff", Keys.ENTER);
    }
    @Then("User should be able to see try-again message")
    @Test(dependsOnMethods = {"ariteSearchrequestDown"})
    public  void  checkMessageIsDisplayed(){
        waitUntilElementISVisible(driver, homePage3.getEl());
        Assert.assertEquals(homePage3.getEl().getText(),
                "Try again with a new search term.",
                "ggh");
    }
}
