package com.solvd.carina.demo.nopcommerce;

import com.solvd.carina.demo.gui.pages.common.nopcommerce.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SelectCurrencyTest implements IAbstractTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() { driver = WebDriverManager.chromedriver().create(); }

    @AfterClass
    public void tearDown() { driver.quit(); }

    @Test
    public void testCurrencySelection() {
        HomePageBase homePage = initPage(driver, HomePageBase.class);
        int currencyIndex = 1;
        int productIndex = 0;
        char euroSign = '€';
        String changedURL = "https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F";

        homePage.open();
        homePage.selectCurrency(currencyIndex);
        /* At the moment the website is blocked for test automation
        String price = homePage.getProductPrices().get(productIndex).getText();
        Assert.assertTrue(price.contains(String.valueOf(euroSign))); */
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.isUrlAsExpected(changedURL));
        softAssert.assertAll();
    }
}
