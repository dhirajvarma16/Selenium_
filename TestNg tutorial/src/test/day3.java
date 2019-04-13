package test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class day3 {
    @Parameters({"URL"})
	@Test
	public void WebloginCarloan(String urlname)
	{
		System.out.println("WebloginCarloan");
		System.out.println(urlname);
	}
	@Test
	public void MobileLogincarloan()
	{
		System.out.println("MobileLogincarloan");
	}
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHomeLoan");
	}
	
	
}
