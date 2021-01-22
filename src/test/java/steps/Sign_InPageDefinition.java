package steps;

import config.UserConfig;
import io.cucumber.java.en.*;
import pages.Sign_InPage;

public class Sign_InPageDefinition {

    Sign_InPage sign_inPage = new Sign_InPage();

    @Then("Input login")
    public void inputLogin(){
        sign_inPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Opened page have text  _Welcome Back_ on general area")
    public void openedPageHaveTextOnGeneralArea() {
        sign_inPage.verify_WelcomeBack_Element();
    }

    @Then("Input password")
    public void inputPassword(){
        sign_inPage.passwordLogin(UserConfig.USER_PASSWORD);
    }

    @Then("Click Sign in_Submit button")
    public void clickSignInButton(){
        sign_inPage.clickSubmitButton();
    }


}
