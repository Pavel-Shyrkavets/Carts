package com.solvd.carina.demo.gui.pages.desktop.nopcommerce;

import com.solvd.carina.demo.gui.components.footer.nopcommerce.UpperFooterMenu;
import com.solvd.carina.demo.gui.components.header.nopcommerce.UpperHeaderMenu;
import com.solvd.carina.demo.gui.components.nopcommerce.HeaderMenu;
import com.solvd.carina.demo.gui.components.nopcommerce.ProductGridMenu;
import com.solvd.carina.demo.gui.components.nopcommerce.SearchForm;
import com.solvd.carina.demo.gui.pages.common.nopcommerce.ComputersPageBase;
import com.solvd.carina.demo.gui.pages.common.nopcommerce.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.nopcommerce.SearchPageBase;
import com.solvd.carina.demo.gui.pages.common.nopcommerce.SitemapPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//img[@alt = 'nopCommerce demo store']")
    private ExtendedWebElement logoImage;

    @FindBy(xpath = "//*[@class = 'header-menu']")
    private List<HeaderMenu> headerMenuButtons;

    @FindBy(xpath = "//*[@id = 'small-search-box-form']")
    private SearchForm searchForm;

    @FindBy(xpath = "//*[@class = 'footer-upper']")
    private List<UpperFooterMenu> upperFooterMenuButtons;

    @FindBy(xpath = "//*[@class = 'header-upper']")
    private UpperHeaderMenu upperHeaderMenu;

    @FindBy(xpath = "//*[contains(@class, 'product-grid')]/*[@class = 'item-grid']")
    private ProductGridMenu productGridMenu;

    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(logoImage);
    }

    public void clickHeaderMenuButton(int index) {
        headerMenuButtons.get(index).click();
    }

    public void clickUpperFooterMenuButton(int index) { upperFooterMenuButtons.get(index).click(); }

    @Override
    public ExtendedWebElement getUpperFooterMenuButton(int index) {
        return upperFooterMenuButtons.get(index).getUpperFooterMenuButton();
    }

    @Override
    public ComputersPageBase clickComputersButton(int index) {
        clickHeaderMenuButton(index);
        return initPage(driver, ComputersPageBase.class);
    }

    @Override
    public SearchPageBase search(String text) {
        searchForm.search(text);
        return initPage(driver, SearchPageBase.class);
    }

    @Override
    public SitemapPageBase clickSitemapButton(int index) {
        clickUpperFooterMenuButton(index);
        return initPage(driver, SitemapPageBase.class);
    }

    @Override
    public void selectCurrency(int index) { upperHeaderMenu.selectCurrency(index); }

    @Override
    public List<ExtendedWebElement> getProductPrices() { return productGridMenu.getProductPrices(); }

    @Override
    public List<ExtendedWebElement> getProductTitleLinks() { return productGridMenu.getProductTitleLinks(); }
}
