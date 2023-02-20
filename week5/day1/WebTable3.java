package week5.day1Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable3 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");

		WebElement scroll = driver.findElement(By.xpath("//h2[text()='Tables for Data, Not Layout']"));
		driver.executeScript("arguments[0].click();",scroll );
		Actions builder=new Actions(driver);
		builder.scrollToElement(scroll).perform();
		
		String text = driver.findElement(By.xpath("//table/caption")).getText();
		System.out.println("Table Name : "+text);
		
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='render']//table//tr"));
		System.out.println("Row Count : "+values.size());
		for (int i = 0; i < values.size(); i++) {
			String text2 = values.get(i).getText();
			System.out.println("Row "+i+" Values : "+text2);
		}
		
	}

}
/* 1. Launch the URL https://html.com/tags/table/
2. You have to print the respective values based on given Library
(hint: if the library was absolute usage, then print all its value)  */