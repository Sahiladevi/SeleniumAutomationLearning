package testng_selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTestClass {
	@Test
	public void test1()
	{
		//System.out.println("Learning testNG");--> display the output in the console only
		//Reporter.log("Learning testNG")--> It will display the output in emailable-report only
		Reporter.log("Learning testNG",true);//It will display the output in both console and emailable-report
	}
}
