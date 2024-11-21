package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps 
{
WebDriver driver=null;

	@Given("browser is open")
	public void browser_is_open() 
	{
	 System.out.println("Inside Step- Browser is open");
	 driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	}

	@And("user is an login page")
	public void user_is_an_login_page() 
	{
	  driver.navigate().to("https://example.testproject.io/web/");  
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException 
	{
	    driver.findElement(By.id("name")).sendKeys("supriya");
	    driver.findElement(By.id("password")).sendKeys("1234566");
	    Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException 
	{
	driver.findElement(By.id("login")).click();
	Thread.sleep(2000);
	}
	
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException 
	{
	driver.findElement(By.id("logout")).isDisplayed();
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	}



}
