package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    private By loginButton = By.linkText("Login");
    private By usernameLocator = By.xpath("//input[@id='id_username']");


    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();

    }
    public void setUsername(String username) {
//        log.info("Setting username: " + username);
        WebElement usernameField = driver.findElement(usernameLocator);
        usernameField.clear();
        usernameField.sendKeys(username);
    }

}
