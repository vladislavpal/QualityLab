package actions;

import controls.MailBoxPageControls;
import lombok.extern.slf4j.Slf4j;
import tools.WaitElement;

@Slf4j
public class MailBoxPageActions {
    private WaitElement we = new WaitElement();
    private MailBoxPageControls mbpc = new MailBoxPageControls();

    public boolean messageWriteButtonAction() {
        return we.waitElementBool(mbpc.messageWriteButtonControl());
    }

    public boolean portalMenuAction() {
        return we.waitElementBool(mbpc.portalMenuControl());
    }

    public boolean messageReceiverFieldAction() {
        return we.waitElementBool(mbpc.messageReceiverFieldControl());
    }

    public boolean messageTopicFieldAction() {
        return we.waitElementBool(mbpc.messageTopicFieldControl());
    }

    public boolean bodyMessageFieldAction() {
        return we.waitElementBool(mbpc.bodyMessageFieldControl());
    }

    public boolean checkOpenMailBoxPage() {
        if (messageWriteButtonAction() && portalMenuAction()
                && messageReceiverFieldAction() && messageTopicFieldAction() && bodyMessageFieldAction()) {
            return true;
        } else {
            return false;
        }
    }


}
