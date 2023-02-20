package week5.day2Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s22",Keys.ENTER);
		String price = driver.findElement(By.xpath("(//span[@class='a-offscreen'])[1]")).getText();
		System.out.println("Price of the first product : "+price);
		String rating = driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]")).getText();
		System.out.println("Number of customer ratings for the first product : "+rating);
		WebElement stars = driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-star-small')])[1]"));
		stars.click();
		Actions mouseover=new Actions(driver);
		mouseover.moveToElement(stars).perform();
		
		Thread.sleep(3000);
		String percentage = driver.findElement(By.xpath("//a[contains(text(),'64')]")).getText();
		System.out.println(percentage+" of ratings for the 5 star");
		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')][1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> mobwindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(mobwindow.get(1));
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/amazonmobile.png");
		FileUtils.copyFile(source, dest);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		String subtotal = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		if (subtotal.equals(price)) {
			System.out.println("Same Price");
		}else {
			System.out.println("Different Price");
		}
		driver.quit();
	}

}
/*  1.Load the uRL https://www.amazon.in/
2.search as oneplus 9 pro 
3.Get the price of the first product
4. Print the number of customer ratings for the first displayed product
5. Mouse Hover on the stars
6. Get the percentage of ratings for the 5 star.
7. Click the first text link of the first image
8. Take a screen shot of the product displayed
9. Click 'Add to Cart' button
10. Get the cart subtotal and verify if it is correct. */