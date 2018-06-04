package controls;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class MainPageControls {

    public SelenideElement loginFieldControl() {
        return $(byId("mailbox:login"));
    }

    public SelenideElement passwordFieldControl() {
        return $(byId("mailbox:password"));
    }

    public SelenideElement submitButtonControl() {
        return $(byId("mailbox:submit"));
    }

    public SelenideElement searchFieldControl() {
        return $(byId("q"));
    }

    public SelenideElement searchSubmitButtonControl() {
        return $(byId("search:submit"));
    }
}
