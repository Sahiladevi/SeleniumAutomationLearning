package assignments;
/*
 * April 23 2024 - Day05
 * AssignmentQues: WATS to check whether orange hrm SignIn page displayed or not 
 * 
 */
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSignInPage {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://support.orangehrm.com/portal/en/signin");
		
		Thread.sleep(2000);
		
		String titleName = driver.getTitle();
		if(titleName.contains("Sign"))
		{
			System.out.println("Page is displayed");
		}
		else
		{
			System.out.println("Page is not displayed");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
