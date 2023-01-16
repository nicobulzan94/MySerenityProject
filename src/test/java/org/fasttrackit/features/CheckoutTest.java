package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private CheckoutSteps checkoutSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

    @Test
    public void placeOrderSuccessfullyLoggedIn() {
        loginSteps.doLogin("test@yopmail.com","test123");
        cartSteps.clickOnLogo();
        cartSteps.addToCartHomeElizTop();
        cartSteps.proceedToCheckout();
        cartSteps.checkoutTitleIsPresent();
        checkoutSteps.clickShipToDifAddr();
        checkoutSteps.clickContinueBillingB();
        checkoutSteps.clickShipInfoContinueB();
        checkoutSteps.clickShippingMethodFree();
        checkoutSteps.clickShipMethodContinueB();
        checkoutSteps.clickPayContinueB();
        checkoutSteps.clickPlaceOrderB();
        checkoutSteps.orderReceivedMsg();
        checkoutSteps.thankYouForPurchaseMsg();
    }





}
