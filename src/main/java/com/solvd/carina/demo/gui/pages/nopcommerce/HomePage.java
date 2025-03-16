package com.solvd.carina.demo.gui.pages.nopcommerce;

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
    private List<MenuComponent> headerMenuButtons;

    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(logoImage);
    }

    public void clickHeaderMenuButton(int index) {
        headerMenuButtons.get(index).click();
    }

    @Override
    public ComputersPageBase clickComputersButton(int index) {
        clickHeaderMenuButton(index);

        return initPage(driver, ComputersPageBase.class);
    }
}

