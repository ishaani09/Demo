package com.rsComponents.steps;

import com.rsComponents.pages.HomePage;
import org.junit.Assert;

public class HomePageSteps {
    HomePage homePage;

    public void openHomePage() {
        homePage.openHomePage();
        Assert.assertTrue("Homepage is not displayed ", homePage.isHomePageDisplayed());
    }
}
