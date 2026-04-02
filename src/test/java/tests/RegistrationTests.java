package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegistrationTests extends BaseTest {

    @Test
    public void registerTest() {

        HomePage home = new HomePage(driver);
        RegisterPage register = new RegisterPage(driver);

        home.clickMyAccount();
        home.clickRegister();

        register.register(
                "Test",
                "User",
                "test" + System.currentTimeMillis() + "@mail.com",
                "123456789",
                "123456"
        );
    }
}
