//Основная страница Yandex

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;


public class MainPage {

    @FindBy(xpath = "//div[contains(@class,\"home-tabs stream-control\")]")
    WebElement yandexMarketHref;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickHomeTab(String tabsName) {
        yandexMarketHref.findElement(By.xpath("//a[contains(text(),'" + tabsName + "')]")).click();

    }
}