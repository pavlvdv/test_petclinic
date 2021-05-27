import org.junit.Assert;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pageObjects.Menu;
import pageObjects.Owners;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Junit5ParamTests {

    @ParameterizedTest
    @CsvSource({
            "HOME,Welcome",
            "Find Owners,Find Owners",
            "Veterinarians,Veterinarians"
    })
    public void menuTest(String selection, String pageTitle) {
        Menu.openMain();
        Menu.section(selection).click();
        Assert.assertEquals("Заголовок страницы", Menu.getTitle(), pageTitle);
    }

    @ParameterizedTest
    @CsvSource({
            ",Список из 10 владельцев",
            "Franklin,Карточка владельца",
            "George,Никто не найден"
    })
    public void findOwnersTest(String owners,String resultFind) {
        Owners.openPageFind();
        Owners.fieldLastName().val(owners);
        Owners.button("Find Owner").click();

        switch (resultFind) {
            case "Список из 10 владельцев":
                Assert.assertEquals("Список из 10 владельцев", Owners.countOwnersInTable(), 10);
                break;
            case "Карточка владельца":
                Assert.assertEquals("Карточка владельца", Owners.getNameOwner(), "George Franklin");
                break;
            case "Никто не найден":
                Assert.assertTrue("Никто не найден", Owners.notFound());
                break;
        }
    }
}
