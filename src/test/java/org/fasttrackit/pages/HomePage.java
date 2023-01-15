package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountButton;
    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;
    @FindBy(css = "#header-account .links li:nth-child(5) a")
    private WebElementFacade registerLink;
    @FindBy(css = ".nav-primary li.parent:nth-child(5) a")
    private WebElementFacade saleHeaderLink;
    @FindBy(css = ".header-minicart .label")
    private WebElementFacade cartButton;
    @FindBy(css = ".minicart-wrapper .empty")
    private WebElementFacade noItemsInCartMsg;
    @FindBy(css = ".top-link-cart")
    private WebElementFacade myCartLink;
    @FindBy(css = ".product-name a[title = 'Elizabeth Knit Top']")
    private WebElementFacade elizKnitTop;
    @FindBy(css = ".swatch-label [alt = Red]")
    private WebElementFacade elizColorSwatch;
    @FindBy(id = "option79")
    private WebElementFacade elizSize;
    @FindBy(css = ".add-to-cart .button.btn-cart")
    private WebElementFacade atcEliz;
    @FindBy(css = ".logo")
    private WebElementFacade madisonIslandLogo;
    @FindBy(id = "search")
    private WebElementFacade searchBarField;
    @FindBy(css = ".button.search-button")
    private WebElementFacade searchBarIcon;


    public void clickOnAccountButton(){
        clickOn(accountButton);
    }
    public void clickOnLoginLink(){
        clickOn(loginLink);
    }
    public void clickOnRegisterLink() {
        clickOn(registerLink);
    }
    public void clickSaleHeaderLink() {
        clickOn(saleHeaderLink);
    }
    public void clickCartButton() {
        clickOn(cartButton);
    }
    public String setNoItemsInCartMsg() {
        return noItemsInCartMsg.getText();
    }
    public void clickMyCartLink() {
        clickOn(myCartLink);
    }
    public void clickElizKnitTop() {
        clickOn(elizKnitTop);
    }
    public void clickElizColorSwatch() {
        clickOn(elizColorSwatch);
    }
    public void clickElizSize() {
        clickOn(elizSize);
    }
    public void clickATOElizButton() {
        clickOn(atcEliz);
    }
    public void clickMadisonIslandLogo() {
        clickOn(madisonIslandLogo);
    }
    public void setSearchBarField(String value) {
        typeInto(searchBarField, value);
    }
    public void clickSearchBarIcon() {
        clickOn(searchBarIcon);
    }



}
