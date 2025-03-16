package com.solvd.carina.demo.gui.pages.nopcommerce;

import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {

    public HomePageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public abstract ComputersPageBase clickComputersButton(int index);

    @Override
    public void open() {
        super.open();
    }
}
