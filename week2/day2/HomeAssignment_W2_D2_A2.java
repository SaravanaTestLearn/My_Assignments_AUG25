package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeAssignment_W2_D2_A2 {				//Home Assignment <2>: Delete Lead 

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("guest");
		 
		 ChromeDriver driver=new ChromeDriver(options); 
		 driver.get("http://leaftaps.com/opentaps/"); 		
		 driver.manage().window().maximize();

		 // Enter the username. 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");		 
		 // Enter the password. 
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 
		 // Click the Login button. 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		// Click the "crm/sfa" link. 
		 driver.findElement(By.partialLinkText("CRM")).click();
		 
		// Click the "Leads" link. 
		 driver.findElement(By.linkText("Leads")).click();	
		 
		// Click "Find leads." 
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		// Click on the "Phone" tab. 
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 
		// Enter the phone number. 
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		 
		// Click the "Find leads" button. 
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		 Thread.sleep(1000);
		 
		// Capture the lead ID of the first resulting lead. 
		 String LeadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
		 System.out.println(LeadID);
		 
		// Click the first resulting lead. 
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		 
		// Click the "Delete" button. 
		 driver.findElement(By.xpath("//a[text()='Delete']")).click();
		 Thread.sleep(1000);
		 
		// Click "Find leads" again. 
		 driver.findElement(By.linkText("Find Leads")).click();
		 Thread.sleep(1000);
		 
		// click the Name and ID tab. 
		 driver.findElement(By.xpath("//span[text()='Name and ID']")).click();	
		 
		// Enter the captured lead ID.
		 driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
		 
		// Click the "Find leads" button. 
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		// Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion. 
		 		 
		System.out.println("No records to display");
		// Close the browser. 	 
		 driver.close();	
		
	}

}
