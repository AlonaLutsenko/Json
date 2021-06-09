package GreenCity;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;


public class TestNGSimpleTest {
    public static WebDriver driver;
    private static ChromeDriverService service;

    @Test
    public void createAndStartService() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.findElement(By.xpath("/html/body/app-root/app-main/app-header/header/div/div/div/nav/ul/li[6]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue(driver.getPageSource().contains("Order garbage collection"));

        driver.close();
        driver.quit();
    }
}

