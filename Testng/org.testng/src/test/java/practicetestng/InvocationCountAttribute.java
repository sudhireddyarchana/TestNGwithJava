package practicetestng;

import org.testng.annotations.Test;

public class InvocationCountAttribute
{
public int i=0;
@Test(invocationCount=5,invocationTimeOut=5000)
public void method4()
{
	System.out.println("I value is:"+i);
	i++;
}

}
