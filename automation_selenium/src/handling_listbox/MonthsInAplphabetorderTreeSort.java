package handling_listbox;

import java.util.Iterator;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Approach 3
public class MonthsInAplphabetorderTreeSort {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		//Inspecting for month List box using selectByValue method
		WebElement month = driver.findElement(By.id("month"));
		Select monthSelect = new Select(month);		
		//Getting the original list
		System.out.println("----------------------Original List-------------------------");
		
		for (WebElement element : monthSelect.getOptions()) {
			System.out.println(element.getText());
		}
		
		System.out.println("---------------------Sorted Set in Alphabetical order------------------------");
		
		TreeSet<String> sortedSet = new TreeSet<String>();
		
		for (WebElement mon : monthSelect.getOptions()) {
			sortedSet.add(mon.getText());
		}
		
	Iterator<String> it = sortedSet.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());		
	}
	
	System.out.println("------------Sorted set in reverse Alphabetical order-----------------------");
	
	Iterator<String> it1 = sortedSet.descendingIterator();
	while (it1.hasNext()) {
		System.out.println(it1.next());		
	}				
	}
}
