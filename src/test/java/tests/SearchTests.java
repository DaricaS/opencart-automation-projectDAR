package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

    @Test
    public void searchTest() throws InterruptedException {

        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone");

        Thread.sleep(5000);
    }
}


