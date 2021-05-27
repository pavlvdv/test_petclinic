package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static config.Environments.BASE_URL;

public class Owners {
    public static void openPageFind() {
        open(BASE_URL + "owners/find");
    }

    public static SelenideElement fieldLastName() {
        return $("#lastName");
    }

    public static SelenideElement button(String buttonTitle) {
        return $x("//button[normalize-space()='" + buttonTitle + "']");
    }

    public static int countOwnersInTable() {
        return $$("tbody > tr").size();
    }

    public static String getNameOwner() {
        return $x("/html/body/div/div/table[1]/tbody/tr[1]/td/b").getText();
    }

    public static boolean notFound() {
        return $x("//p[contains(text(),'has not been found')]").isDisplayed();
    }
}
