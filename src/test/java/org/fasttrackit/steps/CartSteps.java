package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {
    private HomePage homePage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @Step
    public void clickCartButton() {
        homePage.open();
        homePage.clickCartButton();
    }

    @Step
    public void noItemsInCartMsg() {
        Assert.assertEquals("You have no items in your shopping cart.",homePage.setNoItemsInCartMsg());
    }

    @Step
    public void clickMyCartLink() {
        homePage.open();
        homePage.clickOnAccountButton();
        homePage.clickMyCartLink();
    }

    @Step
    public void shoppingCartEmpty(){
        Assert.assertEquals("SHOPPING CART IS EMPTY", cartPage.setCartEmptyTitle());
        cartPage.noItemsInCartMsgIsVisible();
    }

    @Step
    public void addToCartHomeElizTop() {
        homePage.open();
        homePage.clickElizKnitTop();
        homePage.clickElizColorSwatch();
        homePage.clickElizSize();
        homePage.clickATOElizButton();
    }

    @Step
    public void elizTopAddedToCartSuccessMsg() {
        Assert.assertEquals("Elizabeth Knit Top was added to your shopping cart.", cartPage.getProductAddedtoCartMsg());
    }

    @Step
    public void clickOnRemoveButton() {
        cartPage.clickRemoveButton();
    }

    @Step
    public void clearExistingQty() {
        cartPage.clearChangeQty();
    }
    @Step
    public void changeQty(String qtyNr) {
        cartPage.setChangeQty(qtyNr);

    }

    @Step
    public void clickOnDiscountLink() {
        cartPage.clickDiscountApplyLink();
    }
    @Step
    public void discountFieldReqMsg() {
        Assert.assertEquals("This is a required field.", cartPage.getDiscountRequiredFieldErrMsg());
    }

    @Step
    public void typeInvalidCouponCode(String couponCode) {
        cartPage.setCouponCodeField(couponCode);
        cartPage.clickDiscountApplyLink();
        Assert.assertEquals("Coupon code " + '"' + couponCode + '"' + " is not valid.", cartPage.getInvalidCouponErrMsg());
    }

    @Step
    public void proceedToCheckout() {
        cartPage.clickProceedToCheckoutButton();
    }
    @Step
    public void checkoutTitleIsPresent() {
        Assert.assertEquals("CHECKOUT", checkoutPage.setCheckoutTitle());
    }
    @Step
    public void clickOnLogo() {
        homePage.clickMadisonIslandLogo();
    }

    @Step
    public void checkoutMethodTitleIsPresent() {
        Assert.assertEquals("CHECKOUT METHOD", checkoutPage.setCheckoutMethodTitle());
    }







}
