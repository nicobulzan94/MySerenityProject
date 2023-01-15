package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaleMenPage extends PageObject {

    @FindBy(css = "h2.product-name a")
    private WebElementFacade slimFitDobbyOxfordShirtLink;
    @FindBy(css = "#swatch27 .swatch-label")
    private WebElementFacade swatchColorDobby;
    @FindBy(css = "#swatch81 .swatch-label")
    private WebElementFacade swatchSizeDobby;
    @FindBy(css = ".product-shop .btn-cart")
    private WebElementFacade atcDobby;
    @FindBy(css = ".success-msg span")
    private WebElementFacade dobbyAddedtoCartSuccessMsg;
    @FindBy(id = "advice-required-entry-attribute92")
    private WebElementFacade errorMsgSwatchRequired;




    public void clickSlimFitDobbyOxfordShirtLink() {
        clickOn(slimFitDobbyOxfordShirtLink);
    }

    public void clickSwatchColorDobby() {
        clickOn(swatchColorDobby);
    }


    public void clickSwatchSizeDobby() {
        clickOn(swatchSizeDobby);
    }

    public void clickATCbutton() {
        clickOn(atcDobby);
    }

    public String getDobbyAddedtoCartSuccessMsg (){

        return dobbyAddedtoCartSuccessMsg.getText();
    }

    public String getSwatchErrorMsg() {
        return errorMsgSwatchRequired.getText();
    }








}
