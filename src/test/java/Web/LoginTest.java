package Web;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoginTest extends BaseTest {
    @Epic("Login Test")
    @Parameters({"browser", "URL"})  // Retrieve parameters from XML
    @Description("Test Description: Login test with valid username and password.")
    @Test

    public void loginSite(String browser, String URL) throws InterruptedException {
        // Set up the Logger

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver, log);
        System.out.println("Browser: " + browser);
        System.out.println("URL: " + URL);

        // Use the URL parameter to navigate
        driver.get(URL);

        home.clickLoginButton();
        Thread.sleep(1000);
        login.setUsername("maor1614");
        login.setPassword("Mm123456!");
        Thread.sleep(2000);
        login.clickLoginButton();




    }
}