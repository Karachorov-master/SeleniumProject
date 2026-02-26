package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserTool;

public class BaseTest {

    protected WebDriver driver;
    private BrowserTool browserTool;
    protected WebApp webApp;

    @BeforeMethod
    public void setup() {
        browserTool = new BrowserTool();
        driver = browserTool.setupDriver();
        webApp = new WebApp(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            browserTool.quitDriver(driver);
        }
        driver = null;
    }
}
