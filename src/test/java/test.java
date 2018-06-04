import actions.MailBoxPageActions;
import actions.MainPageActions;
import org.junit.Before;
import org.junit.Test;
import tools.ConfigLoader;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class test {
    private ConfigLoader cl = new ConfigLoader();
    private MainPageActions mpa = new MainPageActions();
    private MailBoxPageActions mbpa = new MailBoxPageActions();

    private String url = cl.getUrl();
    private String login = cl.getLogin();
    private String password = cl.getPassword();

    @Before
    public void beforeTest() {
        open(url);
        assertTrue(mpa.checkOpenMainPage());
        assertTrue(mpa.authenticate(login, password));
        assertTrue(mbpa.checkOpenMailBoxPage());
    }

    @Test
    public void test() {

    }

}
