package week2.day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raghu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium WebDriver");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learn Selenium Java");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("raghu1812mech.be@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1 = driver.getTitle();
		System.out.println("Resulting Page Before Duplicate : "+ title1);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NewTestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raghu Ravichandran");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title2 = driver.getTitle();
		System.out.println("Resulting Page After Duplicate : "+ title2);
	}

}
//1. Launch URL "http://leaftaps.com/opentaps/control/login"
//2. Enter UserName and Password Using Id Locator
//3. Click on Login Button using Class Locator
//4. Click on CRM/SFA Link
//5. Click on Leads Button
//6. Click on Create Lead 
//7. Enter CompanyName Field Using id Locator
//8. Enter FirstName Field Using id Locator
//9. Enter LastName Field Using id Locator
//10. Enter FirstName(Local) Field Using id Locator
//11. Enter Department Field Using any Locator of Your Choice
//12. Enter Description Field Using any Locator of your choice 
//13. Enter your email in the E-mail address Field using the locator of your choice
//14. Click on Create Button
//15. Get the Title of Resulting Page using driver.getTitle()
//16. Click on Duplicate button
//17. Clear the CompanyName Field using .clear() And Enter new CompanyName
//18.Clear the FirstName Field using .clear() And Enter new FirstName
//19.Click on Create Lead Button
//20. Get the Title of Resulting Page using driver.getTitle()