package week5.day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		String text = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println("Before Drop : "+text);
		
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//DragAndDrop
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		
		String text1 = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println("After Drop : "+text1);
		
		
	}
}
