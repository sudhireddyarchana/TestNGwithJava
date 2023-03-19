package testng;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderGroups {
	@DataProvider(name="data")
	public Object[][] method(ITestContext tc)
	{
		Object[][] data;
		String[] groups=tc.getIncludedGroups();
		for( String group:groups)
		{
			if(group.equalsIgnoreCase("ArithematicOperations"))
			{
				data= new Object[][]{{"20","10"},{"30","20"}};
				return(data);
			}
			else if(group.equalsIgnoreCase("StringManipulations"))
			{
				data= new Object[][]{{"abdul","kalam"},{"raja","rani"}};
				return(data);
			}else
			{
				data= new Object[][]{{"abdul",21},{"kalam",39}};
				return(data);
			}	
		     }
		    return(null);
	         }
			@Test(priority=1,groups= {"ArithematicOperations"},dataProvider="data")
			public void testmethod(String x,String y)
			 {
				int a=Integer.parseInt(x);
				int b=Integer.parseInt(y);
				int w=a+b;
				System.out.println(w);
			  }
			@Test(groups={"ArithematicOperations"},dataProvider="data")
			public void testmethod1(String x,String y)
			{
				int a=Integer.parseInt(x);
				int b=Integer.parseInt(y);
				int w=a-b;
				System.out.println(w);
				}
			@Test(groups={"ArithematicOperations"},dataProvider="data")
			public void testmethod2(String x,String y)
			{
				int a=Integer.parseInt(x);
				int b=Integer.parseInt(y);
				int w=a/b;
				System.out.println(w);
				}
			@Test(groups={"StringManipulations"},dataProvider="data")
			public void StringConact(String x,String y)
			{
			String k=x+y;
			System.out.println(k);
			}
			@Test(groups={"StringManipulations"},dataProvider="data")
			public void stringConactUpper(String x,String y)
			{
			String z=x.toUpperCase()+y.toUpperCase();
			System.out.println(z);
			}
			@Test(groups={"AlphaNumericManipulations"},dataProvider="data")
			public void stringConcatNumber(String x,double y)
			{
				String z=x+y;
				System.out.println(z);
			}
	}


