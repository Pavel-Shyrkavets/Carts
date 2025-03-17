package com.solvd.carina.demo.nopcommerce;

import com.solvd.carina.demo.gui.pages.common.nopcommerce.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductGridMenuTest implements IAbstractTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() { driver = WebDriverManager.chromedriver().create(); }

    @AfterClass
    public void tearDown() { driver.quit(); }

    @Test
    public void testProductGridMenu() {
        HomePageBase homePage = initPage(driver, HomePageBase.class);
        int productTitleLinkIndex = 0;
        String attribute = "href";

        homePage.open();
        String text = homePage.getProductTitleLinks().get(productTitleLinkIndex).getAttribute(attribute);
        homePage.getProductTitleLinks().get(productTitleLinkIndex).click();
        Assert.assertTrue(homePage.getCurrentUrl().contains(text));
    }
}
