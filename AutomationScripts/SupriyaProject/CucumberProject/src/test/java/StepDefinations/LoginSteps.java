package StepDefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver= null;
	/*System.out.println(projectPath);*/
	@Given("Browser is open")
	public void browser_is_open() {
	
	System.out.println("Inside Step- Browser is open");	
	String projectPath = null;
	
	System.setProperty("webdriver.chrome.driver","//Users/anuragsinha/Desktop/SupriyaProject/src/DemoProject/drivers/chromedriver-mac-arm64/");
	
	driver= new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	}

	@And("user is in google search page")
	public void user_is_in_google_search_page() {
	    
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
	    
	}

	@And("hits enter")
	public void hits_enter() {
	    
	}

	@Then("user is navigate to search results")
	public void user_is_navigate_to_search_results() {
	    
	}



}
