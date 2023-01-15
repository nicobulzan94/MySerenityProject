package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy(css = ".page-title")
    private WebElementFacade cartEmptyTitle;
    @FindBy(css = ".cart-empty p:nth-child(1)")
    private WebElementFacade noItemsInCartMsg;
    @FindBy(css = ".success-msg span")
    private WebElementFacade productAddedtoCartMsg;
    @FindBy(css = ".product-cart-remove .btn-remove2")
    private WebElementFacade removeItemButton;
    @FindBy(css = ".product-cart-actions .input-text.qty")
    private WebElementFacade changeQty;

//    @FindBy(css = ".button.btn-update")
//    private WebElementFacade updateQtyButton;
    @FindBy(css = ".button-wrapper [title = 'Apply']")
    private WebElementFacade discountApplyLink;
    @FindBy(id = "advice-required-entry-coupon_code")
    private WebElementFacade discountRequiredFieldErrMsg;
    @FindBy(id = "coupon_code")
    private WebElementFacade couponCodeField;
    @FindBy(css = "li.error-msg")
    private WebElementFacade invalidCouponErrMsg;
    @FindBy(css = ".title-buttons [title = 'Proceed to Checkout']")
    private WebElementFacade proceedToCheckoutButton;


    public String setCartEmptyTitle() {
        return cartEmptyTitle.getText();
    }
    public void noItemsInCartMsgIsVisible() {
        noItemsInCartMsg.isVisible();
    }

    public String getProductAddedtoCartMsg() {
        return productAddedtoCartMsg.getText();
    }

    public void clickRemoveButton() {
        clickOn(removeItemButton);
    }

    public void clearChangeQty() {
        changeQty.clear();
    }

    public void setChangeQty(String value) {
        changeQty.typeAndEnter(value);
    }

//    public void clickQtyUpdateButton() {
//        clickOn(updateQtyButton);
//    }

    public void clickDiscountApplyLink() {
        clickOn(discountApplyLink);
    }

    public String getDiscountRequiredFieldErrMsg() {
        return discountRequiredFieldErrMsg.getText();
    }
    public void setCouponCodeField(String value){
        typeInto(couponCodeField,value);
    }

    public String getInvalidCouponErrMsg() {
        return invalidCouponErrMsg.getText();
    }
    public void clickProceedToCheckoutButton() {
        clickOn(proceedToCheckoutButton);
    }



}
