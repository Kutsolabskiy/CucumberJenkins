package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.element;

public class Sign_InPage {
    private SelenideElement loginInput = $(By.xpath("//input[@id='email']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@id='password']"));
    private SelenideElement welcomeBackElement = element(By.xpath("//h1[text() = 'Welcome Back']"));

    public void inputLogin(String text){
        this.loginInput.val(text);
    }

    public void passwordLogin(String text){
        this.passwordInput.val(text);
    }

    public void clickSubmitButton(){
        $(By.xpath("//button[@type='submit']")).click();
    }

    public void verify_WelcomeBack_Element(){
        welcomeBackElement.shouldBe(Condition.visible);
    }

}
