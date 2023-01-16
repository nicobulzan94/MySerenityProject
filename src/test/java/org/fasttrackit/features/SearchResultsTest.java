package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchResultSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchResultsTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private SearchResultSteps searchResultSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

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







}
