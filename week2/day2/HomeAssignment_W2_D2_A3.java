package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment_W2_D2_A3 {		//Home Assignment <1>: Edit Lead 

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver1 = new ChromeDriver(options);
		driver1.get("http://leaftaps.com/opentaps/");
		driver1.manage().window().maximize();
		
		// Enter the Username as "DemoSalesManager" and the Password as "crmsfa". 
		driver1.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");	
		driver1.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");	
		
		// Click on the Login Button. 
		driver1.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		// Click on the CRM/SFA Link. 
		driver1.findElement(By.partialLinkText("CRM")).click();		
		
		// Click on the Leads Button. 
		driver1.findElement(By.xpath("//a[text()='Leads']")).click();
		
		// Click on Create Lead. 
		driver1.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		// Enter the CompanyName Field Using Xpath. 
		driver1.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		// Enter the FirstName Field Using Xpath. 
		driver1.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("SARAVANA");
		// Enter the LastName Field Using Xpath. 
		driver1.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("VEL");
		// Enter the FirstName (Local) Field Using Xpath. 
		driver1.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("VEL");
		// Enter the Department Field Using any Locator of Your Choice. 
		driver1.findElement(By.id("createLeadForm_departmentName")).sendKeys("TESTING DEPT");
		// Enter the Description Field Using any Locator of your choice. 
		driver1.findElement(By.id("createLeadForm_description")).sendKeys("Welcome");
		// Enter your email in the E-mail address Field using the locator of your choice. 
		driver1.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		
		// Select State/Province as NewYork Using Visible Text. 
		 WebElement StateDD = driver1.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 	Select select1 = new Select(StateDD);
		 	select1.selectByVisibleText("New York");	
		 	
		// Click on the Create Button. 
		 	driver1.findElement(By.xpath("//input[@value='Create Lead']")).click();
		 	Thread.sleep(1000);
		 	
		// Click on the edit button. 
		 	driver1.findElement(By.xpath("//a[text()='Edit']")).click();   
			 Thread.sleep(1000);
			 
		// Clear the Description Field. 
			 driver1.findElement(By.xpath("//textarea[@class='inputBox']")).clear();
			 Thread.sleep(1000);
			 
		// Fill the Important Note Field with Any text. 
			driver1.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Welcome to Testing Department");
			Thread.sleep(1000);
			
			// Click on the update button. 
			driver1.findElement(By.xpath("//input[@value='Update']")).click(); 
			Thread.sleep(1000);
			
		// Get the Title of the Resulting Page.
			String title = driver1.getTitle();
		 	System.out.println(title);
		 	
		// Close the browser window. 
		 	driver1.close();
		
	}

}
