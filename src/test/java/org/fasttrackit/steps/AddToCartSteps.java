package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.SaleMenPage;
import org.junit.Assert;

public class AddToCartSteps extends ScenarioSteps {
    private HomePage homePage;
    private SaleMenPage saleMenPage;



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
        Assert.assertEquals("This is a required field.",saleMenPage.getSwatchErrorMsg());
    }

    @Step
    public void saleOxfordShirtATCSuccessMsg() {
        Assert.assertEquals("Slim fit Dobby Oxford Shirt was added to your shopping cart.",saleMenPage.getDobbyAddedtoCartSuccessMsg());
    }

    @Step
    public void doATCSaleOxfordShirt() {
        selectColorSwatchSaleOxfordShirt();
        selectSizeSwatchSaleOxfordShirt();
        clickATCSaleOxfordShirt();
    }




}
