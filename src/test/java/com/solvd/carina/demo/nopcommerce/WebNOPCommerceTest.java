package com.solvd.carina.demo.nopcommerce;

import com.solvd.carina.demo.gui.pages.nopcommerce.ComputersPageBase;
import com.solvd.carina.demo.gui.pages.nopcommerce.HomePage;
import com.solvd.carina.demo.gui.pages.nopcommerce.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebNOPCommerceTest implements IAbstractTest {
    private WebDriver driver;

    @BeforeClass
    void setUp() {
        driver = WebDriverManager.chromedriver().create();
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }

    @Test
    void testHeaderMenu() {
        String homePageURL = "https://demo.nopcommerce.com/";
        String computersPageURL = "https://demo.nopcommerce.com/computers";
        int computersButtonIndex = 0;
        HomePageBase homePage = initPage(driver, HomePageBase.class);

        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "The home page is not open.");
        Assert.assertTrue(homePage.isUrlAsExpected(homePageURL));

        SoftAssert softAssert = new SoftAssert();
        ComputersPageBase computersPage = homePage.clickComputersButton(computersButtonIndex);
        Assert.assertTrue(computersPage.isUrlAsExpected(computersPageURL));
    }
}
