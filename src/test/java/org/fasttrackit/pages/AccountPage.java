package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextElement;


    //public boolean isWelcomeText(String userName) {
   //    return welcomeTextElement.containsOnlyText("Hello, " + userName + "!");
   // }

    public String getWelcomeText(){
        return welcomeTextElement.getText();
    }

    //public void userIsLoggedIn(String userName){
     //   welcomeTextElement.shouldContainOnlyText("Hello, " + userName + "!");
    //}
}
