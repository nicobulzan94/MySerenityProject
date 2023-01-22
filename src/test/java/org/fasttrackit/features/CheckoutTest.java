package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void placeOrderSuccessfullyLoggedIn() {
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
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
