package steps;

import io.cucumber.java.en.*;
import pages.BasicPage;

public class BasicPageDefition {

    BasicPage basicPage = new BasicPage();

   @Then("Click Log In")
    public void clickButton(){
        basicPage.clickLogIn();
   }
}
