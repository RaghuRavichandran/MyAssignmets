package week5.day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableAndDragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
		
		//Draggable
		WebElement move = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		System.out.println("Before Drag Location : "+move.getLocation());
		
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(move, 150, 0).perform();
		
		System.out.println("After Drag Location : "+move.getLocation());
		
		//DragAndDrop
		WebElement source = driver.findElement(By.id("form:drag_content"));
		
		String text = driver.findElement(By.xpath("//div[@id='form:drop_content']/p")).getText();
		System.out.println("Before Drop : "+text);
		
		WebElement target = driver.findElement(By.id("form:drop_content"));
		
		Actions drop=new Actions(driver);
		drop.dragAndDrop(source, target).perform();
		
		String text1 = driver.findElement(By.xpath("//div[@id='form:drop_content']/p")).getText();
		System.out.println("After Drop : "+text1);
	}

}
