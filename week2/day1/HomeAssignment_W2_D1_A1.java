package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeAssignment_W2_D1_A1 {		//Home Assignment <1>: Create Account

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		 ChromeDriver driver=new ChromeDriver(options); 
		 driver.get("http://leaftaps.com/opentaps/"); 
		 driver.manage().window().maximize();		 
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");		//	Enter a username and password.
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");		 		 
		 
		 driver.findElement(By.className("decorativeSubmit")).click();				// Click the "Login" button.
		 driver.findElement(By.partialLinkText("CRM")).click();						//	Click on the "CRM/SFA" link.
		 		 
		 driver.findElement(By.linkText("Accounts")).click();						// Click on the "Accounts" tab.
		 driver.findElement(By.linkText("Create Account")).click();					//	Click on the "Create Account" button.
		 		 
		 driver.findElement(By.id("accountName")).sendKeys("Testleaf1");			//	Enter an account name.		 
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");		//	Enter a description as "Selenium Automation Tester."
		 driver.findElement(By.id("numberEmployees")).sendKeys("22");				// Enter a Number Of Employees.
		 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");			//	Enter a Site Name as “LeafTaps”  officeSiteName
		 driver.findElement(By.className("smallSubmit")).click();					//	Click the "Create Account" button.
		 		 		 
		 String title = driver.getTitle();											//	Print theTitle name.
		 System.out.println(title);		 		 	 
		 driver.close();															//	Close the browser window.	
	}

}
