package testng;

import org.testng.annotations.Test;

public class TestAnnotationAttribute1{
	@Test(description="open browser")
	public void method()
	{
		System.out.println("chrome browser opened");
	}
	

}
