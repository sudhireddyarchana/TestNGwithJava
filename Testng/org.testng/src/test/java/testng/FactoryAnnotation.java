package testng;

import org.testng.annotations.Factory;

public class FactoryAnnotation {
	@Factory
	public Object[] method()
	{
		FactoryClass obj1= new FactoryClass();
		FactoryClass2 obj2= new FactoryClass2();
		Object[] array= new Object[2];
			array[0]=obj1;
			array[1]=obj2;
			
		return array;
	}
	

}
