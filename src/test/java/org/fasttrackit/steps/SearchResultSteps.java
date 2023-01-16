package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchResultSteps extends ScenarioSteps {

    private HomePage homePage;
    private SearchResultsPage resultsPage;

    @Step
    public void searchAProduct(String searchProduct) {
        homePage.open();
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
        homePage.open();
        homePage.setSearchBarField(searchProduct);
        homePage.clickSearchBarIcon();
        Assert.assertEquals("SEARCH RESULTS FOR " + "'" + searchProduct + "'",resultsPage.getSearchWithResultsTitle());
    }

    @Step
    public void categorySelectorIsDisplayed() {
        resultsPage.prdctCategorySelectorIsDisplayed();
    }



}
