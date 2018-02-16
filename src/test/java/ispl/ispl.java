package ispl;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class ispl
{
	private String name;

	@Given("^I have open the browser$") 
	public void openBrowser() 
	{ 
		name = "Ishaan Shringi";
	} 

	@When("^I open Facebook website$") 
	public void goToFacebook() 
	{ 
		System.out.println("goToFacebook function executed!");
	} 

	@Then("^Login button should exits$") 
	public void loginButton() 
	{
		System.out.println("loginButton function executed!");
	} 
}