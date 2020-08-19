package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends PageObject {
    public BasePage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//p[text()='Акции']")
    private WebElement promotionsButton;

    @FindBy(xpath = "//p[text()='Пицца']")
    private WebElement pizzaButton;

    @FindBy(xpath = "//p[text()='Напитки']")
    private WebElement drinksButton;

    @FindBy(xpath = "//p[text()='Сайды']")
    private WebElement sidesButton;

    @FindBy(xpath = "//p[text()='Десерты']")
    private WebElement dessertsButton;

    @FindBy(xpath = "//button[text()='Заказать']")
    private WebElement orderButton;

    @FindBy(xpath = "//button[text()='Да']")
    private WebElement yesButton;

    @FindBy(xpath = "//div[@class='fake-header__sing-in-block']/button[text()='Войти']")
    private WebElement singInButton;


    public BasePage clickPizzaButton() {
        pizzaButton.click();
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='Пицца: Классические']")));
            return new PizzaPage();
        } catch (TimeoutException e) {
            return new BasePage();
        }
    }

    public BasePage clickDrinksButton() {
        drinksButton.click();
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='Вода']")));
            return new DrinksPage();
        } catch (TimeoutException e) {
            return new BasePage();
        }
    }

    public BasePage clickDessertsButton() {
        dessertsButton.click();
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='https://media.dominos.ua/menu/product_osg_image/2018/03/23/black_maffin.jpg']")));
            return new DessertsPage();
        } catch (TimeoutException e) {
            return new BasePage();
        }
    }

    public BasePage clickSidesButton() {
        sidesButton.click();
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='Картофель']")));
            return new SidesPage();
        } catch (TimeoutException e) {
            return new BasePage();
        }
    }


    public BasePage clickOrderButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Заказать']"))).click();
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//h1[text()='Оформление заказа']"))));
            return new CheckoutPage();
        } catch (TimeoutException e) {
            return new BasePage();
        }
    }

    public boolean clickYes() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dp-modal-confirm-location__content']")));
            yesButton.click();
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
