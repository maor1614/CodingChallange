package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class LoginPage {
    private WebDriver driver;
    private Logger log;

    // Locators
    private By usernameLocator = By.xpath("//input[@id='id_username']");
    private By passwordLocator = By.id("id_password");
    private By loginButtonLocator = By.xpath("//button[contains(text(),'Login!')]");
    private By errorMessageLocator = By.id("error");

    // Constructor
    public LoginPage(WebDriver driver, Logger log) {
        this.driver = driver;
        this.log = log;  // Initialize the logger passed from outside
    }

    // Page Actions
    public void setUsername(String username) {
        log.info("Setting username: " + username);
        WebElement usernameField = driver.findElement(usernameLocator);
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void setPassword(String password) {
        log.info("Setting password.");
        WebElement passwordField = driver.findElement(passwordLocator);
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        log.info("Clicking the login button.");
        driver.findElement(loginButtonLocator).click();
    }

    public String getErrorMessage() {
        String errorMessage = driver.findElement(errorMessageLocator).getText();
        log.info("Received error message: " + errorMessage);
        return errorMessage;
    }

    public void login(String username, String password) {
        log.info("Logging in with username: " + username);
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }
}
