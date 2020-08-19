package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//button[text()='Детали']")
    private WebElement detailsButton;
}
