package testng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatafromTextFile 
{
@DataProvider(name="textfile")
public Object[][] method1() throws Exception
{
	Object[][] data= new Object[3][3];
	File f= new File("C:\\Testng\\org.testng\\src\\test\\resources\\File.txt");
	FileReader fr= new FileReader(f);
	//get data from hard disk to ram
	BufferedReader br= new BufferedReader(fr);
	//get values one by one upto last line
	String line;
	int i=0;//array index starts with '0'
	while((line=br.readLine())!=null)
	{
		String[] pieces=line.split(",");
		int j=0;
		for( String piece:pieces)
		{
			data[i][j]=piece;
			j++;//next column
		 }
		i++;//next row
	}
	br.close();
	fr.close();
	return(data);
}	

@Test(dataProvider="textfile")
public void method2(String x,String y,String z)
{
	String w=x+","+y+","+z;
	System.out.println(w);
}
}
