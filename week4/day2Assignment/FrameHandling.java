package week4.day2Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String text1 = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		
		//Inside Nested frame
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		String text2 = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		System.out.println(text2);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//How many frames in this page?
		List<String>lst=new ArrayList<String>();
		List<WebElement> names = driver.findElements(By.tagName("iframe"));
		for (int i = 0; i < names.size(); i++) {
			String tags = names.get(i).getTagName();
			lst.add(tags);
		}
		System.out.println("TagNames are : "+lst);
		System.out.println("How many frames in this page? : "+lst.size());
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/frame.png");
		FileUtils.copyFile(source, dest);
	}
}
