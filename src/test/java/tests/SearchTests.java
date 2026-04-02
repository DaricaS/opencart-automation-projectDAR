package tests;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

    @Test
    public void searchTest() throws InterruptedException {

        WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
        search.click();
        search.sendKeys("iphone");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(@class,'btn-default')]")).click();

        Thread.sleep(4000);
    }
}
