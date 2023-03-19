package practicetestng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTextFile 
{
@DataProvider(name="textfiledata")
public Object[][] method1() throws Exception
{
	Object[][] data=new Object[3][4];
	File f= new File("C:\\Testng\\org.testng\\src\\test\\resources\\TextFile.txt");
	FileReader fr= new FileReader(f);
	BufferedReader bf= new BufferedReader(fr);
	String line;
	int i=0;
	while((line=bf.readLine())!=null)
	{
		int j=0;
		String[] x=line.split(",");
		for(String piece:x)
		{
			data[i][j]=piece;
			j++;
		}i++;
	}
	fr.close();
	bf.close();
	return data;
}
@Test(dataProvider="textfiledata")
public void textFileMethod(String x,String y,String z,String k) 
{
System.out.println("X,Y,Z,K values are :"+x+":"+y+":"+z+":"+k);
}
}