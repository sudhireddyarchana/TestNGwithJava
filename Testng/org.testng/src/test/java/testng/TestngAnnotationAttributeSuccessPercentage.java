package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngAnnotationAttributeSuccessPercentage {
	@Test(successPercentage=70,invocationCount=5)
	public void method()
	{
	  int x=1;
		if(x%2==0)
		{
			x++;
			Assert.assertTrue(true);
		}
		else
		{
			x++;
	        Assert.assertTrue(false);
		}
	}

}
