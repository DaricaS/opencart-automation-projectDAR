package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartTests extends BaseTest {

    @Test(groups = "smoke")
    public void testAddToCart() {

        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("MacBook");

        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickProductByIndex(0);

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        Assert.assertTrue(productPage.isSuccessMessageDisplayed());
    }

    @Test(groups = "regression")
    public void testRemoveFromCart() {

        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("MacBook");

        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickProductByIndex(0);

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        driver.get("https://demo.opencart.com/index.php?route=checkout/cart");

        CartPage cartPage = new CartPage(driver);
        cartPage.removeItemByIndex(0);

        Assert.assertTrue(cartPage.getCartItemsCount() == 0);
    }
}

