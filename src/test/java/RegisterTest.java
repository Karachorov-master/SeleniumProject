import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CustomRandomStringGeneration;

import java.time.Duration;

public class RegisterTest extends BaseTest {

    @Test

    public void registerUserTest() {

        driver.get("https://auto.pragmatic.bg/");

        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Register")).click();

        String email = CustomRandomStringGeneration.randomAlphabetic(6) + "@mail.com";

        webApp.registerPage().fillFirstName("Petar");
        webApp.registerPage().fillLastName("Karachorov");
        webApp.registerPage().fillEmail(email);
        webApp.registerPage().fillPassword("1234Petar");
        webApp.registerPage().clickPrivacy();
        webApp.registerPage().clickContinue();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("route=account/success"));

        Assert.assertTrue(driver.getCurrentUrl().contains("route=account/success"));
    }

        }

