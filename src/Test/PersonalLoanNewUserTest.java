package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoanNewUserTest 
{
	@Parameters({"URL"})
	@Test
	public void WebCreateNewUser(String urlLink)
	{
		System.out.println("PersonalLoan - Web New user created === "+urlLink);
	}

	@Test(groups= {"smoke"})
	public void MobileCreateNewUser()
	{
		System.out.println("PersonalLoan - Mobile New user created");
	}
	
	@Test
	public void MobileDeleteUser()
	{
		System.out.println("PersonalLoan - Mobile delete created");
	}
	
	@BeforeTest
	public void clearDataBeforeModuleExecution()
	{
		System.out.println("Before Test");
	}
	
}
