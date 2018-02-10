package steps;

import pages.FilterPage;
import ru.yandex.qatools.allure.annotations.Step;


public class FilterPageStep {

    @Step("Выбираем параметры(CheckBox) {0}")
    public void choiceCheckBox(String checkBoxName) {
        new FilterPage().choiceCheckBox(checkBoxName);
    }

    @Step("Заполняем поле {0} значением {1}")
    public void inputBoxFill(String name, String value) {
        new FilterPage().inputBoxFill(name, value);
    }

    @Step("Нажать на кнопку с текстом {0}")
    public void clickButtonText(String nameButton) {
        new FilterPage().clickButtonText(nameButton);
    }
}