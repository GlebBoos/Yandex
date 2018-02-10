package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageStep {

    @Step("Нажимаем на таб {0}")
    public void clickToTab(String tabName) {
        new MainPage().clickHomeTab(tabName);
    }
}