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

    public void loginSite(String browser, String URL){
        // Set up the Logger
        Logger logger = LogManager.getLogger(LoginPage.class);

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver, logger);
        System.out.println("Browser: " + browser);
        System.out.println("URL: " + URL);

        // Use the URL parameter to navigate
        driver.get(URL);

        home.clickLoginButton();
        login.setUsername("maor1614");
        login.setPassword("Mm123456!");
        login.clickLoginButton();


    }
}