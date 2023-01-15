package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends PageObject {


    @FindBy(css = ".note-msg")
    private WebElementFacade searchNoResultsMsg;
    @FindBy(css = ".page-title")
    private WebElementFacade searchWithResultsTitle;
    @FindBy(css = ".category-products")
    private WebElementFacade productsCategoryIsPresent;



    public String getSearchNoResultsMsg() {
        return searchNoResultsMsg.getText();
    }

    public String getSearchWithResultsTitle() {
        return searchWithResultsTitle.getText();
    }

    public boolean prdctCategorySelectorIsDisplayed() {
        productsCategoryIsPresent.isDisplayed();
        return true;
    }








}
