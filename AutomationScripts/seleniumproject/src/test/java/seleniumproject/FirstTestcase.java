package seleniumproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestcase {

public static void main(String[] args) {
		
ChromeDriver driver= new ChromeDriver();
driver.get("https://demo.opencart.com/");
driver.manage().window().maximize();
	
}

}
