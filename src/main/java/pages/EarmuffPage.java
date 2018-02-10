//Страница выора наушников

package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseStep;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class EarmuffPage {

    @FindBy(xpath = "(//div[contains(@class,'n-snippet-cell2__title')]/a)")
    List<WebElement> countOnPage;
    @FindBy(xpath = "//div//input[@id='header-search']")
    WebElement searchInput;
    @FindBy(xpath = "//span[@class='search2__button']")
    WebElement searchButton;
    @FindBy(xpath = "//div[@class='n-title__text']//h1")
    WebElement productName;
    @FindBy(xpath = "(//a/strong[contains(text(),'Наушники')])[1]")
    WebElement EarPhone;


    public EarmuffPage() {
        PageFactory.initElements(BaseStep.getDriver(), this);
    }

    public String getElement(int index) {
        return countOnPage.get(index).getText();
    }
    public String getProductName() {
        return productName.getText();
    }
    public int getCountProductOnPage() {
        return countOnPage.size();
    }
    public void checkCountOnPage(int expectedValue) {
        assertEquals(expectedValue, getCountProductOnPage());
    }
    public void sendExpectedName(String expName) {
        searchInput.sendKeys(expName);
    }
    public void SearchButton() {
        searchButton.click();
    }
    public void checkProductName(String expectedProductName) {
        assertEquals(expectedProductName, getProductName());
    }
    public void EarPhoneClick(){
        EarPhone.click();
    }
}