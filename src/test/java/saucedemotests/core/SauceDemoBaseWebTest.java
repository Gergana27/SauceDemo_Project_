package saucedemotests.core;

import com.saucedemo.pages.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import testframework.PropertiesManager;
import testframework.core.BaseWebTest;

public class SauceDemoBaseWebTest extends BaseWebTest {
    protected LoginPage loginPage;
    protected InventoryPage inventoryPage;
    protected ShoppingCartPage shoppingCartPage;
    protected CheckoutOverviewPage checkoutOverviewPage;
    protected CheckoutYourInformationPage checkoutYourInformationPage;
    protected CheckoutCompletePage checkoutCompletePage;

    @BeforeEach
    public void beforeTests() {

        inventoryPage = new InventoryPage();
        loginPage = new LoginPage();
        shoppingCartPage = new ShoppingCartPage();
        checkoutOverviewPage = new CheckoutOverviewPage();
        checkoutYourInformationPage = new CheckoutYourInformationPage();
        checkoutCompletePage = new CheckoutCompletePage();

        driver().get(PropertiesManager.getConfigProperties().getProperty("sauceDemoBaseUrl"));
    }

    @BeforeAll
    public static void beforeAll() {
    }

    // close driver
    @AfterEach
    public void afterTest() {
        driver().close();
    }

    @AfterAll
    public static void afterAll() {
    }

    public void authenticateWithUser(String username, String pass) {
        loginPage.submitLoginForm(username, pass);

        inventoryPage.waitForPageTitle();
    }
}