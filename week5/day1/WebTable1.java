package week5.day1Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;




public class WebTable1 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.chittorgarh.com/");
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[text()='NSE SME Share Prices']")).click();
		
		/*WebElement scroll = driver.findElement(By.xpath("//table[contains(@class,'table-hover w-auto')]//tr[5]/td[1]"));
		
		Actions builder=new Actions(driver);
		builder.scrollToElement(scroll).perform();*/
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'table-hover w-auto')]//tr"));
		System.out.println("Row Count : "+rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,'table-hover w-auto')]//tr[1]/td"));
		System.out.println("Column Count : "+columns.size());
		List<String> lst=new ArrayList<String>();
		List<WebElement> shares = driver.findElements(By.xpath("//table[contains(@class,'table-hover w-auto')]//tr/td[6]"));
		//System.out.println("shares Count : "+shares.size());
		for (int i = 0; i < rows.size()-1; i++) {	
		String text1 = shares.get(i).getText();
		lst.add(text1);
		}
		
		//Set<WebElement> dupls=new LinkedHashSet<WebElement>(shares);
		//System.out.println("dupls Count : "+dupls.size());
		
		Collections.sort(lst);
		System.out.println("List Count : "+lst.size());
		Set<String> dup=new LinkedHashSet<String>(lst);
		System.out.println("Set Count : "+dup.size());
		
		if (lst==dup) {
			System.out.println("No Duplicates");
		}
		else {
			System.out.println("Duplicates Present ");
		}
	}
}
/* 1. Launch the URL https://www.chittorgarh.com/
2. Click on stock market
3. Click on NSE bulk Deals
4. Get all the Security names
5. Ensure whether there are duplicate Security names */