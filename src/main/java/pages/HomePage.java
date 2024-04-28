package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    private By loginButton = By.linkText("Login");


    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();

    }


}