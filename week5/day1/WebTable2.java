package week5.day1Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable2 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		
		WebElement scroll = driver.findElement(By.xpath("//table[@class='attributes-list']//tr[2]/td[1]"));
		driver.executeScript("arguments[0].click();",scroll );
		Actions builder=new Actions(driver);
		builder.scrollToElement(scroll).perform();
		
		String text = driver.findElement(By.xpath("//div[@class='related-pages']/h2")).getText();
		System.out.println("Table Name : "+text);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		System.out.println("Row count : "+rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		System.out.println("Column count : "+columns.size());
	}
}
/* 1. Launch the URL https://html.com/tags/table/
2. Get the count of number of rows
3. Get the count of number of columns */
