package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitTool;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected WaitTool waitTool;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.waitTool = new WaitTool();
    }

    protected BasePage() {
    }

    public void click(WebElement webElement) {
        webElement.click();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void typeText(WebElement webElement, String text) {
        webElement.sendKeys(text);
    }

    public void typeText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public String getText(WebElement webElement) {
        return webElement.getText();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void scrollIntoViewWebElementAndWaitToBeScrolledT(WebElement webElement,int timeOutInSeconds) {
        scrollIntoViewWebElement(webElement);
        waitTool.waitToBeScrolledToWebElement(driver, webElement, timeOutInSeconds);
    }

    public void scrollIntoViewWebElement(WebElement webElement) {
        ((JavascriptExecutor) driver)
                .executeScript( "arguments[0].scrollIntoView({behavior: 'instant', block: 'center'});"
                        , webElement );
    }

    public void scrollIntoViewWebElement(By locator) {
        WebElement webElement = driver.findElement(locator);
        ((JavascriptExecutor) driver)
                .executeScript( "arguments[0].scrollIntoView({behavior: 'instant', block: 'center'});"
                        , webElement );
    }
}
