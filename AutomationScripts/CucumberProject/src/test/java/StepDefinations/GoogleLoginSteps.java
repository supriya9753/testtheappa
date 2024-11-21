package StepDefinations;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleLoginSteps {
    WebDriver driver = null;

    @Given("Browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - Browser is open");
        // Set the path to ChromeDriver if not in PATH, otherwise remove this line
        // System.setProperty("webdriver.chrome.driver", "chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is in google search page")
    public void user_is_in_google_search_page()
    {
        driver.get("https://www.google.com");
        System.out.println("Inside Step- User is on google search page");
    }

    @When("user enter a text in search box")
    public void user_enter_a_text_in_search_box() throws InterruptedException
    {
    	System.out.println("Inside Step- User is enter the text in search box");
    	driver.findElement(By.name("q")).sendKeys("Automation step by step");
    	Thread.sleep(2000);
    } 
    

    @And("hits enter")
    public void hits_enter() 
    {
    	System.out.println("Inside Step- Hits enter");
    	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
   }

    @Then("user is navigate to search results")
    public void user_is_navigate_to_search_results()
    {
    	System.out.println("Inside Step- User is navigated to search result page");
        driver.getPageSource().contains("Online Courses");
    }   

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();  // Close the browser and end the WebDriver session
        }
    }
}

