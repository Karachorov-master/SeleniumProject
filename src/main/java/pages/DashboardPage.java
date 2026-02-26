package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(css = "#nav-profile span")
    private WebElement username;

    private static final By USER_NAME = By.cssSelector("#nav-profile span");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public String usernameGetText() {
        waitTool.waitForElementVisibility(driver, USER_NAME, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME));
//        wait.until(ExpectedConditions.visibilityOf(username));
        return getText(USER_NAME);
    }
}
