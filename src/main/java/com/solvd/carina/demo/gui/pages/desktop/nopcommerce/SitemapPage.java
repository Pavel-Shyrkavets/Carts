package com.solvd.carina.demo.gui.pages.desktop.nopcommerce;

import com.solvd.carina.demo.gui.pages.common.nopcommerce.SitemapPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SitemapPageBase.class)
public class SitemapPage extends SitemapPageBase {

    @FindBy(xpath = "//*[@class = 'page-title']/h1")
    private ExtendedWebElement sitemapLabel;

    public SitemapPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(sitemapLabel);
    }

    public ExtendedWebElement getSitemapLabel() { return sitemapLabel; }
}
