package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MarketPageStep {

    @Step("Выбираем раздел {0}")
    public void moveCursorToTopMenu(String topMenuName) throws InterruptedException {
        new MarketPage().moveCursorToTopMenuList(topMenuName);
    }

    @Step("Выбор категории {0}")
    public void clickToCategory(String subWrapMenu) {
        new MarketPage().clickTopMenuSubWrap(subWrapMenu);
    }

    @Step("Ожидание {0}")
    public void waitSubWrapMenuElement(String subWrapMenuName) {
        new MarketPage().waitSubWrapMenuElement(subWrapMenuName);
    }


}