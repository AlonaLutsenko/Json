package UBS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class UBSCourier {
    private WebDriver driver;
    private String url = "https://ita-social-projects.github.io/GreenCityClient/#/";

    @BeforeSuite
    public void setUp() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:/Users/Луценко/Downloads/Programes");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("The setup process is completed");
    }

    @BeforeTest
    public void publicSetup() {
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed");
    }


}
