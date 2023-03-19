package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider 
{
	@DataProvider(name="data")
	public Object[][] method1()
	{ 
		Object[][] x=new Object[][]
				{
			      {12,13},
			      {14,15},
			      {15,-15}
			    };
		return(x);
	}
		@Test(dataProvider="data",priority=1,description="Testing 1st program in TestNg")
		public void method2(int x, int y)
		{
			int z=x+y;
			System.out.println("Value of z is: "+z);
		}
	}

