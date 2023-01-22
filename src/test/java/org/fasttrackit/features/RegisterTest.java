package org.fasttrackit.features;

import org.junit.Test;

public class RegisterTest extends BaseTest {

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
