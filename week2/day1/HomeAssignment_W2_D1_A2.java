package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeAssignment_W2_D1_A2 {

	public static void main(String[] args) {

		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("guest");
		
		 ChromeDriver driver=new ChromeDriver(options); 								//Initialize the WebDriver (ChromeDriver).
		 driver.get("http://leaftaps.com/opentaps/"); 									//Load the URL http://leaftaps.com/opentaps/.
		 driver.manage().window().maximize();											//Maximize the browser window.
		 		 			
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");			//- Enter a username and password.
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();					//- Click the "Login" button.
		 driver.findElement(By.partialLinkText("CRM")).click();							//- Click on the "CRM/SFA" link.
		 driver.findElement(By.linkText("Leads")).click();								//- Click on the "Leads" tab.
		 driver.findElement(By.linkText("Create Lead")).click();						//- Click on the "Create Lead" button.
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SARAVANA");	//- Enter a FirstName.					
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("CHANDIRA");		//- Enter a LastName.
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");	//- Enter a CompanyName.
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeaf");		//- Enter a Title .
		 driver.findElement(By.name("submitButton")).click();							//- Click the "Create Lead" button.
		 
		 String title = driver.getTitle();												//- Print theTitle name.
		 System.out.println(title);
		 
		 driver.close();																//- Close the browser window.

	}

}
