package steps;

import pages.EarmuffPage;
import ru.yandex.qatools.allure.annotations.Step;


public class EarmuffPageStep {

    String expectedName;

    @Step("Сравнение кол-ва товаров для наушников {0}")
    public void checkCountProductOnPage(int count) {
        new EarmuffPage().checkCountOnPage(count);
    }

    @Step("Название наушников по номеру {0} из списка")
    public String getNameEarPhone(int index) {
        return expectedName = new EarmuffPage().getElement(index);
    }

    @Step("Поиск по названию наушников")
    public void sendKeyInputSearch() throws InterruptedException { new EarmuffPage().sendExpectedName(expectedName); }

    @Step("Поиск для наушников")
    public void clickSearchButton() {
        new EarmuffPage().SearchButton();
    }

    @Step("Проверка наушников на совпадение")
    public void checkProductTitle() {
        new EarmuffPage().checkProductName(expectedName);
    }

    @Step("Выбираем наушники из списка")
    public void clickFirstEarPhone(){
        new EarmuffPage().EarPhoneClick();
    }
}