package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.experimental.theories.Theory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

import javax.annotation.Generated;
import static stepDefinition.CucumberHooks.driver;

public class Facebook {
    // WebDriver is an Interface, ChromeDriver is as class implementing interface

    @Given("^Facebook URL$")
    public void facebook_URL() {

    }

    @When("^I access facebook Url$")
    public void i_access_facebook_Url() {
        // Write code here that turns the phrase above into concrete actions
driver.get("https://www.facebook.com");

    }

    @Then("^I land on facebook page$")
    public void i_land_on_facebook_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(driver.getTitle());
        Assert.assertEquals("Facebook – log in or sign up",driver.getTitle());
        driver.quit();
    }

    @Then("^I see email text box$")
    public void i_see_email(){
        driver.findElement(By.xpath("//input[@type='email']")).isDisplayed();
        Assert.assertEquals(true,driver.findElement(By.xpath("//input[@type='email']")).isDisplayed());
    }
    @Then("^I see 'password' text box$")
    public void i_see_password_text_box(){
       driver.findElement(By.xpath("//input[@type='password']")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed());
    }

    @Then("^I see 'login' button$")
    public void i_see_login_button(){
        driver.findElement(By.xpath("//input[@value='Log In']")).isEnabled();
        Assert.assertEquals(true,driver.findElement(By.xpath("//input[@value='Log In']")).isEnabled());

    }

    @Then("^I see link 'forgotten account\\?'$")
    public void i_see_link_forgotten_account(){
         //driver.findElement(By.linkText('forgotten account');
        driver.findElement(By.xpath("//a[.='Forgotten account?']")).isDisplayed();
        Assert.assertEquals(true, driver.findElement(By.xpath("//a[.='Forgotten account?']")).isDisplayed());
    }

    @Then("^I see text box to enter'first name'$")
    public void i_see_text_box_to_enter_first_name(){
        driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
        Assert.assertEquals(true,driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed());
    }

    @Then("^I see text box to enter'last name'$")
    public void i_see_text_box_to_enter_last_name(){
        driver.findElement(By.xpath("//input[@name='lastname']")).isDisplayed();
        Assert.assertEquals(true,driver.findElement(By.xpath("//input[@name='lastname']")).isDisplayed());
    }

    @Then("^I see text box to enter'new password'$")
    public void i_see_text_box_to_enter_new_password(){
        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).isDisplayed();
        Assert.assertEquals(true,driver.findElement(By.xpath("//input[@autocomplete='new-password']")).isDisplayed());
    }

    @Then("^I see drop down to choose DOB'$")
    public void i_see_drop_down_to_choose_DOB(){
        driver.findElement(By.id("day")).isDisplayed();
        driver.findElement(By.id("month")).isDisplayed();
        driver.findElement(By.id("year")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.id("day")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("month")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("year")).isDisplayed());
    }

    @Then("^I see 'Sign up' button$")
    public void i_see_Sign_up_button(){
        driver.findElement(By.name("websubmit")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.name("websubmit")).isDisplayed());
    }





}
