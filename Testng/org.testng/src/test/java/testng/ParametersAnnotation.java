package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotation {
	@Test()
	@Parameters({"Arun","archana","firstname","lastname"})
	public void displayage(String a,String b,String fn,String ln)
	{
		System.out.println(a+","+" "+b+","+" "+fn+","+" "+ln);
	}
	@Test()
	@Parameters({"Arun","archana"})
	public void displayage(String a,String b)
	{
		System.out.println(a+","+" "+b);
	}
	

	

}
