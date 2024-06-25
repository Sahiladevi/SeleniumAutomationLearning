package basics;
/*April19 2024 - Day03
 * WATS to open facebook app using get(String Url)
 */
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebookApp {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();		
	}
}
