package org.example.pages;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.untils.WaitUtils.waitUntilElementISVisible;

public class HomePage3 extends BasePage {
    private  final String HOME_PAGE3 = "https://www.coolblue.nl/en";

    @Getter
    @FindBy(xpath = "//input[@class='search__input js-search-input has-dropdown']")
    private WebElement elIput;

    @Getter
    @FindBy(xpath = "//div[@class='pb--2 pb--0@sm section--4 section--6@sm']//button[@class='button button--order button--full-width']")
    private WebElement elCockies;

    @Getter
    @FindBy(xpath = "//div[@class='content-card-from-size-m']//div[@class=\"section--6\"][1]")
    private WebElement el;



    public HomePage3(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {
        super.driver.get(HOME_PAGE3);
        ensureOpened();
    }

    @Override
    public void ensureOpened() {
        waitUntilElementISVisible(driver, elIput);


    }}