package cucumber.steps;

import io.cucumber.java.AfterAll;
import org.testng.annotations.AfterMethod;

public class Hooks extends BaseUiSteps{
    @AfterAll
    public  static  void  afterAll(){
        driver.quit();
    }

}
