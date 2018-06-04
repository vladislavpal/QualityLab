package tools;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Slf4j
public class WaitElement {
    private long timeOut = 10;

    public SelenideElement waitElement(SelenideElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return element;
        } catch (Exception e) {
            log.debug("waitElement", e);
            return null;
        }
    }

    public boolean waitElementBool(SelenideElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
            log.debug("waitElementBool", e);
            return false;
        }
    }
}
