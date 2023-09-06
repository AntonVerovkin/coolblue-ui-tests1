package org.example.pages;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.untils.WaitUtils.waitUntilElementISVisible;

public class HomePage2 extends BasePage {
    private  final String HOME_PAGE2 = "https://www.coolblue.nl/en";

    @Getter
    @FindBy(xpath = "//span[@class='icon-with-text__text'][contains(text(),'14 stores')]")
    private WebElement elButton;

    @Getter
    @FindBy(xpath = "//div[@class='pb--2 pb--0@sm section--4 section--6@sm']//button[@class='button button--order button--full-width']")
    private WebElement elCockies;

    @Getter
    @FindBy(xpath = "//div[@class='col--12 col--6@sm col--4@lg']")
    private List<WebElement> el;



    public HomePage2(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {
        super.driver.get(HOME_PAGE2);
        ensureOpened();
    }

    @Override
    public void ensureOpened() {
        waitUntilElementISVisible(driver, elButton);


    }}