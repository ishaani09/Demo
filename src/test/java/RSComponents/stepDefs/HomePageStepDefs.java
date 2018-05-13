package RSComponents.stepDefs;

public class HomePageStepDefs {
    @Steps
    HomePageSteps homePageSteps;

    @Given("^I am on the homepage$")
    public void IamOnHomepage() throws Exception {
        String homepageURL = homePageSteps.getHomePageUrl();
        homePageSteps.openHomePage(homepageURL);
    }

}
