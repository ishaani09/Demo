package com.rsComponents.stepDefs;

import com.rsComponents.steps.HomePageSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomePageDefs {
    @Steps
    HomePageSteps homePageSteps;

    @Given("^I am on the homepage$")
    public void IamOnHomepage() throws Exception {
        homePageSteps.openHomePage();
    }
}
