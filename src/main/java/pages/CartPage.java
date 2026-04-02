package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By cartItems = By.cssSelector(".table-responsive tbody tr");
    By removeButtons = By.cssSelector("button[data-original-title='Remove']");

    // Methods
    public int getCartItemsCount() {
        List<WebElement> items = driver.findElements(cartItems);
        return items.size();
    }

    public void removeItemByIndex(int index) {
        List<WebElement> buttons = driver.findElements(removeButtons);
        buttons.get(index).click();
    }
}
