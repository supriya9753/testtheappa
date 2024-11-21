package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSteps {
	
	WebDriver driver=null;
	
	@Given("Chrome browser is open")
	public void chrome_browser_is_open() {
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	}

	@And("user is an facebook login page")
	public void user_is_an_facebook_login_page() 
	{
	  driver.navigate().to("https://www.facebook.com/"); 
	}

	@Then("user enters the username and password")
	public void user_enters_the_username_and_password() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("8978654323");
		driver.findElement(By.id("pass")).sendKeys("Welcome@123456");
		Thread.sleep(2000);
	}

	
	@When("user click on login button")
	public void user_click_on_login_button() 
	{
	  driver.findElement(By.id("Login")).click(); 
	}

	@Then("user is navigated to facebook authenticaton page")
	public void user_is_navigated_to_facebook_authenticaton_page() 
	{
	   
	}


	
	
	
	

}
