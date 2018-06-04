package controls;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class MailBoxPageControls {

    public SelenideElement messageWriteButtonControl() {
        return $(byAttribute("data-title", "Написать письмо (N)"));
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
        return $(byAttribute("data-title", "Отправить (Ctrl+Enter)"));
    }
}
