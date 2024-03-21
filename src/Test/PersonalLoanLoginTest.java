package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoanLoginTest 
{
	@Parameters({"URL"})
	@Test
	public void WebLogin(String urlLink)
	{
		System.out.println("Personal Loan - Web login === "+urlLink);
	}
	
	@Test(groups= {"smoke"})
	public void MobileLogin()
	{
		System.out.println("Personal Loan - Mobile login");
	}
	
	@Test(dependsOnMethods= {"MobileLogin"})
	public void MobileLogout()
	{
		System.out.println("Personal Loan - Mobile loggout");
	}	
	
	@Test
	public void APILogin()
	{
		System.out.println("Personal Loan - API login");
	}
	
	
}
