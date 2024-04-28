package Web;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.ForumPage;
import pages.HomePage;
import pages.LoginPage;

public class CreatePostTest extends BaseTest {
    @Epic("Login Test")
    @Description("Test Description: Login Site and Create New Post.")
    @Parameters({"browser", "URL"})  // Retrieve parameters from XML
    @Test
    public void createPost(String browser, String URL) throws InterruptedException {
        Logger logger = LogManager.getLogger(LoginPage.class);
        System.out.println("Browser: " + browser);
        System.out.println("URL: " + URL);

        // Use the URL parameter to navigate
        driver.get(URL);
        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver, logger);
        ForumPage fourm = new ForumPage(driver);

        home.clickLoginButton();
        login.setUsername("maor1614");
        login.setPassword("Mm123456!");
        login.clickLoginButton();
        fourm.creatPostButton();
        fourm.title("בדיקה")
                .content("מאור בדיקה")
                .savePostBtn();


    }

}
