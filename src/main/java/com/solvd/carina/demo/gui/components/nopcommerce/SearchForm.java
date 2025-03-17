package com.solvd.carina.demo.gui.components.nopcommerce;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchForm extends AbstractUIObject {

    @FindBy(xpath = "./*[@id = 'small-searchterms']")
    private ExtendedWebElement searchTextBox;

    @FindBy(xpath = "./*[@type = 'submit']")
    private ExtendedWebElement searchButton;

    public SearchForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void search(String text) {
        searchTextBox.type(text);
        searchButton.click();
    }
}
