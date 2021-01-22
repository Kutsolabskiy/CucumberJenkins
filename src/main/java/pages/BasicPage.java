package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BasicPage {

    public void clickButton(String text){
        $(By.xpath("//div[text()='" + text + "']")).click();
    }

    public void clickLogIn() {
        $x("//div/a[@href = '/sign-in']").shouldBe(Condition.visible).click();
    }
}
