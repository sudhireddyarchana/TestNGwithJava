package testng;

import org.testng.annotations.Test;

public class FactoryClass {
	@Test(priority=2)
	public void method1()
	{
		System.out.println("am method1");
	}
    @Test(priority=1)
    public void method2()
    {
    	 System.out.println("am method2");
    }
}
