package testng;

import org.testng.annotations.Test;

public class TestAnnotationAttributeInvocationCount{
	public int x=1;
	@Test(invocationCount=4,invocationTimeOut=10000)
	public void method()
	{
		x++;
		System.out.println(x);
		//x++;
	}

}
