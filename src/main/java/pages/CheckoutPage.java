package pages;

import model.Checkout;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class CheckoutPage extends BasePage {

    public CheckoutPage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//div[@class='with-label__content']/input[@placeholder='Имя']")
    private WebElement nameField;

    @FindBy(xpath = "//div[@class='PhoneInput__PhoneWrapper-sc-16i3xv8-0 cEUglQ']/input")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//div[@class='with-label__content']/input[@placeholder='Email']")
    private WebElement emailField;

    @FindBy(xpath = "//div[@class='checkout-form-grid__cell checkout-form__input-street']/div[@class='with-label__block with-label__block_up ']//div[@class=' css-18uasko']]")
    private WebElement streetField;

    @FindBy(xpath = "//div[@class='checkout-form-grid__cell checkout-form__input-street']/div[@class='with-label__block with-label__block_up ']")
    private WebElement clickOnStreetFieldButton;

    @FindBy(xpath = "//button[@class='checkout-navigation-bar__button checkout-navigation-bar__button_active']")
    private WebElement deliveryRadioButton;

    @FindBy(xpath = "//button[@class='checkout-navigation-bar__button']")
    private WebElement onHighRadioButton;

    @FindBy(xpath = "//input[@name='street_number']")
    private WebElement homeField;

    @FindBy(xpath = "//input[@name='apartment']")
    private WebElement flatField;

    @FindBy(xpath = "//input[@name='entrance']")
    private WebElement porchField;

    @FindBy(xpath = "//input[@name='door_code']")
    private WebElement codeField;

    @FindBy(xpath = "//input[@name='floor']")
    private WebElement floorField;

    @FindBy(xpath = "//textarea[@name='comment']")
    private WebElement commentField;

    @FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
    private List<WebElement> listOfDropDownButtons;

    @FindBy(xpath = "//button[@class='checkout-pay__order-button']")
    private WebElement orderButton;


    private void typeName(String name) {
        nameField.sendKeys(name);
    }

    private void typeFlat(String flat){
        flatField.sendKeys(flat);
    }

    private void typePhoneNumber(String phoneNumber) {
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
    }

    private void typeEmail(String email) {
        emailField.sendKeys(email);
    }

    private void typeHome(String home) {
        homeField.sendKeys(home);
    }

    private void typePorch(String porch) {
        porchField.sendKeys(porch);
    }

    private void typeCode(String code) {
        codeField.sendKeys(code);
    }

    private void typeFloor(String floor) {
        floorField.sendKeys(floor);
    }


    private void clickOnTheDropDownListWithTypePayment() {
        WebElement element = listOfDropDownButtons.get(3);
        element.click();
    }

    private void clickOnTypePayment(String typePayment) {
        driver.findElement(By.xpath("//*[text()='" + typePayment + "']")).click();
    }

    private void selectStreet() {
        clickOnStreetFieldButton.click();
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F);
            robot.keyPress(KeyEvent.VK_Y);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_J);
            robot.keyPress(KeyEvent.VK_Y);
            robot.keyPress(KeyEvent.VK_J);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyPress(KeyEvent.VK_B);
            robot.keyPress(KeyEvent.VK_X);
            robot.keyPress(KeyEvent.VK_F);
            driver.findElement(By.xpath("//*[text()='Антоновича ул']")).click();
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

    private void selectTypePayment(String typePayment) {
        clickOnTheDropDownListWithTypePayment();
        clickOnTypePayment(typePayment);
    }


    public BasePage clickOrderButton() {
       wait.until(ExpectedConditions.elementToBeClickable(orderButton)).click();
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Pizza Tracker']")));
            return new DeliveryPage();
        } catch (TimeoutException e) {
            return new BasePage();
        }

    }

    public void fillingOutAnOrder(Checkout checkout) {
        typeName(checkout.getName());
        typePhoneNumber(checkout.getPhoneNumber());
        typeEmail(checkout.getEmail());
        selectStreet();
        typeHome(checkout.getHome());
        typeFlat(checkout.getFlat());
        typePorch(checkout.getPorch());
        typeCode(checkout.getCode());
        typeFloor(checkout.getFloor());
        selectTypePayment(checkout.getTypePayment());
    }


}
