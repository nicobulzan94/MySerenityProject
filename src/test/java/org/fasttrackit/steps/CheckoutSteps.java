package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps {

    @Step
    public void clickShipToDifAddr () {
        checkoutPage.clickShipToDifAddressRadioB();
    }

    @Step
    public void clickContinueBillingB() {
        checkoutPage.clickBillingButtonContinue();
    }

    @Step
    public void clickShipInfoContinueB() {
        checkoutPage.clickShippingInfoContinueButton();
    }

    @Step
    public void clickShippingMethodFree() {
        checkoutPage.clickShippingMethodFree();
    }

    @Step
    public void clickShipMethodContinueB() {
        checkoutPage.clickShippingMethodContinueButton();
    }

    @Step
    public void clickPayContinueB() {
        checkoutPage.clickPaymentButtonContinue();
    }

    @Step
    public void clickPlaceOrderB() {
        checkoutPage.clickPlaceOrderButton();
        waitABit(6000);
    }

    @Step
    public void orderReceivedMsg() {
        Assert.assertEquals("YOUR ORDER HAS BEEN RECEIVED.",checkoutPage.setCheckoutTitle());
    }

    @Step
    public void thankYouForPurchaseMsg() {
        Assert.assertEquals("THANK YOU FOR YOUR PURCHASE!", checkoutPage.setOrderConfSubTitle());
    }









}
