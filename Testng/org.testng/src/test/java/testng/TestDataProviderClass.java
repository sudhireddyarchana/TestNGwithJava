package testng;

import org.testng.annotations.Test;

public class TestDataProviderClass {
	@Test(priority=1,dataProvider="data",dataProviderClass=DataProviderAnnotation1.class)
	public void testmethod3(String a,int b,String c)
	{
		String s=a+"-"+b+"-"+c;
		System.out.println(s);
	}

}
