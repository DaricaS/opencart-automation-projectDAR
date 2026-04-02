package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test(groups = "smoke")
    public void testValidLogin() {

        HomePage homePage = new HomePage(driver);
        homePage.navigateToLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@test.com", "Password123");

        Assert.assertTrue(driver.getCurrentUrl().contains("account"));
    }

    @Test(groups = "regression")
    public void testInvalidEmail() {

        HomePage homePage = new HomePage(driver);
        homePage.navigateToLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid@test.com", "Password123");

        Assert.assertTrue(driver.getPageSource().contains("Warning"));
    }

    @Test(groups = "regression")
    public void testInvalidPassword() {

        HomePage homePage = new HomePage(driver);
        homePage.navigateToLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@test.com", "wrongpassword");

        Assert.assertTrue(driver.getPageSource().contains("Warning"));
    }
}
