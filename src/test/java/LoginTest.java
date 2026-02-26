import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        webApp.loginPage().goToLoginPage();
        webApp.loginPage().typeTextInUsernameInputField("admin");
        webApp.loginPage().typeTextInPasswordInputField("parola123!");
        webApp.loginPage().clickOnTheLoginButton();
        Assert.assertEquals(webApp.dashboardPage().usernameGetText(), "   John Doe");
    }
}
