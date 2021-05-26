package steps;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;

public class Hooks {

    @Before
    public void config() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}
