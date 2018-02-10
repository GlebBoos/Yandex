package steps;

import pages.FilterPage;
import ru.yandex.qatools.allure.annotations.Step;


public class FilterPageStep {

    @Step("Установка параметров фильтра {0}")
    public void choiceCheckBox(String checkBoxName) {
        new FilterPage().choiceCheckBox(checkBoxName);
    }
    @Step("В поле {0} установлено значение {1}")
    public void inputBoxFill(String name, String value) {
        new FilterPage().inputBoxFill(name, value);
    }
    @Step("Нажатие кнопки {0}")
    public void clickButtonText(String nameButton) {
        new FilterPage().clickButtonText(nameButton);
    }
}