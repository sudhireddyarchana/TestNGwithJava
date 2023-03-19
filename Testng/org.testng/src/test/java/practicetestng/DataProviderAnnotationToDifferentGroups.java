package practicetestng;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationToDifferentGroups 
{
@DataProvider(name="testdata")
public Object[][] method(ITestContext tc)
{
String[] groups=tc.getIncludedGroups();	
for(String group:groups)
{
	if(group.equalsIgnoreCase("ArithmaticOperations"))
	{
		Object[][] data=new Object[][]{
			{20,10},{10,10},{13,12}
			};
			return data;
		}
		
	else if(group.equalsIgnoreCase("StringManipulations"))
	{
		Object[][] data= new Object[][]{
			{"bubby","archana"},{"kannaya","avi"},{"arun","reddy"}
		};
		return data;
        }
	else
	{
		Object[][] data= new Object[][]{
			{"bubby",23},{"arun",28}
		};
		return data;
		}
	}
    return(null);
}
@Test(priority=0,dataProvider="testdata",groups={"ArithmaticOperations"})
public void method1(int x,int y)
{
	int z=x-y;
	System.out.println("value of int z is: "+z);
}
@Test(priority=1,dataProvider="testdata",groups={"StringManipulations"})
public void method2(String a,String b)
{
	String c=a+":"+b;
	System.out.println("value of string c is: "+c);
}
}
