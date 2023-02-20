package week5.day2Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions mouseover=new Actions(driver);
		mouseover.moveToElement(brands).perform();
		
		driver.findElement(By.xpath("(//img[@alt='banner'])[5]")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String text1 = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
		if (text1.contains("Shampoo")) {
			System.out.println("Filter have Shampoo");
		}else {
			System.out.println("Filter doesn't have Shampoo" );
		}
		
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>listWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(1));
		
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String price = driver.findElement(By.xpath("(//div[@class='css-f5j3vf']//span)[2]")).getText();
		System.out.println("MRP of the product : "+price);
		driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.switchTo().frame(0);
		
		String totalamount = driver.findElement(By.xpath("(//span[text()='Grand Total']/preceding::span)[14]")).getText();
		System.out.println("Grand Total Amount : "+totalamount);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("(//img[@alt='Image'])[7]")).click();
		
		String totalPrice = driver.findElement(By.xpath("(//p[@color='rgba(0,19,37,0.64)'])[3]")).getText();
		System.out.println("Total Price : "+totalPrice);
		if (totalamount.equals(totalPrice)) {
			System.out.println("Same Price");
		}else {
			System.out.println("Different Price");
		}
		driver.quit();
	}

}
/* 1) Go to https://www.nykaa.com/
2) Mouseover on Brands and Search L'Oreal Paris
3) Click L'Oreal Paris
4) Check the title contains L'Oreal Paris(Hint-GetTitle)
5) Click sort By and select customer top rated
6) Click Category and click Hair->Click haircare->Shampoo
7) Click->Concern->Color Protection
8)check whether the Filter is applied with Shampoo
9) Click on L'Oreal Paris Colour Protect Shampoo
10) GO to the new window and select size as 175ml
11) Print the MRP of the product
12) Click on ADD to BAG
13) Go to Shopping Bag 
14) Print the Grand Total amount
15) Click Proceed
16) Click on Continue as Guest
17) Check if this grand total is the same in step 14
18) Close all windows  */