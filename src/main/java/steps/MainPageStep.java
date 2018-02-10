package steps;

import ru.yandex.qatools.allure.annotations.Step;
import pages.MainPage;


public class MainPageStep {
    @Step("Выбор вкладки {0}")
    public void clickToTab(String tabName) {
        new MainPage().clickPage(tabName);
    }
}