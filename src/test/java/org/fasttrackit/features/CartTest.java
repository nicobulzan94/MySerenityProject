package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddToCartSteps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private AddToCartSteps addToCartSteps;
    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }


    @Test
    public void productNotAddedtoCartErr(){
        loginSteps.doLogin("test@yopmail.com","test123");
        addToCartSteps.navigateToSaleOxfordShirtPg();
        addToCartSteps.clickATCSaleOxfordShirt();
        addToCartSteps.selectSwatchRequiredErrMsg();
    }

    @Test
    public void addToCartSuccessfully() {
        loginSteps.doLogin("test@yopmail.com","test123");
        addToCartSteps.navigateToSaleOxfordShirtPg();
        addToCartSteps.selectColorSwatchSaleOxfordShirt();
        addToCartSteps.selectSizeSwatchSaleOxfordShirt();
        addToCartSteps.clickATCSaleOxfordShirt();
        addToCartSteps.saleOxfordShirtATCSuccessMsg();
    }

    @Test
    public void proceedToCheckoutSuccessfullyLoggedIn() {
        loginSteps.doLogin("test@yopmail.com","test123");
        cartSteps.clickOnLogo();
        cartSteps.addToCartHomeElizTop();
        cartSteps.proceedToCheckout();
        cartSteps.checkoutTitleIsPresent();
    }

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






}
