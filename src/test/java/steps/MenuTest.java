package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ru.*;
import org.junit.Assert;
import pageObjects.Menu;
import pageObjects.Owners;

import static com.codeborne.selenide.Selenide.*;

public class MenuTest {
    @Дано("пользователь находится на главной странице сайта")
    public void пользовательНаходитсяНаГлавнойСтраницеСайта() {
        open("http://localhost:8888/");
    }

    @Если("пользователь нажимает в меню на {string}")
    public void пользовательНажимаетВМенюНа(String section) {
        Menu.section(section).click();
    }

    @Когда("пользователь видит заголовок страницы {string}")
    public void пользовательВидитЗаголовокСтраницы(String pageTitle) {
        Assert.assertEquals("Заголовок страницы", Menu.getTitle(), pageTitle);
    }

    @Given("the user is on the main page of the site")
    public void theUserIsOnTheMainPageOfTheSite() {
        open("http://localhost:8888/");
    }

    @When("the user clicks on a {string} in the menu")
    public void theUserClicksOnAInTheMenu(String section) {
        Menu.section(section).click();
    }

    @Then("the user sees the page title {string}")
    public void theUserSeesThePageTitle(String pageTitle) {
        Assert.assertEquals("Заголовок страницы", Menu.getTitle(), pageTitle);
    }

    @Дано("пользователь находится на странице Find owners")
    public void пользовательНаходитсяНаСтраницеFindOwners() {
        Owners.openPageFind();
    }

    @Когда("пользователь вводит наименование владельца {string} в поле Last name")
    public void пользовательВводитНаименованиеВладельцаВладелецВПолеLastName(String owners) {
        Owners.fieldLastName().val(owners);
    }

    @И("пользователь нажимает кнопку {string}")
    public void пользовательНажимаетКнопку(String buttonTitle) {
        Owners.button(buttonTitle).click();
    }

    @Тогда("пользователь видит {string}")
    public void пользовательВидит(String resultFind) {
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
