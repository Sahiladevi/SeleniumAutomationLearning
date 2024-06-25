package assignments;
/*
 * WATS to display default text as an output and also
 * verify text field contains default text or not in flipkart app
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultValueOutput {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		//Identifying the search text field		
		WebElement searchTextField = driver.findElement(By.name("q"));
		String searchDefaultValue = searchTextField.getAttribute("placeholder");
		System.out.println("---------Displaying the default value of search Text field--------------------------");
		//Displaying the default value of search Text field
		System.out.println("Default value of search text field: "+searchDefaultValue);
		
		System.out.println("----------verify Is search text field contains default value are or not----------------");

		//verify Is search text field contains default value are or not

		if (searchDefaultValue.contains("Search for Products, Brands and More")) {
			
			System.out.println("Default value is present in the search text field");

		} else {
			System.out.println("Default value is not present in the search text field");
		}
		
		driver.close();
	}
}
