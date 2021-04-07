package login_swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyStandardUserCanLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\George Njau\\Downloads\\Compressed\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

		
		
		
	}

	
}
