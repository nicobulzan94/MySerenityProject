package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(css = ".page-title")
    private WebElementFacade checkoutTitle;
    @FindBy(css = "#opc-login .step-title h2")
    private WebElementFacade checkoutMethodTitle;
    @FindBy(css = "#billing-buttons-container .button")
    private WebElementFacade billingButtonContinue;
    @FindBy(css = "#shipping-buttons-container .button")
    private WebElementFacade shippingInfoContinue;
    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElementFacade shippingMethodFree;
    @FindBy(css = "#shipping-method-buttons-container button")
    private WebElementFacade shippingMethodContinue;
    @FindBy(css = "#payment-buttons-container button")
    private WebElementFacade paymentButtonContinue;
    @FindBy(css = ".buttons-set .button.btn-checkout")
    private WebElementFacade placeOrderButton;
    @FindBy(css = "[title = 'Ship to different address']")
    private WebElementFacade shipToDifAddressRadioB;
    @FindBy(css = ".sub-title")
    private WebElementFacade orderConfSubTitle;


    public String setCheckoutTitle() {
        return checkoutTitle.getText();
    }
    public String setCheckoutMethodTitle() {
        return checkoutMethodTitle.getText();
    }

    public void clickBillingButtonContinue() {
        clickOn(billingButtonContinue);
    }

    public void clickShippingInfoContinueButton() {
        clickOn(shippingInfoContinue);
    }

    public void clickShippingMethodFree() {
        clickOn(shippingMethodFree);
    }

    public void clickShippingMethodContinueButton() {
        clickOn(shippingMethodContinue);
    }

    public void clickPaymentButtonContinue() {
        clickOn(paymentButtonContinue);
    }

    public void clickPlaceOrderButton() {
       clickOn(placeOrderButton);
    }

    public void clickShipToDifAddressRadioB() {
        clickOn(shipToDifAddressRadioB);
    }
    public String setOrderConfSubTitle() {
        return orderConfSubTitle.getText();
    }








}
