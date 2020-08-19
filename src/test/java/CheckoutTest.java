import model.Checkout;
import model.CheckoutBuilder;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutTest extends BaseTest {
    private HomePage homePage;

    @BeforeMethod
    public void before() {
        homePage = new HomePage();
    }


    @Test(dataProvider = "checkoutProvider")
    public void buyingPizza(Checkout checkout) {
        Assert.assertTrue(homePage.clickYes());
        BasePage basePage = homePage.clickPizzaButton();
        Assert.assertTrue(basePage instanceof PizzaPage);
        PizzaPage pizzaPage = (PizzaPage) basePage;
        pizzaPage.sortByDescent();
        pizzaPage.clickAddToCartButton();
        basePage = basePage.clickOrderButton();
        Assert.assertTrue(basePage instanceof CheckoutPage);
        CheckoutPage checkoutPage = (CheckoutPage) basePage;
        checkoutPage.fillingOutAnOrder(checkout);
        basePage = checkoutPage.clickOrderButton();
        Assert.assertTrue(basePage instanceof DeliveryPage);
        DeliveryPage deliveryPage = (DeliveryPage) basePage;
    }

    @Test(dataProvider = "checkoutProvider")
    public void buyingDrinks(Checkout checkout) {
        BasePage basePage = homePage.clickDrinksButton();
        Assert.assertTrue(homePage.clickYes());
        Assert.assertTrue(basePage instanceof DrinksPage);
        DrinksPage drinksPage = (DrinksPage) basePage;
        drinksPage.clickAddToCartWater();
        drinksPage.clickAddToCartBeer();
        drinksPage.clickAddToCartJuice();
        basePage = basePage.clickOrderButton();
        Assert.assertTrue(basePage instanceof CheckoutPage);
        CheckoutPage checkoutPage = (CheckoutPage) basePage;
        checkoutPage.fillingOutAnOrder(checkout);
        basePage = checkoutPage.clickOrderButton();
        Assert.assertTrue(basePage instanceof DeliveryPage);
        DeliveryPage deliveryPage = (DeliveryPage) basePage;

    }

    @Test(dataProvider = "checkoutProvider")
    public void buyingDesserts(Checkout checkout) {
        BasePage basePage = homePage.clickDessertsButton();
        Assert.assertTrue(homePage.clickYes());
        Assert.assertTrue(basePage instanceof DessertsPage);
        DessertsPage dessertsPage = (DessertsPage) basePage;
        dessertsPage.clickAddToCartButtons();
        basePage = basePage.clickOrderButton();
        Assert.assertTrue(basePage instanceof CheckoutPage);
        CheckoutPage checkoutPage = (CheckoutPage) basePage;
        checkoutPage.fillingOutAnOrder(checkout);
        basePage = checkoutPage.clickOrderButton();
        Assert.assertTrue(basePage instanceof DeliveryPage);
        DeliveryPage deliveryPage = (DeliveryPage) basePage;
    }

    @Test(dataProvider = "checkoutProvider")
    public void buyingSides(Checkout checkout) {
        BasePage basePage = homePage.clickSidesButton();
        Assert.assertTrue(homePage.clickYes());
        Assert.assertTrue(basePage instanceof SidesPage);
        SidesPage sidesPage = (SidesPage) basePage;
        sidesPage.clickAddToCartChicken();
        basePage = basePage.clickOrderButton();
        Assert.assertTrue(basePage instanceof CheckoutPage);
        CheckoutPage checkoutPage = (CheckoutPage) basePage;
        checkoutPage.fillingOutAnOrder(checkout);
        basePage = checkoutPage.clickOrderButton();
        Assert.assertTrue(basePage instanceof DeliveryPage);
        DeliveryPage deliveryPage = (DeliveryPage) basePage;

    }

    @DataProvider
    public Object[][] checkoutProvider() {
        return new Object[][]{
                {new CheckoutBuilder()
                        .withName("Александр")
                        .withPhoneNumber("5078674556")
                        .withEmail("alexponomarenko@gmail.com")
                        .withHome("78")
                        .withFlat("9")
                        .withPorch("1")
                        .withCode("9")
                        .withFloor("3")
                        .withTypePayment("Наличные")
                        .build()
                },
        };
    }
}
