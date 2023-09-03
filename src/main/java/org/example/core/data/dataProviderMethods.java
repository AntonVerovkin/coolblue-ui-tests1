package org.example.core.data;

import org.testng.annotations.DataProvider;

public class dataProviderMethods {
    @DataProvider
    public Object[][] dataForHomeTest(){
        return  new Object[][] {
                {"iphone", },
                {"laptops",},

        };
    }
}
