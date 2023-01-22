package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.*;
import org.fasttrackit.utils.Constants;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected AddToCartSteps addToCartSteps;
    @Steps
    protected CheckoutSteps checkoutSteps;
    @Steps
    protected RegisterSteps registerSteps;
    @Steps
    protected SearchResultSteps searchResultSteps;

    @Before
    public void initTests(){
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }





}
