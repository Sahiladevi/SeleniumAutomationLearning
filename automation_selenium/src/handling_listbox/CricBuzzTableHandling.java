package handling_listbox;

/*
 * WATS to display the batter name along with their runs in cricbuzz webapp 
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzzTableHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");

		// Clicking on winning result container box

		Thread.sleep(5000);		
		
		driver.findElement(By.xpath("(//div[text()='T20']/../../descendant::div[contains(@title,' won by')])[1]")).click();	
		//driver.findElement(By.xpath("(//div[@class='cb-mtch-crd-state cb-ovr-flo cb-font-12 cb-text-complete'])[1]")).click();

		// Clicking on Score Board
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		// Getting the list of batter's name
		List<WebElement> batterNames = driver
				.findElements(By.xpath("//div[@id='innings_1']/descendant::div[@class='cb-col cb-col-25 ']"));
		int index = 1;
		for (WebElement webElement : batterNames) {
			String batter = webElement.getText();
			Thread.sleep(3000);

			String run = driver.findElement(By.xpath("//div[@id='innings_1']//a[contains(text(),'" + batter
					+ "')]/../../descendant::div[@class='cb-col cb-col-8 text-right text-bold']")).getText();

			System.out.println(index++ + ". " + batter + ": " + run + " runs");

		}
	}

}

//driver.findElement(By.xpath("(//div[@class='cb-mtch-crd-state cb-ovr-flo cb-font-12 cb-text-complete'])[2]"))
//a[contains(@title,'Eliminator')]/div[@class='cb-pos-abs cb-text-white text-bold cb-font-10 cb-mtch-frmt-bg-t20'].click();
//driver.findElement(By.xpath("(//li[@class='cb-view-all-ga cb-live-stream-match-card cb-bg-white cb-pos-rel'])[4]")).click();
//driver.findElement(By.xpath("//div[text()='Rajasthan Royals won by 4 wkts']")).click();
//driver.findElement(By.xpath("(//div[@class='cb-pos-abs cb-text-white text-bold cb-font-10 cb-mtch-frmt-bg-t20'])[2]")).click();