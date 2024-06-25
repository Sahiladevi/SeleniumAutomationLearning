package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Diff_Betw_LinkText_And_PartialLinkText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\diff_bet_linkText_partialLinkText.html");

		WebElement spanElement = driver.findElement(By.id("msg"));
		String spanText1 = spanElement.getText();
		System.out.println(spanText1);

		String anchorText1 = driver.findElement(By.name("link")).getText();
		System.out.println(anchorText1);

		String anchorText2 = driver.findElement(By.linkText("Link2")).getText();
		System.out.println(anchorText2);

		String spanText2 = driver.findElement(By.linkText("Text Msg2")).getText();
		System.out.println(spanText2);

		Thread.sleep(2000);
		driver.close();

	}

}

/*
 * Text Msg1 Link1 Link2 Exception in thread "main"
 * org.openqa.selenium.NoSuchElementException: no such element: Unable to locate
 * element: {"method":"link text","selector":"Text Msg2"} (Session info:
 * chrome=124.0.6367.63) For documentation on this error, please visit:
 * https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-
 * such-element-exception Build info: version: '4.13.0', revision: 'ba948ece5b*'
 * 
 */
