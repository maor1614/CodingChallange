package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BaseTest {


    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Logger log;


    @BeforeClass
    public void setUp() {
        log = LogManager.getLogger(this.getClass());
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        driver = new ChromeDriver();

        // Initialize WebDriverWait, you can adjust the time as needed
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Maximize window or set specific window size
        driver.manage().window().maximize();
    }

    @AfterClass // TestNG annotation for teardown
    public void tearDown() {
        // Close the browser and quit the driver
        if (driver != null) {
            driver.quit();
        }
    }

}
