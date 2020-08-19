package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DessertsPage extends BasePage {
    public DessertsPage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//button[@class='dp-product-block__cart-button']")
    private List<WebElement> listAddToCartButtons;

    public void clickAddToCartButtons(){
        List<WebElement> listOfAllAddToCartButtons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@class='dp-product-block__cart-button']")));
        WebElement elementChocolateRoll = listOfAllAddToCartButtons.get(0);
        WebElement elementVanillaMuffin = listOfAllAddToCartButtons.get(1);
        WebElement elementChocolateMuffin = listOfAllAddToCartButtons.get(2);
        WebElement elementCinnamonBites = listOfAllAddToCartButtons.get(4);
        elementChocolateRoll.click();
        elementVanillaMuffin.click();
        elementChocolateMuffin.click();
        elementCinnamonBites.click();
    }
}
