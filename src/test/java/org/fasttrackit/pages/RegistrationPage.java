package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;
    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;
    @FindBy(id = "email_address")
    private WebElementFacade emailField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(id = "confirmation")
    private WebElementFacade passwordConfirmationField;
    @FindBy(id = "is_subscribed")
    private WebElementFacade newsletterCheckbox;
    @FindBy(css = ".buttons-set .button")
    private WebElementFacade registerButton;
    @FindBy(id = "advice-required-entry-firstname")
    private WebElementFacade requiredFields;
    @FindBy(css = ".error-msg")
    private WebElementFacade regWithExitingAccountMsg;
    @FindBy(css = ".success-msg")
    private WebElementFacade regSuccessMsg;

    public void setFirstNameField(String value){
        typeInto(firstNameField, value);
    }
    public void setLastNameField(String value){
        typeInto(lastNameField, value);
    }
    public void setEmailField(String value) {
        typeInto(emailField,value);
    }
    public void setPasswordField(String value) {
        typeInto(passwordField,value);
    }
    public void setPasswordConfirmationField(String value) {
        typeInto(passwordConfirmationField,value);
    }
    public void clickNewsletterCheckbox(){
        clickOn(newsletterCheckbox);
    }
    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public String getRequiredFields (){
        return requiredFields.getText();
    }

    public String getExitingAccountErrorMsg() {
        return regWithExitingAccountMsg.getText();
    }
    public String getRegSuccessMsg() {
        return regSuccessMsg.getText();
    }








}
