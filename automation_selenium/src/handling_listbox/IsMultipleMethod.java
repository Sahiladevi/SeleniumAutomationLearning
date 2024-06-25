package handling_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

		//Inspecting for day List box using selectByValue method
		WebElement day = driver.findElement(By.id("day"));
		Select daySelect = new Select(day);
		
		boolean b = daySelect.isMultiple();
		
		System.out.println(b);
		if (b) {
			System.out.println("Listbox is multiselectable");
			
		} else {
			System.out.println("Listbox is not multiselectable");
		}

	}

}
