package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoLogin;
import utility.BrowserUitl;

public class Steps {
	RemoteWebDriver driver;
@Given("user opens the browser")
public void user_opens_the_browser() {
    driver=BrowserUitl.getDriver();
}

@When("user navigates to Demo_Blaze application")
public void user_navigates_to_facebook_application() {
   driver.get("https://www.demoblaze.com/");
}

@Then("verify home page is displayed")
public void verify_home_page_is_displayed() {
   DemoLogin loginHomePage=new DemoLogin(driver);
   loginHomePage.isHomePageDisplayed();
}

@Then("Verify if landing page is {string}")
public void verify_if_landing_page_is(String string) {
	DemoLogin loginHomePage=new DemoLogin(driver);
	   boolean text=loginHomePage.isHomePageDisplayed();
   Assert.assertEquals(text, true);
}

@When ("I click on {string}")
public void I_click_on_button(String strElement) {
	DemoLogin SignUpBtn=new DemoLogin(driver);
	SignUpBtn.clickOnSignUpButton();
	
}

@Then ("I should see the {string} present on the page")
public void I_should_see_the_element_present_on_the_page(String strElement) {
	DemoLogin SignUpPopUpBtn=new DemoLogin(driver);
	boolean flag=SignUpPopUpBtn.isSignUpPopupDisplayed();
	Assert.assertEquals(flag, true);
}

@When("login with user {string} and password {string}")
public void login_with_user_and_password(String userName, String password) {
   DemoLogin Signup=new DemoLogin(driver);
   Signup.login(userName, password);
   
}

@Then ("I click on {string} button")
public void I_click_on_signup_button(String strElement) {
	DemoLogin SignUp_btn=new DemoLogin(driver);
	SignUp_btn.clickOnBtn();
}

@Then("close the browser")
public void close_the_browser() {
    driver.close();
}


	
}
