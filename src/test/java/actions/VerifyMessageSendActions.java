package actions;

import controls.VerifyMessageSendControl;

public class VerifyMessageSendActions {
    private VerifyMessageSendControl vmdc = new VerifyMessageSendControl();
    private String resultText = "Ваше письмо отправлено. Перейти во Входящие";

    public boolean checkResultMessage() {
        if (vmdc.messageDeliveryBox().getText().equals(resultText)) {
            return true;
        } else {
            return false;
        }
    }

}
