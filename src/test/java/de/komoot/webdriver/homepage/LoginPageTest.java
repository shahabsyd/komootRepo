package de.komoot.webdriver.homepage;

import de.komoot.webdriver.TestCase;
import de.komoot.webdriver.pageobject.homepage.HomePage;
import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestCase {

    protected static final Logger LOGGER = LogManager.getLogger(LoginPageTest.class);
    private final static int SUCCESS_STATUS = 200;

    @BeforeMethod
    public void init() {
        HomePage.openHomePage();
    }

    @Test
    @Description("Login with a valid credentials")
    public void testLoginWithValidCredentials() {
        LOGGER.info("Test login with a valid credentials");

    }


}
