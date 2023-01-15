package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

    @Test
    public void registerSuccess() {
        registerSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Test");
        registerSteps.typeLastName("Tester");
        registerSteps.typeEmail("test_3@yopmail.com");
        registerSteps.typePassword("test123");
        registerSteps.typeConfirmationPass("test123");
        registerSteps.checkNewsletterBox();
        //registerSteps.clickRegisterButton();
        //registerSteps.regSuccessMsg();
    }

    @Test
    public void registerErrorAllEmptyFields() {
        registerSteps.navigateToRegisterPage();
        registerSteps.clickRegisterButton();
        registerSteps.fillInRequiredFields();
    }

    @Test
    public void registerWithExistingEmailError() {
        registerSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Test");
        registerSteps.typeLastName("Tester");
        registerSteps.typeEmail("test_1@yopmail.com");
        registerSteps.typePassword("test123");
        registerSteps.typeConfirmationPass("test123");
        registerSteps.checkNewsletterBox();
        registerSteps.clickRegisterButton();
        registerSteps.existingAccountRegErrMsg();
    }








}
