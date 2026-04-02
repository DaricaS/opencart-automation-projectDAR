package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void validLoginTest() {

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);

        home.clickMyAccount();
        home.clickLogin();

        login.login("test@test.com", "123456");
    }
}

