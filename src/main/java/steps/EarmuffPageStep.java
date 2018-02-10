package steps;

import pages.EarmuffPage;
import ru.yandex.qatools.allure.annotations.Step;


public class EarmuffPageStep {

    String expectedName;

    @Step("Сравниваем на количество товаров на странице. Ожидаем {0}")
    public void checkCountProductOnPage(int count) {
        new EarmuffPage().checkCountProductOnPage(count);
    }

    @Step("Вытаскаваем название из списка под номером {0}(отсчет с 0)")
    public String getNameEarPhone(int index) {
        return expectedName = new EarmuffPage().getElement(index);
    }

    @Step("Вводим значение в поиск")
    public void sendKeyInputSearch() throws InterruptedException {
        new EarmuffPage().sendKeysExpectedName(expectedName);
    }

    @Step("Нажимаем поиск")
    public void clickSearchButton() {
        new EarmuffPage().clickSearchButton();
    }

    @Step("Проверяем на совпадаение товара")
    public void checkProductTitle() {
        new EarmuffPage().checkProductName(expectedName);
    }

    @Step("переход на первые наушники")
    public void clickFirstEarPhone(){
        new EarmuffPage().clickFirstEarPhone();
    }
}