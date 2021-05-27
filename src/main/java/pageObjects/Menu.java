package pageObjects;

import com.codeborne.selenide.SelenideElement;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.*;
import static config.Environments.BASE_URL;

public class Menu {
    public static SelenideElement section(String title) {
        title = title.toLowerCase(Locale.ROOT);

        if (title.equals("home")) {
            title = "home page";
        }

        return $("a[title='" + title + "']");
    }

    public static void openMain() {
        open(BASE_URL);
    }

    public static String getTitle() {
        return $("h2").getText();
    }
}
