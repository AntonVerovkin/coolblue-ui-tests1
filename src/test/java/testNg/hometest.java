package testNg;

import org.example.pages.homePage;
import org.example.core.data.dataProviderMethods;
import org.testng.annotations.Test;

public class hometest extends  BaseTest{


        @Test(dataProvider = "dataForHomePage", dataProviderClass = dataProviderMethods.class)
        public void canSearch() {
        homePage homePage = new homePage(driver);
        homePage.open();  
        homePage.getElSearchInput().sendKeys("laptops", Keys.ENTER);
        SearchPage searchPage = new SearchPage(driver);
        // Assert.assertEquals(searchPage.getElSearchTitle().getText(), "laptops");    // Assert.assertEquals(searchPage.getElSearchTitle().text(), homePage.getElSearchInput().getAttribute("value"));    Assert.assertTrue(doesItemsTextContainText(searchPage.getElSearchTitle().getText(), homePage.getElSearchInput().getAttribute("value")));}public boolean doesItemsTextContainText(String firstText, String secondText) {    return firstText.toLowerCase().contains(secondText.toLowerCase());}



    }
}