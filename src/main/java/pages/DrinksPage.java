package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DrinksPage extends BasePage {
    public DrinksPage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//button[@class='dp-product-block__cart-button']")
    private List<WebElement> listOrderButtons;

    public void clickAddToCartWater() {
        List<WebElement> listOfAllOrderButtons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@class='dp-product-block__cart-button']")));
        WebElement element = listOfAllOrderButtons.get(3);
        element.click();
    }
    public void clickAddToCartBeer(){
        List<WebElement> listOfAllAddToCartButtons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@class='dp-product-block__cart-button']")));
        WebElement elementMillerBeer = listOfAllAddToCartButtons.get(11);
        WebElement elementLowenbrauOriginal = listOfAllAddToCartButtons.get(10);
        elementLowenbrauOriginal.click();
        elementMillerBeer.click();
    }

    public void clickAddToCartJuice(){
        List<WebElement> listOfAllOrderButtons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@class='dp-product-block__cart-button']")));
        WebElement element = listOfAllOrderButtons.get(15);
        element.click();
    }
}
