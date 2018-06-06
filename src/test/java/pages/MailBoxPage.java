package pages;

import controls.MailBoxPageControls;

import static com.codeborne.selenide.Selenide.switchTo;

public class MailBoxPage {
    private MailBoxPageControls mailBoxPageControls = new MailBoxPageControls();

    public MailBoxPage clickCreateNewMessage() {
        mailBoxPageControls.messageWriteButtonControl().click();
        return this;
    }

    public MailBoxPage addMessageReceiver(String value) {
        mailBoxPageControls.messageReceiverFieldControl().val(value).pressEnter();
        return this;
    }

    public MailBoxPage addMessageTopic(String value) {
        mailBoxPageControls.messageTopicFieldControl().val(value);
        return this;
    }

    public MailBoxPage addBodyMessage(String value) {
        switchTo().frame(0);
        mailBoxPageControls.bodyMessageFieldControl().val(value);
        switchTo().defaultContent();
        return this;
    }

    public MailBoxPage clickButtonSendMessage() {
        mailBoxPageControls.sendMessageButtonControl().click();
        return this;
    }

}
