package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberStep {
    MainPageStep mainPageStep = new MainPageStep();
    MarketPageStep marketPageStep = new MarketPageStep();
    TVPageStep tvPageStep = new TVPageStep();
    FilterPageStep filterPageStep = new FilterPageStep();
    EarmuffPageStep earmuffPageStep = new EarmuffPageStep();


    //Блок 1: Общие функции для двух сценариев
    @When("^Выбор вкладки \"(.+)\"$")
    public void clickHomeTabs(String tabsName) {
        mainPageStep.clickToPage(tabsName);
    }
    @When("^Выбираем раздел \"(.+)\"$")
    public void moveCursorToTopMenu(String topMenuName) throws InterruptedException { marketPageStep.moveCursorToTopMenu(topMenuName); }
    @When("^Выбор категории \"(.+)\"$")
    public void clickCategory(String subWrapName) {
        marketPageStep.clickToCategory(subWrapName);
    }
    @Then("^Выбор фильтра \"(.+)\"$")
    public void clickFilter(String name) {
        tvPageStep.clickFilter(name);
    }
    @When("^Ожидание \"(.+)\"$")
    public void waitSubWrapMenuElement(String subWrapName) {
        marketPageStep.waitSubWrapMenuElement(subWrapName);
    }
    @When("^В поле \"(.+)\" установлено значение \"(.+)\"$")
    public void inputBoxFill(String name, String value) {
        filterPageStep.inputBoxFill(name, value);
    }
    @When("^Установка параметров фильтра \"(.+)\"$")
    public void choiceCheckBox(String checkBoxName)  { filterPageStep.choiceCheckBox(checkBoxName); }
    @Then("^Нажатие кнопки \"(.+)\"$")
    public void clickButtonText(String nameButton) {
        filterPageStep.clickButtonText(nameButton);
    }


    //Блок 2: Функции для сценария с телевизором
    @When("^Сравнение кол-во товаров для телевизора \"(.+)$")
    public void checkCountProductOnPage(int count) {
        tvPageStep.checkCountProductOnPage(count);
    }
    @Then("^Название телевизора по номеру \"(.+)\" из списка$")
    public void getNameTV(int index) {
        tvPageStep.getNameTv(index);
    }
    @When("^Поиск по названию телевизора$")
    public void setInputSearch() throws InterruptedException { tvPageStep.sendKeyInputSearch(); }
    @Then("^Поиск телевизора$")
    public void clickSearchButton() {
        tvPageStep.clickSearchButton();
    }
    @Then("^Проверка телевизора на совпадение")
    public void checkProduct() {
        tvPageStep.checkProductTitle();
    }


    //Блок 3: Функция для сценария с наушниками
    @When("^Сравнение кол-ва товаров для наушников \"(.+)$")
    public void checkCountProductOnPageEarPhone(int count) {
        earmuffPageStep.checkCountProductOnPage(count);
    }
    @Then("^Поиск по названию наушников")
    public void setInputSearchEarPhone() throws InterruptedException { earmuffPageStep.sendKeyInputSearch(); }
    @Then("^Название наушников по номеру \"(.+)\" из списка$")
    public void getNameEarPhone(int index) {
        earmuffPageStep.getNameEarPhone(index);
    }
    @When("^Поиск для наушников")
    public void clickSearchButtonEarPhone() {
        earmuffPageStep.clickSearchButton();
    }
    @Then("^Проверка наушников на совпадение")
    public void checkProductEarPhone() {
        earmuffPageStep.checkProductTitle();
    }
    @When("^Выбираем наушники из списка$")
    public  void clickFirstEarPhone(){
        earmuffPageStep.clickFirstEarPhone();
    }
}