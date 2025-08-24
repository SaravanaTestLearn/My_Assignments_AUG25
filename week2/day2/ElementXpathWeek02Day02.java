package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ElementXpathWeek02Day02 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver1 = new ChromeDriver(options);
		driver1.get("http://leaftaps.com/opentaps/");
		driver1.manage().window().maximize();
				
		//	Attribute based: tagname[@Attribte='attributevalue'] - Enter the username as ‘demosalesmanager’ 
		driver1.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");		
		
		//- Enter the password as 'crmsfa' 
		driver1.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");		
		
		// - Click on the Login button.  
		driver1.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//- Click on the CRM/SFA link 
		driver1.findElement(By.xpath("//*[@id='label']/a")).click();
		
		//TExtbased xpath //tagname[text()='textvalue from the dom']- Click on the Leads tab. 
		driver1.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//partial attribute: //tagname[contains(@attribute,'attributevalue')] - Click on the Create Lead link from shortcuts. 
		driver1.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		//- Enter the mandatory fields on the web page. 
		driver1.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver1.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("SARAVANA");
		driver1.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("CHANDIRA");
		
		//- Select Employee in the source dropdown (using index)
		WebElement sourceDropDown = driver1.findElement(By.xpath("//select[@id=\"createLeadForm_dataSourceId\"]"));
		Select select1 = new Select(sourceDropDown);
		select1.selectByIndex(4);
		
		//- Select Automobile in the Marketing Campaign (using visibleText) 
		WebElement MarketDD = driver1.findElement(By.xpath("//select[@name=\"marketingCampaignId\"]"));
		Select select2 = new Select(MarketDD);
		select2.selectByVisibleText("Automobile");
		
		//- Select Corporation in Ownership (using value) 
		WebElement OwnerDD = driver1.findElement(By.xpath("//select[@name=\"ownershipEnumId\"]"));
		Select select3 = new Select(OwnerDD);
		select3.selectByValue("OWN_CCORP");
		
		//- Click on the Create Lead button. 
		driver1.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//- Verify the title of the current web page. 
		String title = driver1.getTitle();
		System.out.println(title);
		
		//- Close the browser window.
		driver1.close();


	}

}
