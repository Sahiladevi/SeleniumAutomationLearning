package page_factory;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleAllLinkTextPageFactoryClass {
	@FindBy(xpath="//a")
	private List<WebElement> links;

	public GoogleAllLinkTextPageFactoryClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int linkCount()
	{
		return links.size();
	}
	public List<WebElement> getAllLinks()
	{
		return links;
	}
	
	public void allLinksText()
	{
		int linkTextCount = 0;
		int index =1;
		for (WebElement ele : links) {
			String linkText = ele.getText();
			if(!linkText.isBlank())
			{
				linkTextCount++;
				System.out.println(index++ +" : "+linkText);
			}			
		}
		System.out.println("Total number of Links with text: "+linkTextCount );
	}
}
