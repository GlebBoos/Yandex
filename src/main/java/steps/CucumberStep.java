package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CucumberStep {
    MainPageStep mainPageStep = new MainPageStep();
    MarketPageStep marketPageStep = new MarketPageStep();
    TVPageStep tvPageStep = new TVPageStep();
    FilterPageStep filterPageStep = new FilterPageStep();
    EarmuffPageStep earmuffPageStep = new EarmuffPageStep();

    @When("^нажимаем на таб \"(.+)\"$")
    public void clickHomeTabs(String tabsName) {
        mainPageStep.clickToTab(tabsName);
    }

    @When("^наводим курсор на меню \"(.+)\"$")
    public void moveCursorToTopMenu(String topMenuName) throws InterruptedException {
        marketPageStep.moveCursorToTopMenu(topMenuName);
    }

    @When("^переходим на категорию \"(.+)\"$")
    public void clickCategory(String subWrapName) {
        marketPageStep.clickToCategory(subWrapName);
    }

    @Then("^нажимаем на фильтр \"(.+)\"$")
    public void clickFilter(String name) {
        tvPageStep.clickFilter(name);
    }

    @When("^ожидаем элемент \"(.+)\"$")
    public void waitSubWrapMenuElement(String subWrapName) {
        marketPageStep.waitSubWrapMenuElement(subWrapName);
    }

    @When("^заполняем поле \"(.+)\" значением \"(.+)\"$")
    public void inputBoxFill(String name, String value) {
        filterPageStep.inputBoxFill(name, value);
    }

    @When("^выбираем параметры фильтра \"(.+)\"$")
    public void choiceCheckBox(String checkBoxName) throws InterruptedException {
        filterPageStep.choiceCheckBox(checkBoxName);
        //Thread.sleep(3000);
    }

    @Then("^нажимаем на кнопку \"(.+)\"$")
    public void clickButtonText(String nameButton) {
        filterPageStep.clickButtonText(nameButton);
    }

    @When("^сравниваем количество товаров на странице, ожидаем \"(.+)$")
    public void checkCountProductOnPage(int count) {
        tvPageStep.checkCountProductOnPage(count);
    }

    @Then("^вытаскиваем название телевизора под номером \"(.+)\" из списка$")
    public void getNameTV(int index) {
        tvPageStep.getNameTv(index);
    }

    @Then("^вытаскиваем название наушников под номером \"(.+)\" из списка$")
    public void getNameEarPhone(int index) {
        earmuffPageStep.getNameEarPhone(index);
    }

    @When("^ищем отдельно по названию телевизора$")
    public void setInputSearch() throws InterruptedException {
        tvPageStep.sendKeyInputSearch();
    }

    @Then("^нажимаем поиск для телика$")
    public void clickSearchButton() {
        tvPageStep.clickSearchButton();
    }

    @Then("^проверяем на совпадение названия телевизора")
    public void checkProduct() {
        tvPageStep.checkProductTitle();
    }

    //Для наушников остальное
    @When("^избавляемся от геолокации нажатием на \"(.+)\"$")
    public void clickOutOfGeo(String name){
        marketPageStep.clickOutOfGeo(name);
    }

    @When("^сравниваем количество товаров для наушников на странице, ожидаем \"(.+)$")
    public void checkCountProductOnPageEarPhone(int count) {
        earmuffPageStep.checkCountProductOnPage(count);
    }

    @Then("^ищем отдельно по названию наушников")
    public void setInputSearchEarPhone() throws InterruptedException {
        earmuffPageStep.sendKeyInputSearch();
    }

    @When("^нажимаем поиск для наушников")
    public void clickSearchButtonEarPhone() {
        earmuffPageStep.clickSearchButton();
    }

    @Then("^проверяем на совпадение названия наушников")
    public void checkProductEarPhone() {
        earmuffPageStep.checkProductTitle();
    }

    @When("^переходим на первые наушники по списку$")
    public  void clickFirstEarPhone(){
        earmuffPageStep.clickFirstEarPhone();
    }
}