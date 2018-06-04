package actions;

import com.codeborne.selenide.SelenideElement;
import controls.MainPageControls;
import tools.WaitElement;

public class MainPageActions {
    private MainPageControls mpg = new MainPageControls();
    private WaitElement we = new WaitElement();

    public boolean loginFieldActions() {
        return we.waitElementBool(mpg.loginFieldControl());
    }

    public boolean passwordFieldActions() {
        return we.waitElementBool(mpg.passwordFieldControl());
    }

    public boolean submitButtonActions() {
        return we.waitElementBool(mpg.submitButtonControl());
    }

    public boolean searchFieldActions() {
        return we.waitElementBool(mpg.searchFieldControl());
    }

    public boolean searchSubmitButtonActions() {
        return we.waitElementBool(mpg.searchSubmitButtonControl());
    }

    public boolean checkOpenMainPage() {
        if (loginFieldActions() && passwordFieldActions() && submitButtonActions()
                && searchFieldActions() && searchSubmitButtonActions()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean authenticate(String login, String password) {
        boolean result = false;
        SelenideElement loginField = we.waitElement(mpg.loginFieldControl());
        loginField.val(login);

        SelenideElement passwordField = we.waitElement(mpg.passwordFieldControl());
        loginField.val(password);

        if (loginField.getValue().equals(login) && passwordField.getValue().equals(password)) {
            result = true;
            SelenideElement submitButton = we.waitElement(mpg.submitButtonControl());
            submitButton.click();
        }
        return result;
    }
}
