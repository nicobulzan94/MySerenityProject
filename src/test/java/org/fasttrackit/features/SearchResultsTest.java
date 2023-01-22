package org.fasttrackit.features;

import org.junit.Test;

public class SearchResultsTest extends BaseTest {

    @Test
    public void searchWithNoResults() {
        searchResultSteps.searchAProduct("alabalaportocala");
        searchResultSteps.clickOnSearchBarIcon();
        searchResultSteps.searchWithNoResultsMsg();
    }

    @Test
    public void searchWithResults() {
        searchResultSteps.searchWithResults("NECK");
        searchResultSteps.categorySelectorIsDisplayed();
    }

    @Test
    public void searchForProductSuccessTest() {
        searchResultSteps.searchAProduct("neck");
        searchResultSteps.clickOnSearchBarIcon();
        searchResultSteps.verifyProductIsInList("SILVER DESERT NECKLACE");
    }

    @Test
    public void verifyPriceAscendingTest() {
        searchResultSteps.searchAProduct("neck");
        searchResultSteps.clickOnSearchBarIcon();
        searchResultSteps.orderProductsByPrice();
        searchResultSteps.productsAreSortedByPriceAscending();

    }











}
