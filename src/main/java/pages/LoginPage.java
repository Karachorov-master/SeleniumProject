package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "input-username")
    private WebElement usernameInputField;

    @FindBy(id = "input-password")
    private WebElement passwordInputField;

    @FindBy(className = "btn-primary")
    private WebElement loginButton;

    private static final String URL = "https://auto.pragmatic.bg/manage/";


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        driver.get(URL);
    }

    public void typeTextInUsernameInputField(String text) {
        typeText(usernameInputField, text);
    }

    public void typeTextInPasswordInputField(String text) {
        typeText(passwordInputField, text);
    }

    public void clickOnTheLoginButton() {
        click(loginButton);
    }
}
