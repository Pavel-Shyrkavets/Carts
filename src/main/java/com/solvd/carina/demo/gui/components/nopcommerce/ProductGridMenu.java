package com.solvd.carina.demo.gui.components.nopcommerce;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductGridMenu extends AbstractUIObject {

    @FindBy(xpath = ".//*[contains(@class, 'actual-price')]")
    private List<ExtendedWebElement> productPrices;

    @FindBy(xpath = ".//*[@class = 'product-title']/a")
    private List<ExtendedWebElement> productTitleLinks;

    public ProductGridMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<ExtendedWebElement> getProductPrices() { return productPrices; }

    public List<ExtendedWebElement> getProductTitleLinks() { return productTitleLinks; }
}
