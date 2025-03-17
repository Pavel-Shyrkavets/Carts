package com.solvd.carina.demo.gui.components.footer.nopcommerce;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UpperFooterMenu extends UpperFooterMenuBase {

    @FindBy(xpath = ".//a")
    private ExtendedWebElement upperFooterMenuButton;

    public UpperFooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public void click() { upperFooterMenuButton.click(); }

    public ExtendedWebElement getUpperFooterMenuButton() { return upperFooterMenuButton; }
}
