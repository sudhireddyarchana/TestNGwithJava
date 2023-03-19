package testng;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class ParalellExecutionOfTestMethods2 {
	SimpleDateFormat s=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
	Date d= new Date();
	@Test()
	public void method3()
	{
		System.out.println("am method3 in class2");
		System.out.println(s.format(d));
	}
	@Test()
	public void method4()
	{
		System.out.println("am method4 in class2");
		System.out.println(s.format(d));
	}

}
