package week4.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//Simple Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		System.out.println("1] "+text1);
		alert1.accept();
		
		//Confirm Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert2= driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println("2] "+text2);
		alert2.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert3= driver.switchTo().alert();
		alert3.sendKeys("Raghu");
		String text3 = alert3.getText();
		System.out.println("3] "+text3);
		alert3.accept();
		
		//Sweet Alert(simple)
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		WebElement mess1 = driver.findElement(By.xpath("(//div[contains(@class,'ui-dialog-content')]/p)[1]"));
		String text4 = mess1.getText();
		System.out.println("4] "+text4);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Dismiss'])")).click();
		
		//Sweet Model Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		WebElement mess2 = driver.findElement(By.xpath("(//p[@class='m-0'])[1]"));
		String text5 = mess2.getText();
		System.out.println("5] "+text5);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		//Sweet Alert (Confirmation)
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		WebElement mess3 = driver.findElement(By.className("ui-confirm-dialog-message"));
		String text6 = mess3.getText();
		System.out.println("6] "+text6);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		//Sweet Alert (Maximize And Minimize)
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		WebElement mess4 = driver.findElement(By.xpath("(//p[@class='m-0'])[2]"));
		String text7 = mess4.getText();
		System.out.println("7] "+text7);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
	}
}
