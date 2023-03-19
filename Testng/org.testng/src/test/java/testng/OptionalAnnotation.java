package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalAnnotation {
	@Test()
	@Parameters({"fname","lname"})
	public void method(String a,@Optional("sudineni")String b)
{
	System.out.println(a+","+" "+b);
}

}
