package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import pages.ProductPage;
import pages.CartPage;

public class CartTests extends BaseTest {

    @Test
    public void addToCartTest() {

        HomePage home = new HomePage(driver);
        SearchPage search = new SearchPage(driver);
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);

        home.searchProduct("iphone");
        search.selectProduct();
        product.addToCart();
        cart.openCart();
    }
}


