package base;

import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.RegisterPage;

public class WebApp {

    private WebDriver driver;

    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    public WebApp(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
             loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage(driver);
        }
        return dashboardPage;
    }
    private RegisterPage registerPage;

    public RegisterPage registerPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage(driver);
        }
        return registerPage;
    }
}
