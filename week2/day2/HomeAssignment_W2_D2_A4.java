package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeAssignment_W2_D2_A4 {			//Home Assignment <1>: Demonstrating Select class in Selenium 

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver1 = new ChromeDriver(options);
		driver1.get("https://en-gb.facebook.com/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Click on the Create new account button. Create new account
		driver1.findElement(By.linkText("Create new account")).click();
		
		// Enter the First name. 	
		driver1.findElement(By.name("firstname")).sendKeys("Tom");
		
		// Enter the Surname. 		
		driver1.findElement(By.name("lastname")).sendKeys("Jerry");		
		
		// Handle all three dropdowns in Date of birth  
		driver1.findElement(By.xpath("//select[@id='day']")).sendKeys("02");
		driver1.findElement(By.xpath("//select[@id='month']")).sendKeys("Aug");
		driver1.findElement(By.xpath("//select[@id='year']")).sendKeys("2020");
		
		// Select the radio button in Gender. 
		driver1.findElement(By.xpath("//input[@value='2']")).click();
		
		// Enter the Mobile number or email address. 
		driver1.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
		
		// Enter the New password.
		driver1.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password@123");
		
		// Get the Title of the Resulting Page.
			String title = driver1.getTitle();
		 	System.out.println(title);
		
	}

}
