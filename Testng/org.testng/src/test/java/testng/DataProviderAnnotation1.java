package testng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation1 {
	@DataProvider(name="data")
	public Object[][] method1(Method m)
	{
		if(m.getName().equalsIgnoreCase("testmethod1"))
		{
			Object[][] x=new Object[][]{{13,14,15},{-11,37,20},{14,2,4}};
			return (x);
		}else if(m.getName().equalsIgnoreCase("testmethod2"))
		{
			Object[][] x= new Object[][]{{"abdul","kalam","sir"},{"bubby","archana","sudineni"},{"arun","reddy","puram"}};
			return (x);
		}
		else
		{
			Object[][] x= new Object[][]{{"ricky",21,"chompion"},{"surya",50,"kumar"},{"abcd",20,"defg"}};
			return (x);
		}
	}


   @Test(priority=1,dataProvider="data")
   public void testmethod1(int x,int y,int z)
   {
	  int k=x+y-z; 
	  System.out.println(k);
   }
   @Test(priority=2,dataProvider="data")
   public void testmethod2(String a,String b,String c)
   {
	   String w=a+"-"+b+"-"+c;
	   System.out.println(w);
   }
}