package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPagePomClass{
	//Globally declared data member with access specifier private
	private WebElement email;
	private WebElement password;
	private WebElement login;
	private WebElement forgotPassword;
	private WebElement createNewAccount;

	//Initialization within the constructor
	public FacebookLoginPagePomClass(WebDriver driver) {
		email = driver.findElement(By.id("email"));
		password = driver.findElement(By.id("pass"));
		login = driver.findElement(By.name("login"));
		forgotPassword = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		createNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
	}	
	//Utilization of data members using methods
	public void enterEmail(String emailValue)
	{
		email.sendKeys(emailValue);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		login.click();
	}
	public void clickOnForgotPassword()
	{
		forgotPassword.click();
	}
	public void clickOnCreateNewAccount()
	{
		createNewAccount.click();
	}

}
