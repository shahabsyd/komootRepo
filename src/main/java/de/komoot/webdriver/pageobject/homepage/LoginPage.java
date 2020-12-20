package de.komoot.webdriver.pageobject.homepage;

import com.codeborne.selenide.SelenideElement;
import de.komoot.webdriver.pageobject.BasePage;
import io.qameta.allure.Step;
import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


@Getter
public class LoginPage extends BasePage {

    protected static final Logger LOGGER = LogManager.getLogger(LoginPage.class);


    private final SelenideElement userName = $(By.id("display_name"));
    private final SelenideElement password = $(By.id("password"));
    private final SelenideElement signUp = $x("//div[contains(text(),'Sign Up')]");
    private final SelenideElement emailField = $(By.id("email"));
    private final SelenideElement contWithEmail = $x("//div[contains(text(),'Continue with Email')]");
    private final SelenideElement gotoHomePage = $x("//a[contains(text(),'komoot')]");
    private final SelenideElement logoutLink = $x("//a[contains(@href,'logout')]/@href");


    @Step("Open login page")
    public LoginPage login() {
        signUpOrLogin();
        return new LoginPage();
    }

    public void signUpOrLogin() {
        signUp.click();
    }

    public void enterEmailAddress(String email) {
        emailField.sendKeys(email);
    }

    public void clickContinueWithEmail() {
        contWithEmail.click();
    }

    public void enterUserName(String usrName) {
        userName.sendKeys(usrName);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickSignUpOrLoginButton() {
        signUp.click();
    }

    public void goBackToHomePage() {
        gotoHomePage.click();
    }

    public HomePage logOut() {
        logoutLink.click();
        return new HomePage();
    }


}
