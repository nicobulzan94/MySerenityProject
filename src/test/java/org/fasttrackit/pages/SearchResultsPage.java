package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {


    @FindBy(css = ".note-msg")
    private WebElementFacade searchNoResultsMsg;
    @FindBy(css = ".page-title")
    private WebElementFacade searchWithResultsTitle;
    @FindBy(css = ".category-products")
    private WebElementFacade productsCategoryIsPresent;

    @FindBy(css = ".products-grid .product-name")
    private List<WebElementFacade> listOfProductNames;
    @FindBy(css = ".category-products > .toolbar select[title='Sort By']")
    private WebElementFacade sortByDropdown;

    @FindBy(css = ".products-grid .regular-price")
    private List<WebElementFacade> listOfPrices;

    @FindBy(css = ".product-info .button.button.btn-cart")
    private WebElementFacade addToCartButton;



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

    public boolean isProductInList(String productName) {
        waitFor(listOfProductNames.get(0));

        for(WebElementFacade element: listOfProductNames) {
            if (element.getText().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public void selectPriceFromDropdown() {
        sortByDropdown.selectByIndex(2);
    }

    public boolean isPriceAscending() {

        int firstPrice = getIntFromPrice(listOfPrices.get(0).getText());
        int lastPrice = getIntFromPrice(listOfPrices.get(listOfPrices.size() -1).getText());

        return firstPrice < lastPrice;

    }

    public void clickOnAddToCartButton() {
        clickOn(addToCartButton);
    }











}
