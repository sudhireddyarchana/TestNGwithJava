package practicetestng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderToDifferentMethods
{
@DataProvider(name="testdata1")
public Object[][] method1(Method m)
{
	if(m.getName().equalsIgnoreCase("testmethod1"))
	{
		Object[][] data= new Object[][]{{12,6},{10,5},{6,4}};
		return(data);
	}else if(m.getName().equalsIgnoreCase("testmethod2"))
	{
		Object[][] data= new Object[][]{{"archu","bubby","sudineni"},{"ricky","kannaya","avi"}};
		return data;
	}else
	{
		Object[][] data=new Object[][]{{"archana",23},{"bubby",23}};
		return data;
	}
}
@Test(priority=0,dataProvider="testdata1")
public void testmethod1(int x,int y)
{
	int z=x+y;
	System.out.println("value of Z is: "+z);
}
@Test(priority=1,dataProvider="testdata1")
public void testmethod2(String a,String b,String c)
{
	String k=a+"- "+b+"- "+c;
	System.out.println("value of K is: "+k);
}
@Test(priority=2,dataProvider="testdata1")
public void testmethod3(String l,int n)
{
	String m=l+"-"+n;
	System.out.println("value of m is: "+m);
}
}
