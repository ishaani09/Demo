package RSComponents.stepDefs;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomePageStepDefs {
    @Steps
    HomePageSteps homePageSteps;

    @Given("^I am on the homepage$")
    public void IamOnHomepage() throws Exception {
        String homepageURL = homePageSteps.getHomePageUrl();
        homePageSteps.openHomePage(homepageURL);
    }

}
