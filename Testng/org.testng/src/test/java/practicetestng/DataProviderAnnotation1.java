package practicetestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation1
{
@DataProvider(name="testdata")
public Object[][] testmethod1()
{
	Object[][] x= new Object[][]{{12,10},{5,6}};
	return x;
}
@Test(priority=1,dataProvider="testdata")
public void method1(int x,int y)
{
	int z=x+y;
	System.out.println("value of z is:"+z);
}
}

