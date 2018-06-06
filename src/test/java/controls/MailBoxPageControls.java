package controls;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MailBoxPageControls {

    public SelenideElement messageWriteButtonControl() {
        return $(byXpath("//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div"));
    }

    public SelenideElement portalMenuControl() {
        return $(byId("portal-menu"));
    }

    public SelenideElement messageReceiverFieldControl() {
        return $(byAttribute("data-original-name", "To"));
    }

    public SelenideElement messageTopicFieldControl() {
        return $(byAttribute("name", "Subject"));
    }

    public SelenideElement bodyMessageFieldControl() {
        return $(byId("tinymce"));
    }

    public SelenideElement sendMessageButtonControl() {
        return $(byXpath("//*[@id=\"b-toolbar__right\"]/div[3]/div/div[2]/div[1]/div"));
    }
}
