package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PizzaPage extends BasePage {

    public PizzaPage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//button[text()='В корзину']")
    private List<WebElement> addToCartButtons;

    @FindBy(xpath = "//p[text()='Сортировка']")
    private WebElement sortingDropDownList;

    @FindBy(xpath = "//li[@class='SortDropDown__DropDownItem-d8r1th-5 cxClwi' and text()='Цена высокая-низкая']")
    private WebElement highLowCriterion;


    public void clickAddToCartButton() {
        WebElement element = driver.findElement(By.xpath("//button[text()='В корзину']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickAddToCartButtonByName(String name) {
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//a[text()='" + name + "']/../../..//button[text()='В корзину']")));
    }

    public void sortByDescent() {
        sortingDropDownList.click();
        highLowCriterion.click();
    }


}
