package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegistrationTests extends BaseTest {

    @Test(groups = "smoke")
    public void testSuccessfulRegistration() {

        HomePage homePage = new HomePage(driver);
        homePage.navigateToRegister();

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.registerUser(
                "Test",
                "User",
                "test123@test.com",
                "123456789",
                "Password123"
        );

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }

    @Test(groups = "regression")
    public void testRegistrationWithExistingEmail() {

        HomePage homePage = new HomePage(driver);
        homePage.navigateToRegister();

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.registerUser(
                "Test",
                "User",
                "test@test.com",
                "123456789",
                "Password123"
        );

        Assert.assertTrue(driver.getPageSource().contains("already"));
    }
}
