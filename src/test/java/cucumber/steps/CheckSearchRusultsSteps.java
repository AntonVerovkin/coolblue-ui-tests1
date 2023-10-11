package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage3;
import org.example.pages.PageEqual;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.untils.WaitUtils.waitUntilElementISVisible;

public class CheckSearchRusultsSteps extends BaseUiSteps {
    HomePage3 homePage3 = new HomePage3(driver);
    PageEqual pageEqual = new PageEqual(driver);
    @Given("User wrote incorrect request down: {}")
    @Test
    public void writeSearchingRequestDown(String request){
        homePage3.open();
        //homePage3.getElCockies().click();
        homePage3.getElIput().sendKeys(request, Keys.ENTER);
    }
    @Given("User2 wrote incorrect request down: {}")
    @Test
    public void equalsHomePage(String request2){
        pageEqual.open();
        pageEqual.getElIput().sendKeys(request2, Keys.ENTER);
        if (pageEqual.getElSearchResult().getText().equals(pageEqual.getElName().getText())){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }



    @Then("User should be able to see try-again message")
    @Test(dependsOnMethods = {"writeSearchingRequestDown"})
    public  void  checkMessageIsDisplayed(){
        waitUntilElementISVisible(driver, homePage3.getEl());
        Assert.assertEquals(homePage3.getEl().getText(),
                "Try again with a new search term.",
                "ggh");
    }

    @Then("User2 should be able to see try-again message")
    @Test(dependsOnMethods = {"writeSearchingRequestDown"})
    public  void  checfkMessageIsDisplayed(){
        waitUntilElementISVisible(driver, pageEqual.getElSearchResult());
        Assert.assertEquals(pageEqual.getElName().getText(),
                "Try again with a new search term.",
                "ggh");
    }
}
