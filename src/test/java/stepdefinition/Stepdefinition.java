package stepdefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	WebDriver driver;
	
	@Given("Launch the Url")
	public void launch_the_Url() {
        driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	   

	@When("Enter the Username in the Jayaram{int}")
	public void enter_the_Username_in_the_Jayaram(Integer int1) {
		 driver.findElement(By.id("username")).sendKeys("Jayaram29");

	   }

	@When("Enter the Password in the Rajaj{int}@")
	public void enter_the_Password_in_the_Rajaj(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("Rajaj2995@");
	   }

	@When("click the login button in Navigate to Next Web Page on Serarch Hotel")
	public void click_the_login_button_in_Navigate_to_Next_Web_Page_on_Serarch_Hotel() {
		driver.findElement(By.id("login")).click();
	   
	}

	@Then("Login Should be success and navigate to next page")
	public void login_Should_be_success_and_navigate_to_next_page() {
	   }



}
