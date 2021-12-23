package tests;
package pages;

import org.apache.commons.logging.Log;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.PageTitleUtils;

import java.time.Duration;

public class HomePageTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void shouldLoginUser() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //WebElement usernameField = driver.findElement(By.id("username"));
        LoginPage.getUsernameField.sendKeys("marcin.sowa@crm.rb.com.crqa");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Q6IED2rHf1z284tgFVVd@");

        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();

        Assertions.assertEquals(driver.getTitle(), PageTitleUtils.HOME_PAGE_TITLE);
    }

}
