package com.rsComponents.stepDefs;

import com.rsComponents.steps.HomePageSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomePageDefs {
    @Steps
    HomePageSteps homePageSteps;

    @Given("^I am on the homepage$")
    public void IamOnHomepage() throws Exception {
        homePageSteps.openHomePage();
    }

    @Given("^I search for the RS Stock No \"([^\"]*)\"$")
    public void iSearchForTheRSStockNo(String stockNum) throws Throwable {
        homePageSteps.searchForProduct(stockNum);
    }
}