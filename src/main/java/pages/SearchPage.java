package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstProduct = By.xpath("(//div[@class='product-thumb'])[1]");
    By addToCart = By.xpath("//button[@onclick[contains(.,'cart')]]");

    public void selectProduct() {
        driver.findElement(firstProduct).click();
    }

    public void addToCart() {
        driver.findElement(addToCart).click();
    }
}
