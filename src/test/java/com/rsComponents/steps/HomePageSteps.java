package com.rsComponents.steps;

import com.rsComponents.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomePageSteps {
    HomePage homePage;

    @Step
    public void openHomePage() {
        homePage.openHomePage();
        Assert.assertTrue("Homepage is not displayed ", homePage.isHomePageDisplayed());
    }

    @Step
    public void searchForProduct(String stockNum) {
        homePage.enterSearchText(stockNum);
        homePage.clickSearchButton();
        Assert.assertTrue("Product is not found",  homePage.isProductFound());
    }
}
