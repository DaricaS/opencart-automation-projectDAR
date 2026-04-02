package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchTests extends BaseTest {

    @Test
    public void searchTest() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("search"))
        );

        search.sendKeys("iphone");

        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
    }
}

