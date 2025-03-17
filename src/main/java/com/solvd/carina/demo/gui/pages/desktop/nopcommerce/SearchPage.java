package com.solvd.carina.demo.gui.pages.desktop.nopcommerce;

import com.solvd.carina.demo.gui.pages.common.nopcommerce.SearchPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SearchPageBase.class)
public class SearchPage extends SearchPageBase {

    @FindBy(xpath = "//*[@class = 'page-title']/h1")
    private ExtendedWebElement searchLabel;

    public SearchPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(searchLabel);
    }

    public ExtendedWebElement getSearchLabel() { return searchLabel; }
}
