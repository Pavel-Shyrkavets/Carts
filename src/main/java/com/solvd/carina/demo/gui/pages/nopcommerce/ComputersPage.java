package com.solvd.carina.demo.gui.pages.nopcommerce;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ComputersPageBase.class)
public class ComputersPage extends ComputersPageBase {

    @FindBy(xpath = "//*[@class = 'page-title']/h1")
    private ExtendedWebElement computersLabel;

    public ComputersPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(computersLabel);
    }

    public ExtendedWebElement getComputersLabel() {
        return computersLabel;
    }
}
