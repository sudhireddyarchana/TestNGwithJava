package testng;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFromExcelFile
{
@DataProvider(name="exceldata")
public Object[][] method1() throws Exception
{
	File f=new File("C:\\Testng\\org.testng\\src\\test\\resources\\Book.xlsx");
	FileInputStream fi= new FileInputStream(f);
	Workbook w=WorkbookFactory.create(fi);
	Sheet s=w.getSheetAt(0);
	int rownum=s.getPhysicalNumberOfRows();
	int colnum=s.getRow(0).getLastCellNum();
	System.out.println(rownum);
	System.out.println(colnum);
	Object[][] data= new Object[rownum-1][colnum];
	for(int i=1;i<rownum;i++)
	{
		for(int j=0;j<colnum;j++)
		{
			try
			{
			DataFormatter df= new DataFormatter();
			data[i-1][j]=df.formatCellValue(s.getRow(i).getCell(j));
	
		}catch(Exception e)
		{
			data[i-1][j]=" ";
		
			//j++;
		}
	 // i++;
	}
		
	}
	fi.close();
	w.close();
	return(data);
}
@Test(dataProvider="exceldata")
public void mehod(String a,String b,String c)
{
	System.out.println(a+","+b+","+c);
}
}
