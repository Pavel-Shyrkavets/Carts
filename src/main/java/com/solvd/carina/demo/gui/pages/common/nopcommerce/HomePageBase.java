package com.solvd.carina.demo.gui.pages.common.nopcommerce;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class HomePageBase extends AbstractPage {

    public HomePageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public abstract ComputersPageBase clickComputersButton(int index);

    public abstract SearchPageBase search(String text);

    public abstract SitemapPageBase clickSitemapButton(int index);

    public abstract ExtendedWebElement getUpperFooterMenuButton(int index);

    public abstract void selectCurrency(int index);

    public abstract List<ExtendedWebElement> getProductPrices();

    @Override
    public void open() { super.open(); }
}
