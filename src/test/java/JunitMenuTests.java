import org.junit.Ignore;
import org.junit.Test;
import pageObjects.Menu;

import static com.codeborne.selenide.Selenide.sleep;

public class JunitMenuTests {
    @Test @Ignore
    public void theUserIsOnTheMainPageOfTheSite() {
        Menu.openMain();
        Menu.section("HOME").click();
        sleep(1000);
        Menu.section("Find Owners").click();
        sleep(1000);
        Menu.section("Veterinarians").click();
        sleep(2000);
    }
}
