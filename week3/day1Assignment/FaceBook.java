package week3.day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
		
        ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raghu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("rajuraghu1812@gmail.com");
		driver.findElement(By.xpath("//div[text()='Re-enter email address']/following-sibling::input")).sendKeys("rajuraghu1812@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Raghu@1812");
		
		driver.findElement(By.xpath("//option[text()='18']")).click();
		driver.findElement(By.xpath("//option[text()='Dec']")).click();
		driver.findElement(By.xpath("//option[text()='1997']")).click();
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();	
	}
}
//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
        // ( A normal click will do for this step) 