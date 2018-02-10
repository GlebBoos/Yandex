package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MarketPageStep {

    @Step("Наводим курсор на меню {0}")
    public void moveCursorToTopMenu(String topMenuName) throws InterruptedException {
        new MarketPage().moveCursorToTopMenuList(topMenuName);
    }

    @Step("Переходим на категорию {0}")
    public void clickToCategory(String subWrapMenu) {
        new MarketPage().clickTopMenuSubWrap(subWrapMenu);
    }

    @Step("Ожидаем элемент {0}")
    public void waitSubWrapMenuElement(String subWrapMenuName) {
        new MarketPage().waitSubWrapMenuElement(subWrapMenuName);
    }

    @Step("Кликаем чтобы избавится от геолокации")
    public void clickOutOfGeo(String name){
        new MarketPage().clickoutGeo(name);
    }
}