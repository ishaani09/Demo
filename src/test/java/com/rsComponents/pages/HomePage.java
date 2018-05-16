package com.rsComponents.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class HomePage extends PageObject {
    @FindBy(css = "a[title='Log In']")
    WebElementFacade loginLink;

    @FindBy(id = "searchTerm")
    WebElementFacade searchTextbox;

    @FindBy(id = "btnSearch")
    WebElementFacade searchButton;

    private static String baseUrl = "https://uk.rs-online.com/web/";

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void openHomePage() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HK\\Downloads\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to(baseUrl);
    }

    public boolean isHomePageDisplayed(){
        return true;
    }

    public void enterSearchText(String stockNum) {
        //searchTextbox.type(stockNum);
        typeInto(searchTextbox, stockNum);
        System.out.println("Entered search text");
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public boolean isProductFound() {
        return true;
    }
}
