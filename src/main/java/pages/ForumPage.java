package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage {
    private WebDriver driver;

    private By createPost = By.cssSelector("#navbarToggle > div:nth-child(2) > a:nth-child(1)");

    private By titleLocator = By.cssSelector("#id_title");

    private By contentInput = By.cssSelector("#id_content");

    private By postButton = By.xpath("//button[contains(text(),'Post!')]");


    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public void creatPostButton() {
        driver.findElement(createPost).click();
    }

    public ForumPage title(String text) {
        WebElement titleField = driver.findElement(titleLocator);
        titleField.clear();
        titleField.sendKeys(text);
        return this;
    }

    public ForumPage content(String text) {
        WebElement contentInputField = driver.findElement(contentInput);
        contentInputField.clear();
        contentInputField.sendKeys(text);
        return this;
    }

    public void savePostBtn() {
        driver.findElement(postButton).click();
    }

}
