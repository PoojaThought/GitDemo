package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarLoanLoginTest 
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method----------------");
	}
	
	
	@Test(dataProvider="getData")
	public void WebLogin(String userName, String passWord)
	{
		System.out.println("CarLoan - WebLogin ===== username - "+userName+ "  password - "+passWord);
	}

	@Test(groups= {"smoke"})
	public void MobileLogin()
	{
		System.out.println("CarLoan - MobileLogin");
	}

	@Test
	public void APILogin()
	{
		System.out.println("CarLoan - APILogin");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//Loan application behavior with good credit/no credit/fraud history users
		Object[][] data = new Object[3][2];
		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[1][0] = "user2";
		data[1][1] = "pass2";
		data[2][0] = "user3";
		data[2][1] = "pass3";
		
		return data;
		
	}
	
}
