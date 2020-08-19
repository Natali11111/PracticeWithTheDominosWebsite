package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class SidesPage extends BasePage {
    public SidesPage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//button[@class='dp-product-block__cart-button']")
    private List<WebElement> AddToCartButtons;

    public void clickAddToCartChicken(){
        List<WebElement> listOfAllAddToCartButtons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@class='dp-product-block__cart-button']")));
        WebElement elementBBQWings = listOfAllAddToCartButtons.get(3);
        WebElement elementChickenWings = listOfAllAddToCartButtons.get(2);
        WebElement elementChickenStrips  =  listOfAllAddToCartButtons.get(1);
        elementChickenStrips.click();
        elementChickenWings.click();
        elementBBQWings.click();
    }

}
