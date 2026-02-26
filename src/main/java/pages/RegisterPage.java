package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {


        @FindBy(id = "input-firstname")
        private WebElement firstNameField;

        @FindBy(id = "input-lastname")
        private WebElement lastNameField;

        @FindBy(id = "input-email")
        private WebElement emailField;

        @FindBy(id = "input-password")
        private WebElement passwordField;

        @FindBy(name = "agree")
        private WebElement privacyCheckbox;

        @FindBy(xpath = "//button[text()='Continue']")
        private WebElement continueBtn;

        public RegisterPage(WebDriver driver) {
            super(driver);
        }

        public void fillFirstName(String name){
            typeText(firstNameField,name);
        }

        public void fillLastName(String last){
            typeText(lastNameField,last);
        }

        public void fillEmail(String email){
            typeText(emailField,email);
        }

        public void fillPassword(String pass){
            typeText(passwordField,pass);
        }

        public void clickPrivacy(){
            click(privacyCheckbox);
        }

        public void clickContinue(){
            click(continueBtn);
        }
    }

