package packagetest;

import org.testng.annotations.Test;


import packagebase.Basedemo;
import packagepage.Demopage;
import packageutility.Demoexcel;

public class Demotest extends Basedemo {
	@Test
	public void verifiyLoginWithValidCred() throws Exception
	{
	 
	Demopage obj=new Demopage(driver);
	obj.log();
	String x1="C:\\Users\\hp\\Downloads\\login.xlsx";
	String Sheet="Sheet1";
	int rowCount=Demoexcel.getRowCount(x1, Sheet);
	for(int i=1;i<=rowCount;i++)
	{
	String userName=Demoexcel.getCellValue(x1, Sheet, i, 
	0);
	System.out.println("username: "+userName);
	String passWord=Demoexcel.getCellValue(x1, Sheet, i, 
	1);
	System.out.println("Password : "+passWord);
	obj.demoblazelogin(userName, passWord);
	obj.login();
	String actualUrl=driver.getCurrentUrl();
	String expUrl="https://www.demoblaze.com/index.html";
	if(actualUrl.equals(expUrl))
	{
	System.out.println("Successful");
	}
	else
	{
	System.out.println("Unsuccessful");
	}
	}
	
	obj.scrolldown();
	obj.section();
	obj.scrolldown();
	obj.additemcart1();
	obj.scrolldown();
	obj.addcart();
	obj.backhome();
	obj.cart();
	obj.placeorder();
	obj.order("abc", "india", "bengaluru", "1234567890", "09", "2027");
	obj.purchase();
	obj.confirmation();
	obj.logout();
	
	
	
	}
}

