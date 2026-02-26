package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTool {

    public WebDriver setupDriver() {
        return new ChromeDriver();
    }

    public void quitDriver(WebDriver driver) {
        driver.quit();
    }
}
