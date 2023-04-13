package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.LoginPage;

public class Login {
	LoginPage s = new LoginPage();

@Given("login to site url")
public void login_to_site_url() {
 s.launch_url();
}

@When("enter user name")
public void enter_user_name() {
   s.enter_user_name();  
}

@When("enter password")
public void enter_password() {
 s.enter_password();
}

@When("click login button")
public void click_login_button() {
	s.click_login_button();
}
 
	 
	}


