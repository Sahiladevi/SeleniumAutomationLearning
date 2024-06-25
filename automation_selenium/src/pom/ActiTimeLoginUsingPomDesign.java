package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeLoginUsingPomDesign {
	//Globally declared data member with access specifier private
	private WebElement username;
	private WebElement password;
	private WebElement checkbox;
	private WebElement loginButton;
	
	//Initialization within the constructor
	public ActiTimeLoginUsingPomDesign(WebDriver driver) {
		username = driver.findElement(By.name("username"));
		password = driver.findElement(By.name("pwd"));
		checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		loginButton = driver.findElement(By.id("loginButton"));
	}
	
	//Utilization using method
	public void enterUsername(String name)
	{
		username.sendKeys(name);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void selectCheckbox()
	{
		checkbox.click();
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}	

}
