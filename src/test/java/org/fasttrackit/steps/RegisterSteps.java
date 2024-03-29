package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.utils.Messages;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps {

    @Step
    public void navigateToRegisterPage() {
        homePage.clickOnAccountButton();
        homePage.clickOnRegisterLink();
    }

    @Step
    public void typeFirstName(String firstName) {
        regPage.setFirstNameField(firstName);
    }
    @Step
    public void typeLastName(String lastName) {
        regPage.setLastNameField(lastName);
    }
    @Step
    public void typeEmail(String email) {
        regPage.setEmailField(email);
    }
    @Step
    public void typePassword(String password) {
        regPage.setPasswordField(password);
    }
    @Step
    public void typeConfirmationPass(String confPass) {
        regPage.setPasswordConfirmationField(confPass);
    }
    @Step
    public void checkNewsletterBox() {
        regPage.clickNewsletterCheckbox();
    }
    @Step
    public void clickRegisterButton() {
        regPage.clickRegisterButton();
    }

    @Step
    public void fillInRequiredFields() {
        Assert.assertEquals(Messages.THIS_IS_A_REQUIRED_FIELD,regPage.getRequiredFields());
    }

    @Step
    public void existingAccountRegErrMsg() {
        Assert.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.",regPage.getExitingAccountErrorMsg());
    }

    @Step
    public void regSuccessMsg() {
        Assert.assertEquals("Thank you for registering with Madison Island.", regPage.getRegSuccessMsg());
    }

    @Step
    public void doRegister(String firstName, String lastName, String email, String password, String confPass) {
        navigateToRegisterPage();
        typeFirstName(firstName);
        typeLastName(lastName);
        typeEmail(email);
        typePassword(password);
        typeConfirmationPass(confPass);
        checkNewsletterBox();
        clickRegisterButton();
    }









}
