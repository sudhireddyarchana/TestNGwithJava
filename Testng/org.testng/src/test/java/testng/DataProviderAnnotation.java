package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	@DataProvider(name="test")
	public Object[][] method()
	{
		Object[][] x= new Object[][]{{20,30},{10,50},{1,5}};
		return x;
	}
	@Test(priority=1,dataProvider="test")
	public void method1(int x, int y)
	{
		int k=x+y;
		System.out.println(k);
	}

		
	}


