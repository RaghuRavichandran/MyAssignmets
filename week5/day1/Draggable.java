package week5.day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		System.out.println("Before Drag Location : "+drag.getLocation());
		
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 150, 150).perform();
		
		System.out.println("After Drag Location : "+drag.getLocation());
	}
}
