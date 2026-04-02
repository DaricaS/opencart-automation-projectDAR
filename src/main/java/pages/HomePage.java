package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By myAccount = By.xpath("//a[@title='My Account']");
    By login = By.linkText("Login");
    By register = By.linkText("Register");
    By searchBox = By.name("search");
    By searchButton = By.cssSelector("button.btn.btn-default.btn-lg");

    public void clickMyAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(myAccount)).click();
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    public void clickRegister() {
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
    }

    public void searchProduct(String product) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)).sendKeys(product);
        driver.findElement(searchButton).click();
    }
}
