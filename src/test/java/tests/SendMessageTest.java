package tests;

import actions.MailBoxPageActions;
import actions.MainPageActions;
import actions.VerifyMessageSendActions;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.MailBoxPage;
import tools.ConfigLoader;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class SendMessageTest {
    private static ConfigLoader cl = new ConfigLoader();
    private MainPageActions mpa = new MainPageActions();
    private MailBoxPageActions mbpa = new MailBoxPageActions();
    private HomePage homePage = new HomePage();
    private MailBoxPage mailBoxPage = new MailBoxPage();
    private VerifyMessageSendActions vmsa = new VerifyMessageSendActions();

    private String url = cl.getUrl();
    private String login = cl.getLogin();
    private String password = cl.getPassword();
    private String browser = cl.getBrowser();

    @Before
    public void beforeTest() {
        Configuration.browser = browser;
        open(url);
        assertTrue(mpa.checkOpenMainPage());
    }

    @Test
    public void sendMessage() {
        homePage.addLogin(login)
                .addPassword(password)
                .clickSumbitButton();
        assertTrue(mbpa.checkOpenPageMailBox());
        mailBoxPage.clickCreateNewMessage();
        assertTrue(mbpa.checkOpenPageCreateNewMessage());
        mailBoxPage.addMessageReceiver("welcome@corp.mail.ru")
                .addMessageTopic("Тестовое сообщение")
                .addBodyMessage("Тестовое сообщение. Тело письма.")
                .clickButtonSendMessage();
        assertTrue(vmsa.checkResultMessage());
    }


}
