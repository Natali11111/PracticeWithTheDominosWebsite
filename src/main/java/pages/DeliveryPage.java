package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage extends BasePage {

    public DeliveryPage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//button[@class='dp-btn red' and text()='Pizza Tracker']")
    private WebElement pizzaTrackerButton;

}
