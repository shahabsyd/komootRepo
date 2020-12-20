package de.komoot.webdriver.homepage;

import de.komoot.webdriver.TestCase;
import de.komoot.webdriver.pageobject.homepage.DiscoverPage;
import de.komoot.webdriver.pageobject.homepage.HomePage;
import de.komoot.webdriver.pageobject.homepage.LoginPage;
import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends TestCase {
    protected static final Logger LOGGER = LogManager.getLogger(HomePageTest.class);

    HomePage hp = new HomePage();
    LoginPage lp = new LoginPage();


    @BeforeMethod
    public void firstTest() {
        HomePage.openHomePage();

    }


    @Test
    @Description("Sign Up with correct crendentials")
    public void SignUp(){
        LOGGER.info("the is my first test");
        //Selenide.open("www.google.com");

         hp.signUpLink();
        //lp.enterEmailAddress("sydshahab@gmail.com");
        //lp.clickContinueWithEmail();
        //lp.enterUserName("sam");
        //lp.enterPassword("abc123");
        //lp.clickSignUpOrLoginButton();
    }

    @Test
    @Description("Sign in with Correct Credentials")
    public DiscoverPage login(){
        hp.signUpLink();
        lp.enterEmailAddress("shahab2815.com");
        lp.enterPassword("abc123");
        lp.clickSignUpOrLoginButton();
        return new DiscoverPage();

    }


}





