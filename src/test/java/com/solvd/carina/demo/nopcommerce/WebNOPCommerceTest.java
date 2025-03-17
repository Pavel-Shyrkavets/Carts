package com.solvd.carina.demo.nopcommerce;

import com.solvd.carina.demo.gui.pages.common.nopcommerce.ComputersPageBase;
import com.solvd.carina.demo.gui.pages.common.nopcommerce.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.nopcommerce.SearchPageBase;
import com.solvd.carina.demo.gui.pages.common.nopcommerce.SitemapPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebNOPCommerceTest implements IAbstractTest {
    private HomePageBase homePage;

    @BeforeMethod
    public void setUp() {
        homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
    }

    @AfterMethod
    public void tearDown() { getDriver().quit(); }

    @Test
    public void testHeaderMenu() {
        String homePageURL = "https://demo.nopcommerce.com/";
        String computersPageURL = "https://demo.nopcommerce.com/computers";
        int computersButtonIndex = 0;

        Assert.assertTrue(homePage.isPageOpened(), "The home page is not open.");
        Assert.assertTrue(homePage.isUrlAsExpected(homePageURL));
        ComputersPageBase computersPage = homePage.clickComputersButton(computersButtonIndex);
        Assert.assertTrue(computersPage.isUrlAsExpected(computersPageURL));
    }

    @Test
    public void testProductGridMenu() {
        int productTitleLinkIndex = 0;
        String attribute = "href";
        String text = homePage.getProductTitleLinks().get(productTitleLinkIndex).getAttribute(attribute);

        homePage.getProductTitleLinks().get(productTitleLinkIndex).click();
        Assert.assertTrue(homePage.getCurrentUrl().contains(text));
    }

    @Test
    public void testSearch() {
        String text = "Samsung";
        String searchPageURL = "https://demo.nopcommerce.com/search?q=Samsung";

        SearchPageBase searchPage = homePage.search(text);
        Assert.assertTrue(searchPage.isUrlAsExpected(searchPageURL));
    }

    @Test
    public void testCurrencySelection() {
        int currencyIndex = 1;
        int productIndex = 0;
        char euroSign = '€';
        String changedURL = "https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F";

        homePage.selectCurrency(currencyIndex);
        /* At the moment the website is blocked for test automation
        String price = homePage.getProductPrices().get(productIndex).getText();
        Assert.assertTrue(price.contains(String.valueOf(euroSign))); */
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.isUrlAsExpected(changedURL));
        softAssert.assertAll();
    }

    @Test
    public void testUpperFooterMenu() {
        String sitemapPageURL = "https://demo.nopcommerce.com/sitemap";
        int sitemapButtonIndex = 0;

        Assert.assertTrue(homePage.getUpperFooterMenuButton(sitemapButtonIndex).isElementPresent());
        SitemapPageBase sitemapPage = homePage.clickSitemapButton(sitemapButtonIndex);
        Assert.assertTrue(sitemapPage.isUrlAsExpected(sitemapPageURL));
    }
}
