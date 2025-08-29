package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment_W2_D2_A1 {		// Home Assignment <1>: Create Account 

	public static void main(String[] args) {
		
		 ChromeOptions options=new ChromeOptions();		
		 options.addArguments("guest");
		
		 ChromeDriver driver = new ChromeDriver(options);	// Initialize the WebDriver (ChromeDriver).
		 driver.get("http://leaftaps.com/opentaps/");		//Load the URL http://leaftaps.com/opentaps/. 
		 driver.manage().window().maximize();				//Maximize the browser window. 
				
		 // Enter a username and password ‘demosalesmanager’ and 'crmsfa' 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		 // Click on the Login button.  
		 driver.findElement(By.className("decorativeSubmit")).click();
		
		 // Click on the CRM/SFA link 
		 driver.findElement(By.partialLinkText("CRM")).click();
		
		 // Click on the "Accounts" tab.
		 driver.findElement(By.linkText("Accounts")).click();
	 
		 // Click on the "Create Account" button.
		 driver.findElement(By.linkText("Create Account")).click();
		 
		 // Enter an account name.
		 driver.findElement(By.id("accountName")).sendKeys("Testleaf_A01");
		 
		 // Enter a description as "Selenium Automation Tester."
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 
		 // Select "ComputerSoftware" as the industry.
		 driver.findElement(By.name("industryEnumId")).sendKeys("Computer Software");
		 
		 // Select "S-Corporation" as ownership using SelectByVisibleText.
		 WebElement OwnerDD = driver.findElement(By.name("ownershipEnumId"));
		  	Select select1 = new Select(OwnerDD);
		  	select1.selectByVisibleText("S-Corporation");
		
		 // Select "Employee" as the source using SelectByValue. 
		 WebElement SourceDD = driver.findElement(By.id("dataSourceId"));
		  	Select select2 = new Select(SourceDD);
		  	select2.selectByValue("LEAD_EMPLOYEE");	
		 
		 // Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
		 WebElement MarketDD = driver.findElement(By.id("marketingCampaignId"));
		 	Select select3 = new Select(MarketDD);
			select3.selectByIndex(6);
		 
		 // Select "Texas" as the state/province using SelectByValue. 
		 WebElement StateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		 	Select select4 = new Select(StateDD);
		 	select4.selectByValue("TX");			 
		 
		 // Click the "Create Account" button.
		 driver.findElement(By.className("smallSubmit")).click();
				 		 
		 // Print theTitle name. 
		 String title = driver.getTitle();
		 	System.out.println(title);
				
		 // Close the browser window.
		 driver.close();

	}

}
