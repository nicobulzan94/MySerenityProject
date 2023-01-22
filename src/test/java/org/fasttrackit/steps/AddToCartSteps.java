package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.utils.Messages;
import org.junit.Assert;

public class AddToCartSteps extends BaseSteps {

    @Step
    public void navigateToSaleOxfordShirtPg() {
        homePage.clickSaleHeaderLink();
        saleMenPage.clickSlimFitDobbyOxfordShirtLink();
    }

    @Step
    public void clickATCSaleOxfordShirt() {
        saleMenPage.clickATCbutton();
    }

    @Step
    public void selectColorSwatchSaleOxfordShirt() {
        saleMenPage.clickSwatchColorDobby();
    }

    @Step
    public void selectSizeSwatchSaleOxfordShirt() {
        saleMenPage.clickSwatchSizeDobby();
    }

    @Step
    public void selectSwatchRequiredErrMsg() {
        Assert.assertEquals(Messages.THIS_IS_A_REQUIRED_FIELD,saleMenPage.getSwatchErrorMsg());
    }

    @Step
    public void saleOxfordShirtATCSuccessMsg() {
        Assert.assertEquals("Slim fit Dobby Oxford Shirt was added to your shopping cart.",saleMenPage.getDobbyAddedtoCartSuccessMsg());
    }

    @Step
    public void doATCSaleOxfordShirt() {
        navigateToSaleOxfordShirtPg();
        selectColorSwatchSaleOxfordShirt();
        selectSizeSwatchSaleOxfordShirt();
        clickATCSaleOxfordShirt();
    }




}
