package steps;

import pages.TVPage;
import ru.yandex.qatools.allure.annotations.Step;


public class TVPageStep {
    String expectedName;

    @Step("Выбор фильтра")
    public void clickFilter(String name)
    {
        new TVPage().AdvencedFilter(name);
    }

    @Step("Сравнение кол-во товаров для телевизора {0}")
    public void checkCountProductOnPage(int count)
    {
        new TVPage().checkCountProductOnPage(count);
    }



    @Step("Название телевизора по номеру {0}")
    public String getNameTv(int index)
    {
        return expectedName = new TVPage().getElement(index);
    }

    @Step("Поиск по названию телевизора")
    public void sendKeyInputSearch() throws InterruptedException
    {
        new TVPage().sendKeysExpectedName(expectedName);
    }

    @Step("Поиск телевизора")
    public void clickSearchButton()
    {
        new TVPage().SearchButton();
    }

    @Step("Проверка телевизора на совпадение")
    public void checkProductTitle()
    {
        new TVPage().checkProductName(expectedName);
    }
}