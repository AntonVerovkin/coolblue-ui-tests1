package org.example.pages;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.untils.WaitUtils.waitUntilElementISVisible;

public class PageEqual extends BasePage {
    private  final String HOME_PAGE3 = "https://www.coolblue.nl/en";

    @Getter
    @FindBy(xpath = "//input[@id='search_query']")
    private WebElement elIput;
    @Getter
    @FindBy(xpath = "//div[@class=\"section--2\"]//h1" )
    private WebElement elName ;


    @Getter
    @FindBy(xpath = "//li[@class='breadcrumbs__item'][last()]" )
    private WebElement elSearchResult ;



    public PageEqual(WebDriver driver) {
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