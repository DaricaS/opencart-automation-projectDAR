package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By addToCartButton = By.id("button-cart");
    By successMessage = By.cssSelector(".alert-success");

    // Methods
    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}

