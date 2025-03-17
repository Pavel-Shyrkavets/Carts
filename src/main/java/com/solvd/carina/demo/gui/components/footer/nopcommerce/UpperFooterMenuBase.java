package com.solvd.carina.demo.gui.components.footer.nopcommerce;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class UpperFooterMenuBase extends AbstractUIObject {

    public UpperFooterMenuBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract void click();
}
