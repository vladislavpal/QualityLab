package controls;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class VerifyMessageSendControl {

    public SelenideElement messageDeliveryBox() {
        return $(byXpath("//*[@id=\"b-compose__sent\"]/div/div[1]/div"));
    }
}
