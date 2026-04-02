package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchTests extends BaseTest {

    @Test(groups = "smoke")
    public void testSearchValidProduct() {

        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("MacBook");

        SearchPage searchPage = new SearchPage(driver);

        Assert.assertTrue(searchPage.getSearchResultsCount() > 0);
    }

    @Test(groups = "regression")
    public void testSearchInvalidProduct() {

        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("XYZ12345");

        SearchPage searchPage = new SearchPage(driver);

        Assert.assertTrue(searchPage.isNoResultsMessageDisplayed());
    }

    @Test(groups = "regression")
    public void testSearchEmptyQuery() {

        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("");

        Assert.assertTrue(driver.getCurrentUrl().contains("search"));
    }
}

