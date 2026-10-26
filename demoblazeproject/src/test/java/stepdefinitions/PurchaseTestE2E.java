package stepdefinitions;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import base.Basetest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.*;

public class PurchaseTestE2E extends Basetest {
	SignUp sign;
	Login log;
//	AddToCard ac;

@Given("launched demoblaze website")
public void launched_demoblaze_website() {
    setup();
}

@When("user enter username")
public void user_enter_username() {
	sign=new SignUp (driver);
	sign.signaction();
	sign.signupusernameaction();
}
    

@When("user enter password")
public void user_enter_password() {
	sign.signuppasswordaction ();
	sign.clicksignupbutton();
	
}


@Then("signup should be successful")
public void signup_should_be_successful() {
	Alert al = driver.switchTo().alert();
	String signUpSuccess = al.getText();
	Assert.assertEquals(signUpSuccess, "Sign up successful.");

}


@When("user enters username")
public void user_enters_username() {
  
}

@When("user enters password")
public void user_enters_password() {
    
}

@Then("login should be successful")
public void login_should_be_successful() {
  
}

@When("user clicks on phones")
public void user_clicks_on_phones() {
   
}

@When("click on add to cart")
public void click_on_add_to_cart() {
  
}

@Then("product should be added in cart")
public void product_should_be_added_in_cart() {

}

@When("user clicks on log out")
public void user_clicks_on_log_out() {

}

@Then("user should log out")
public void user_should_log_out() {

}


  
    }
