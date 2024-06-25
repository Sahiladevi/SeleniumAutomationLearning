package handling_listbox;
/*
 * WATS to display options text as an output in alphabetical
 * order in Facebook month field 
 */
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentMonthInAlphabeticalOrder {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		//Inspecting for month List box using selectByValue method
		WebElement month = driver.findElement(By.id("month"));
		Select monthSelect = new Select(month);

		List<WebElement> options = monthSelect.getOptions();
		int optionsSize = options.size();

		System.out.println("----------Orginal output from the month listbox------------------");
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}

		//To arrange in Alphabetical order
		String arr[] = new String[optionsSize];

		for (int i = 0; i < optionsSize; i++) {
			arr[i] = options.get(i).getText();				
		}
		//Sorting the array using Arrays utility Class
		Arrays.sort(arr);
		System.out.println("--------Sorting in Alphabetical order----------------------");
		for (String string : arr) {
			System.out.println(string);
		}
		Thread.sleep(2000);
		driver.close();
	}
}
