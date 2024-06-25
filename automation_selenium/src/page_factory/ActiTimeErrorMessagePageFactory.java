package page_factory;
/*
 * WATS to display error message as an output
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeErrorMessagePageFactory {	
	//Both declaration and initialization
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[@class='errormsg']")
	private WebElement errorMsg;

	public ActiTimeErrorMessagePageFactory(WebDriver driver) {
		//Initialize the private element as public
		PageFactory.initElements(driver, this);		
	}
	public void login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		checkbox.click();
		loginButton.click();
	}
	
	public void errorMsg()
	{
		if (errorMsg.isDisplayed()) {
			String error = errorMsg.getText();
			System.out.println("Error display on the screen: "+error);
		} else {
			System.out.println("Error message is not displayed");
		}		
	}
	
}
