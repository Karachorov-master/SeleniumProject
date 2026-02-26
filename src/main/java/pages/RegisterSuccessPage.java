package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterSuccessPage extends BasePage {


    public void waitUntilOpen(){
        wait.until(ExpectedConditions.urlContains("route=account/success"));
    }

    public boolean isOpen(){
        return driver.getCurrentUrl().contains("route=account/success");
    }
}

