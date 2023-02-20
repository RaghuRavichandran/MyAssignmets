package week5.day2Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
		
		driver.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
		String items = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		String itemcount = items.replaceAll("\\D", "");
		System.out.println(itemcount);
		String catgrs1 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		String items1 = catgrs1.replaceAll("\\D", "");
		String catgrs2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		String items2 = catgrs2.replaceAll("\\D", "");
		String categories=items1+items2;
		System.out.println(categories);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
		driver.findElement(By.xpath("//input[@value='Duke']/following-sibling::div")).click();
		driver.findElement(By.xpath("//span[contains(@class,'close sprites-remove')]")).click();
		Thread.sleep(5000);
		List<WebElement> brands = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		for (int i = 0; i < brands.size(); i++) {
			String brand = brands.get(i).getText();
			if (brand.contains("Duke")) {
				System.out.println("All the Coats are Duke Brand");
			}
		}
		driver.findElement(By.xpath("//div[@class='sort-sortBy']")).click();
		
		driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
		String price = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println("price of first displayed item : "+price);
		driver.findElement(By.xpath("(//img[@draggable='false'])[4]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wind=new ArrayList<String>(windowHandles);
		driver.switchTo().window(wind.get(1));
		Thread.sleep(2000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/myntraDuke.png");
		FileUtils.copyFile(source, dest);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,' pdp-add-to-wishlist')]/span[2]")).click();
		driver.quit();
	}

}
/*  1) Open https://www.myntra.com/
2) Mouse hover on MeN 
3) Click Jackets 
4) Find the total count of item 
5) Validate the sum of categories count matches
6) Check jackets
7) Click + More option under BRAND
8) Type Duke and click checkbox
9) Close the pop-up x
10) Confirm all the Coats are of brand Duke
    Hint : use List 
11) Sort by Better Discount
12) Find the price of first displayed item
Click on the first product
13) Take a screen shot
14) Click on WishList Now
15) Close Browser */