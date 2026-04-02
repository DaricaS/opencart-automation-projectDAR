package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By agree = By.name("agree");
    By continueBtn = By.xpath("//input[@value='Continue']");

    public void register(String fn, String ln, String mail, String tel, String pass) {

        driver.findElement(firstName).sendKeys(fn);
        driver.findElement(lastName).sendKeys(ln);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(telephone).sendKeys(tel);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(pass);
        driver.findElement(agree).click();
        driver.findElement(continueBtn).click();
    }
}
