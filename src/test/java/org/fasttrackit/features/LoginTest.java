package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithEmptyFields() {
        loginSteps.navigateToLoginPage();
        loginSteps.clickLogin();
        loginSteps.fillInRequiredFields();
    }
    @Test
    public void loginWithInvalidEmail() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("te@yopmail.com");
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.reqEmailFielMsgdShouldNotBeVisible();
        loginSteps.incorrectCredentErrMsg();
    }

    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn(Constants.USER_NAME);
    }


}
