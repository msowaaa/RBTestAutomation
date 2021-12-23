package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private static final String BASE_URL = "https://clare--crqa.my.salesforce.com/";
    protected WebDriver driver;
    private WebElement element;

    @BeforeAll
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void  setupTest(){
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @AfterEach
    public void teardown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
