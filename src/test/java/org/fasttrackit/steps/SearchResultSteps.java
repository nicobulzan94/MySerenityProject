package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchResultSteps extends BaseSteps {

    @Step
    public void searchAProduct(String searchProduct) {
        homePage.setSearchBarField(searchProduct);
    }

    @Step
    public void searchWithNoResultsMsg() {
        Assert.assertEquals("Your search returns no results.", resultsPage.getSearchNoResultsMsg());
    }

    @Step
    public void clickOnSearchBarIcon() {
        homePage.clickSearchBarIcon();
    }

    @Step
    public void searchWithResults(String searchProduct) {
        homePage.setSearchBarField(searchProduct);
        homePage.clickSearchBarIcon();
        Assert.assertEquals("SEARCH RESULTS FOR " + "'" + searchProduct + "'",resultsPage.getSearchWithResultsTitle());
    }

    @Step
    public void categorySelectorIsDisplayed() {
        resultsPage.prdctCategorySelectorIsDisplayed();
    }

    @Step
    public void verifyProductIsInList(String productName) {
        Assert.assertTrue("The product was not found in the list, look for another one!",resultsPage.isProductInList(productName));
    }

    @Step
    public void orderProductsByPrice() {
        resultsPage.selectPriceFromDropdown();
    }

    @Step
    public void productsAreSortedByPriceAscending() {
        Assert.assertTrue("The price is not sorted ascending.",resultsPage.isPriceAscending());
    }


    @Step
    public void goToPDP(String productName) {
        searchAProduct(productName);
        clickOnSearchBarIcon();
        verifyProductIsInList(productName);
    }







}
