package pages;

import controls.MainPageControls;

public class HomePage {
    private MainPageControls mainPageControls = new MainPageControls();

    public HomePage addLogin(String login) {
        mainPageControls.loginFieldControl().val(login);
        return this;
    }

    public HomePage addPassword(String password) {
        mainPageControls.passwordFieldControl().val(password);
        return this;
    }

    public HomePage clickSumbitButton() {
        mainPageControls.submitButtonControl().click();
        return this;
    }

    public HomePage addInfoForSearch(String searchText) {
        mainPageControls.searchFieldControl().val(searchText);
        return this;
    }

    public HomePage clickSearchSumbitButton() {
        mainPageControls.searchSubmitButtonControl().click();
        return this;
    }

}
