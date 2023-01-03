package week2.day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Limited Account Debited");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Raghu");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Palavanthangal");
		driver.findElement(By.xpath("//input[@class='inputBox'][@id='annualRevenue']")).sendKeys("1,00,000");
		
		WebElement tool = driver.findElement(By.name("industryEnumId"));
		Select drop= new Select(tool);
		drop.selectByVisibleText("Computer Software");
		
		WebElement tool1 = driver.findElement(By.name("ownershipEnumId"));
		Select drop1= new Select(tool1);
		drop1.selectByVisibleText("S-Corporation");
		
		WebElement tool2 = driver.findElement(By.id("dataSourceId"));
		Select drop2= new Select(tool2);
		drop2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement tool3 = driver.findElement(By.id("marketingCampaignId"));
		Select drop3= new Select(tool3);
		drop3.selectByIndex(6);
		
		WebElement tool4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop4= new Select(tool4);
		drop4.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

	}

}
//1. Launch URL "http://leaftaps.com/opentaps/control/login"

//2. Enter UserName and Password Using Id Locator

//3. Click on Login Button using Class Locator

//4. Click on CRM/SFA Link

//5. Click on Accounts Button

//6. Click on Create Account
 
//7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account

//8. Enter DEscriptiion as "Selenium Automation Tester"

//9. Enter LocalName Field Using Xpath Locator

//10. Enter SiteName Field Using Xpath Locator

//11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute

//12. Select Industry as ComputerSoftware

//13. Select OwnerShip as S-Corporation using SelectByVisibletext

//14. Select Source as Employee using SelectByValue

//15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex

//16. Select State/Province as Texas using SelectByValue 

//17. Click on Create Account using Xpath Locator