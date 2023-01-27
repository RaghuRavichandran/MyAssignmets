package week4.day2Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContactUsingWindow {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String>listWindow1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(listWindow1.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(listWindow1.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>listWindow2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listWindow2.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		driver.switchTo().window(listWindow2.get(0));
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Merge'])")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String title = driver.getTitle();
		if (title.contains("View Contact")) {
			System.out.println("Title is Verified And Successfully Merged the Contacts");
		}
		else {
			System.out.println("Wrong Title And Failed to Merged the Contacts");
		}
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/windowMergeContacts.png");
		FileUtils.copyFile(source, dest);	
	}
}
/*  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 	
		 * 6. Click on Merge Contacts using Xpath Locator
		 * 
		 * 7. Click on Widget of From Contact
		 * 
		 * 8. Click on First Resulting Contact
		 * 
		 * 9. Click on Widget of To Contact
		 * 
		 * 10. Click on Second Resulting Contact
		 * 
		 * 11. Click on Merge button using Xpath Locator
		 * 
		 * 12. Accept the Alert
		 * 
		 * 13. Verify the title of the page */