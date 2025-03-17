package com.solvd.carina.demo.nopcommerce;

import com.solvd.carina.demo.gui.pages.common.nopcommerce.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.nopcommerce.SitemapPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpperFooterMenuTest implements IAbstractTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() { driver = WebDriverManager.chromedriver().create(); }

    @AfterClass
    public void tearDown() { driver.quit(); }

    @Test
    public void testUpperFooterMenu() {
        String sitemapPageURL = "https://demo.nopcommerce.com/sitemap";
        int sitemapButtonIndex = 0;
        HomePageBase homePage = initPage(driver, HomePageBase.class);

        homePage.open();
        Assert.assertTrue(homePage.getUpperFooterMenuButton(sitemapButtonIndex).isElementPresent());
        SitemapPageBase sitemapPage = homePage.clickSitemapButton(sitemapButtonIndex);
        Assert.assertTrue(sitemapPage.isUrlAsExpected(sitemapPageURL));
    }
}
