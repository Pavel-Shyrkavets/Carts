package com.solvd.carina.demo.gui.pages.nopcommerce;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MenuComponent extends AbstractUIObject {

    @FindBy(xpath = "./*[contains(@class, 'notmobile')]/li/a")
    private ExtendedWebElement headerMenuButton;

    @FindBy(xpath = "//*[@class = 'page-title']/h1")
    private ExtendedWebElement computersLabel;

    public MenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void click() {
        headerMenuButton.click();
    }

    public ExtendedWebElement getComputersLabel() {
        return computersLabel;
    }
}
