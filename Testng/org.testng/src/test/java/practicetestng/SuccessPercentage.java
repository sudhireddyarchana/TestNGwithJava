package practicetestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessPercentage
{
	//public int i=0;
@Test(description="percentage",successPercentage=30)
public void method5()
{
	for(int i=0;i<=10;i++)
	{
	if(i%2==0)
	{
	
	Assert.assertTrue(false);		
	//}else {
	//Assert.assertTrue(false);
	}
	//i++;
	System.out.println("i value is:"+i);
	}
}
}


