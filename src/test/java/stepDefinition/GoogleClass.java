package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static stepDefinition.CucumberHooks.driver;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleClass {

    @Given("^A chrome browser$")
    public void a_chrome_browser() {

    }

    @When("^I access Google URL$")
    public void i_access_Google_URL() {
        driver.get("https://www.google.com");

    }

    @Then("^I see google page$")
    public void i_see_google_page() {
        System.out.println(driver.getTitle());
        Assert.assertEquals(true, driver.getTitle().contains("Google"));


    }

}
