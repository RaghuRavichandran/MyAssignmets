package week5.day1Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/table.xhtml");
		
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
		System.out.println("Row count : "+rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr[1]/td"));
		System.out.println("Column count : "+columns.size());
		
		for (int i = 1; i < rows.size(); i++) {
			String text = driver.findElement(By.xpath("//table[@role='grid']//tr["+i+"]/td[2]")).getText();
			System.out.println(text);
		}
	}

}
/* https://leafground.com/table.xhtml  */