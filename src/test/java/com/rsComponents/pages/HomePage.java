package com.rsComponents.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class HomePage {
    @FindBy(css = "a[title='Log In']")
    WebElementFacade loginLink;

    private static String baseUrl = "https://uk.rs-online.com/web/";

    public void openHomePage() {

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to(baseUrl);
    }

    public boolean isHomePageDisplayed(){
        return isHomePageDisplayed();
    }
}
