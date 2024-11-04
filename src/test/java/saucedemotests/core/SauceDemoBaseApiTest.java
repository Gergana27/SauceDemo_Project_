package saucedemotests.core;

import com.saucedemo.api.SauceProductsService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import testframework.core.BaseApiTest;

public class SauceDemoBaseApiTest extends BaseApiTest {
    protected SauceProductsService sauceProductsService;

    @BeforeEach
    public void beforeTests() {
        // perform some code before each test starts
        sauceProductsService = new SauceProductsService();
    }

    @BeforeAll
    public static void beforeAll() {
    }

    @AfterEach
    public void afterTest() {
    }

    @AfterAll
    public static void afterAll() {
    }
}