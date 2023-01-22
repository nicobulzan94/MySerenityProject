package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.utils.Messages;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToLoginPage() {
        homePage.clickOnAccountButton();
        homePage.clickOnLoginLink();
    }

    @Step
    public void typeUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void typePassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void userIsLoggedIn(String userName) {
//      Assert.assertTrue(accountPage.isWelcomeText(userName));
        Assert.assertEquals("Hello, " + userName + "!", accountPage.getWelcomeText());
 //     accountPage.userIsLoggedIn(userName);
    }

    @Step
    public void fillInRequiredFields() {
        Assert.assertEquals(Messages.THIS_IS_A_REQUIRED_FIELD, loginPage.getRequiredFieldText());
    }

    @Step
    public void incorrectCredentErrMsg() {
        Assert.assertEquals("Invalid login or password.", loginPage.getIncorrectCredentialsMsg());
    }

    @Step
    public void reqEmailFielMsgdShouldNotBeVisible() {
        loginPage.reqEmailFieldNotVisible();
    }

    @Step
    public void doLogin(String email, String pass){
        navigateToLoginPage();
        typeUserEmail(email);
        typePassword(pass);
        clickLogin();
    }





}
