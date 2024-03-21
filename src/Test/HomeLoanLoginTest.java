package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoanLoginTest 
{
	@Parameters({"homeLoanURL"})
	@Test
	public void WebLogin(String homeLoanLink)
	{
		System.out.println("HomeLoan - WebLogin ==== "+homeLoanLink);
	}

	@Test(groups= {"smoke"})
	public void MobileLogin()
	{
		System.out.println("HomeLoan - MobileLogin");
	}

	@Test(enabled=false)
	public void APILogin()
	{
		System.out.println("HomeLoan - APILogin");
	}

}
