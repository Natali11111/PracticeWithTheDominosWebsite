import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.DriverManager;
import utils.PropertiesManager;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    private static WebDriver driver;
    private String url = PropertiesManager.getInstance().getResourceByName("URL");

    @BeforeTest
    public void beforeClass() {
        driver = DriverManager.getInstance().createWebDriver().getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(url);
    }

    @AfterMethod
    public void afterMethod() {
        driver.manage().deleteAllCookies();
    }

    @AfterTest
    public void afterClass() {
        driver.close();
    }
}
