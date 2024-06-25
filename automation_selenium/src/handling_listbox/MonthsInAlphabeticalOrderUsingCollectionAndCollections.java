
package handling_listbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthsInAlphabeticalOrderUsingCollectionAndCollections {
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
		ArrayList<String> originalList = new ArrayList<String>();
		for (WebElement element: monthSelect.getOptions()) {
			originalList.add(element.getText());			
		}		

		System.out.println("------Original list from facebook month list-----------");				
		Iterator<String> it = originalList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Performing sorting using Collections utility class to perform actions on Collection Interface methods
		ArrayList<String> copyList = originalList;
		Collections.sort(copyList);		
		System.out.println("------sorted list from facebook month list-----------");
		Iterator<String> it1 = copyList.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}	
		Thread.sleep(2000);
		driver.close();
	}

}
