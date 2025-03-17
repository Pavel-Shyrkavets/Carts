package com.solvd.carina.demo.nopcommerce;

import com.solvd.carina.demo.gui.pages.common.nopcommerce.ComputersPageBase;
import com.solvd.carina.demo.gui.pages.common.nopcommerce.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HeaderMenuTest implements IAbstractTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() { driver = WebDriverManager.chromedriver().create(); }

    @AfterClass
    public void tearDown() { driver.quit(); }

    @Test
    public void testHeaderMenu() {
        String homePageURL = "https://demo.nopcommerce.com/";
        String computersPageURL = "https://demo.nopcommerce.com/computers";
        int computersButtonIndex = 0;
        HomePageBase homePage = initPage(driver, HomePageBase.class);

        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "The home page is not open.");
        Assert.assertTrue(homePage.isUrlAsExpected(homePageURL));
        ComputersPageBase computersPage = homePage.clickComputersButton(computersButtonIndex);
        Assert.assertTrue(computersPage.isUrlAsExpected(computersPageURL));
    }
}
