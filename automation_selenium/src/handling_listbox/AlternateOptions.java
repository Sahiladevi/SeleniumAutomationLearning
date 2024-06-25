package handling_listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlternateOptions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2000);

	//Inspecting for day List box using selectByValue method
	WebElement day = driver.findElement(By.id("day"));
	Select daySelect = new Select(day);
	List<WebElement> list = daySelect.getOptions();
	int size =list.size();
	for (int i = 0; i < size; i=i+2) {
		
		daySelect.selectByIndex(i);
		WebElement ele1 = list.get(i);
		String str =  ele1.getAttribute("value");
		System.out.println(str);
	}
}
}
