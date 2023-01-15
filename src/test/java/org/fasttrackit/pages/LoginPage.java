package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id =  "pass")
    private WebElementFacade passwordField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    @FindBy(id = "advice-required-entry-email")
    private WebElementFacade emailRequiredField;

    @FindBy(css = ".error-msg")
    private WebElementFacade incorrectCredentials;

    public void setEmailField(String value){
        typeInto(emailField, value);
    }

    public void setPasswordField(String value){
        typeInto(passwordField, value);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public String getRequiredFields (){
        return emailRequiredField.getText();
    }
    public String getIncorrectCredentialsMsg (){
        return incorrectCredentials.getText();
    }

    public void reqEmailFieldNotVisible() {
        emailRequiredField.shouldNotBeVisible();
    }

}
