package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By searchBox = By.name("search");
    By searchButton = By.cssSelector("button.btn-default");
    By myAccountLink = By.linkText("My Account");
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Login");

    // Methods
    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public void clickMyAccount() {
        driver.findElement(myAccountLink).click();
    }

    public void navigateToRegister() {
        driver.findElement(myAccountLink).click();
        driver.findElement(registerLink).click();
    }

    public void navigateToLogin() {
        driver.findElement(myAccountLink).click();
        driver.findElement(loginLink).click();
    }
}
