package com.solvd.carina.demo.gui.components.header.nopcommerce;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UpperHeaderMenu extends UpperHeaderMenuBase {

    @FindBy(xpath = ".//*[@id = 'customerCurrency']")
    private ExtendedWebElement currencyDropMenu;

    public UpperHeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public void selectCurrency(int index) { currencyDropMenu.select(index); }
}
