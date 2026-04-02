package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCart = By.id("button-cart");

    public void addToCart() {
        driver.findElement(addToCart).click();
    }
}
