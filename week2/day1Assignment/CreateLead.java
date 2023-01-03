package week2.day1Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		String title = driver.getTitle();
		System.out.println("Starting Page : "+ title);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raghu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop= new Select(tool);
		drop.selectByVisibleText("Employee");
		
		WebElement tool1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop1= new Select(tool1);
		drop1.selectByValue("9001");
		
		WebElement tool2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop2= new Select(tool2);
		drop2.selectByIndex(5);
		
		WebElement tool3 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop3= new Select(tool3);
		drop3.selectByVisibleText("India");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1 = driver.getTitle();
		System.out.println("Resulting Page : "+ title1);
		
	}

}
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
	   
	   //2. Enter UserName and Password Using Id Locator
	   
	   //3. Click on Login Button using Class Locator
	   
	  // 4. Click on CRM/SFA Link
	   
	  // 5. Click on Leads Button
	   
	  // 6. Click on create Lead Button
	   
	   //7. Enter CompanyName using id Locator
	   
	   //8. Enter FirstName using id Locator
	   
	   //9. Enter LastName using id Locator
	   
	  // 10. Select value as Employee in Source Using SelectbyVisible text
	   
	   //11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
	   
	   
	  // 13. Select value as Corporation in OwnerShip field Using SelectbyIndex
	   
	   //14. Select value as India in Country Field Using SelectbyVisibletext
	    
	  // 15. Click on create Lead Button Using name Locator
	   
	   //16. Get the Title of the resulting Page