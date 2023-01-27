package week4.day2Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		String title = driver.getTitle();
		System.out.println("Primary Tab Title : "+title);
		
		//OpenTab
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		//System.out.println(windowHandles1);
		List<String> listWindow1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(listWindow1.get(1));
		String title1 = driver.getTitle();
		System.out.println("Open Tab Title : "+title1);
		driver.close();
		driver.switchTo().window(listWindow1.get(0));
		
		//Open Multiple Tab
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		//System.out.println(windowHandles2);
		List<String> listWindow2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listWindow2.get(2));
		System.out.println("Multiple Tab Title : "+driver.getTitle());
		System.out.println("Multiple Tab Size : "+windowHandles2.size());
		driver.close();
		driver.switchTo().window(listWindow2.get(1));
		driver.close();
		driver.switchTo().window(listWindow2.get(0));
		
		//Close Windows 
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		//System.out.println(windowHandles3);
		List<String> listWindow3=new ArrayList<String>(windowHandles3);
		driver.switchTo().window(listWindow3.get(2));
		System.out.println("Close Windows Title : "+driver.getTitle());
		System.out.println("Close Windows Size : "+windowHandles3.size());
		driver.close();
		driver.switchTo().window(listWindow3.get(3));
		//System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow3.get(1));
		//System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow3.get(0));
		System.out.println("Primary Tab Title : "+driver.getTitle());
		
		//Wait for new tabs to open
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		//System.out.println(windowHandles4);
		List<String> listWindow4=new ArrayList<String>(windowHandles4);
		driver.switchTo().window(listWindow4.get(1));
		System.out.println("new Tabs Size : "+windowHandles4.size());
		System.out.println("Title of new tab : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow4.get(2));
		System.out.println("Title of new tab : "+driver.getTitle());
		
		
		driver.quit();
	}
}
