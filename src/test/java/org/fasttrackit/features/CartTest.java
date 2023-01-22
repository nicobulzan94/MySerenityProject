package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {


    //loggedIn tests
    @Test
    public void productNotAddedtoCartErr(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        addToCartSteps.navigateToSaleOxfordShirtPg();
        addToCartSteps.clickATCSaleOxfordShirt();
        addToCartSteps.selectSwatchRequiredErrMsg();
    }

    @Test
    public void addToCartSuccessfully() {
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        addToCartSteps.navigateToSaleOxfordShirtPg();
        addToCartSteps.selectColorSwatchSaleOxfordShirt();
        addToCartSteps.selectSizeSwatchSaleOxfordShirt();
        addToCartSteps.clickATCSaleOxfordShirt();
        addToCartSteps.saleOxfordShirtATCSuccessMsg();
    }

    @Test
    public void proceedToCheckoutSuccessfully() {
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        cartSteps.clickOnLogo();
        cartSteps.addToCartHomeElizTop();
        cartSteps.proceedToCheckout();
        cartSteps.checkoutTitleIsPresent();
    }

    //notLoggedIn Tests
    @Test
    public void miniCartIsEmpty() {
        cartSteps.clickCartButton();
        cartSteps.noItemsInCartMsg();
    }

    @Test
    public void shoppingCartPgIsEmpty() {
        cartSteps.clickMyCartLink();
        cartSteps.shoppingCartEmpty();
    }

    @Test
    public void removeItemFromCart() {
        cartSteps.addToCartHomeElizTop();
        cartSteps.elizTopAddedToCartSuccessMsg();
        cartSteps.clickOnRemoveButton();
        cartSteps.shoppingCartEmpty();
    }

    @Test
    public void changeQuantity() {
        cartSteps.addToCartHomeElizTop();
        cartSteps.clearExistingQty();
        cartSteps.changeQty("3");
    }

    @Test
    public void emptyDiscountField() {
        cartSteps.addToCartHomeElizTop();
        cartSteps.clickOnDiscountLink();
        cartSteps.discountFieldReqMsg();
    }

    @Test
    public void incorrectDiscountField() {
        cartSteps.addToCartHomeElizTop();
        cartSteps.typeInvalidCouponCode("madison");
    }

    @Test
    public void proceedToCheckoutSuccessfullyNotLoggedIn() {
        cartSteps.addToCartHomeElizTop();
        cartSteps.proceedToCheckout();
        cartSteps.checkoutMethodTitleIsPresent();
    }

    @Test
    public void isTotalCartSumCorrect() {
        addToCartSteps.doATCSaleOxfordShirt();
        cartSteps.clickOnLogo();
        cartSteps.addToCartHomeElizTop();
        cartSteps.checkTotalIsCorrect();

    }






}
