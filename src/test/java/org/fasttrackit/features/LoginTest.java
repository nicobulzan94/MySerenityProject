package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }


    @Test
    public void loginWithEmptyFields() {
        loginSteps.navigateToLoginPage();
        loginSteps.clickLogin();
        loginSteps.fillInRequiredFields();
    }
    @Test
    public void loginWithInvalidCredentials() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("te@yopmail.com");
        loginSteps.typePassword("test123");
        loginSteps.clickLogin();
        loginSteps.reqEmailFielMsgdShouldNotBeVisible();
        loginSteps.incorrectCredentErrMsg();
    }

    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("test@yopmail.com");
        loginSteps.typePassword("test123");
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn("test test tester");
    }
}
