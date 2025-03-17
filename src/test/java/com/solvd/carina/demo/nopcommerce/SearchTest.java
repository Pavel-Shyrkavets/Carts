package com.solvd.carina.demo.nopcommerce;

import com.solvd.carina.demo.gui.pages.common.nopcommerce.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.nopcommerce.SearchPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest implements IAbstractTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() { driver = WebDriverManager.chromedriver().create(); }

    @AfterClass
    public void tearDown() { driver.quit(); }

    @Test
    public void testSearch() {
        HomePageBase homePage = initPage(driver, HomePageBase.class);
        String text = "Samsung";
        String searchPageURL = "https://demo.nopcommerce.com/search?q=Samsung";

        homePage.open();
        SearchPageBase searchPage = homePage.search(text);
        Assert.assertTrue(searchPage.isUrlAsExpected(searchPageURL));
    }
}
