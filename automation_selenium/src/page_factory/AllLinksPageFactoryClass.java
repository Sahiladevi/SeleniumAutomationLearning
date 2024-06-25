package page_factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllLinksPageFactoryClass {
	@FindBy(xpath="//a")
	private List<WebElement> links;

	public AllLinksPageFactoryClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int linkCount()
	{
		return links.size();
	}	
	
	public void allLinksText()
	{
			for (WebElement ele : links) {
			String linkText = ele.getText();
			if(!linkText.isBlank())
			{				
				System.out.println(linkText);
			}			
		}		
	}

}
