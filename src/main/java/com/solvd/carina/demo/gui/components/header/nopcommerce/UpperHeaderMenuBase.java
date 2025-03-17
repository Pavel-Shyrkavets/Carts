package com.solvd.carina.demo.gui.components.header.nopcommerce;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class UpperHeaderMenuBase extends AbstractUIObject {

    public UpperHeaderMenuBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract void selectCurrency(int index);
}
