package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By searchResults = By.cssSelector(".product-thumb");
    By noResultsMessage = By.xpath("//p[contains(text(),'no product')]");

    // Methods
    public int getSearchResultsCount() {
        List<WebElement> results = driver.findElements(searchResults);
        return results.size();
    }

    public boolean isNoResultsMessageDisplayed() {
        return driver.findElement(noResultsMessage).isDisplayed();
    }

    public void clickProductByIndex(int index) {
        List<WebElement> results = driver.findElements(searchResults);
        results.get(index).click();
    }
}

