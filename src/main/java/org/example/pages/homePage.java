package org.example.pages;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.untils.WaitUtils.waitUntilElementISVisible;

public class homePage extends BasePage {
    private  final String HOME_PAGE = "https://www.coolblue.nl/en";

    @Getter
    @FindBy(xpath = "//input[@class='search__input js-search-input has-dropdown']")
    private WebElement elInput;

    @Getter
    @FindBy(xpath = "//li[@class='breadcrumbs__item'][last()]")
    private WebElement el;
    
    public homePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {
        super.driver.get(HOME_PAGE);
        ensureOpened();
    }

    @Override
    public void ensureOpened() {
        waitUntilElementISVisible(driver, elInput);


    }}