package de.komoot.webdriver.homepage;

import de.komoot.webdriver.TestCase;
import de.komoot.webdriver.pageobject.homepage.HomePage;
import de.komoot.webdriver.pageobject.homepage.LoginPage;
import de.komoot.webdriver.pageobject.homepage.SettingsPage;
import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SettingsPageTest extends TestCase {

    protected static final Logger LOGGER = LogManager.getLogger(SettingsPageTest.class);

    HomePage hp = new HomePage();
    LoginPage lp = new LoginPage();
    SettingsPage sp = new SettingsPage();

    @BeforeMethod
    public void firstTest() {
        HomePage.openHomePage();
        hp.signUpLink();
        lp.enterEmailAddress("shahab2815.com");
        lp.enterPassword("abc123");
        lp.clickSignUpOrLoginButton();
    }

    @Test
    @Description("Edit existing Email Address - {email}")
    public void changeEmailAddress(String newEmail)
    {
        lp.goBackToHomePage();
        sp.clickEditButton();
        sp.changeEmailInput().sendKeys("");
    }
}
