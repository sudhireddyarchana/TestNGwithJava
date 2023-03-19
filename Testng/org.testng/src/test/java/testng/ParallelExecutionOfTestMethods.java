package testng;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class ParallelExecutionOfTestMethods 
{
	SimpleDateFormat s=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
	Date d= new Date();
@Test()
public void method1()
{
	System.out.println("am method1 in class1");
	String x=s.format(d);
	System.out.println(x);
}
@Test()
public void method2()
{
	System.out.println("am method2 in class1");
	System.out.println(s.format(d));
}
}
