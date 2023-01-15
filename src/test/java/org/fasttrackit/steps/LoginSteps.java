package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.http.conn.util.PublicSuffixList;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {

    private AccountPage accountPage;
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public void navigateToLoginPage() {
        homePage.open();
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
        Assert.assertEquals("This is a required field.", loginPage.getRequiredFields());
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
