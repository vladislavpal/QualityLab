package actions;

import controls.MailBoxPageControls;
import tools.WaitElement;

public class MailBoxPageActions {
    private WaitElement we = new WaitElement();
    private MailBoxPageControls mbpc = new MailBoxPageControls();

    public boolean portalMenuAction() {
        return we.waitElementBool(mbpc.portalMenuControl());
    }

    public boolean messageReceiverFieldAction() {
        return we.waitElementBool(mbpc.messageReceiverFieldControl());
    }

    public boolean messageTopicFieldAction() {
        return we.waitElementBool(mbpc.messageTopicFieldControl());
    }

    public boolean checkOpenPageMailBox() {
        if (portalMenuAction()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkOpenPageCreateNewMessage() {
        if (portalMenuAction() && messageTopicFieldAction() && messageReceiverFieldAction()) {
            return true;
        } else {
            return false;
        }
    }
}
