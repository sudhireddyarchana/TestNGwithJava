package practicetestng;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelSheet
{
@DataProvider(name="textfiledata")
public Object[][] datamethod() throws Exception
{
	File f= new File("C:\\Testng\\org.testng\\src\\test\\resources\\excel.xlsx");
	FileInputStream fi=new FileInputStream(f);
	Workbook w=WorkbookFactory.create(fi);
	Sheet sh=w.getSheetAt(0);
	int rows=sh.getPhysicalNumberOfRows();
	int col=sh.getRow(0).getLastCellNum();
	Object[][] data= new Object[rows-1][col];
	for(int i=1;i<rows;i++)
	{
		for(int j=0;j<col;j++)
		{
			try
			{
			DataFormatter df= new DataFormatter();
			data[i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
			}catch(Exception ex)
			{
				data[i-1][j]=" ";
			}
		}
	}
	w.close();
	fi.close();
	return data;
}
@Test(dataProvider="textfiledata")
public void method(String x,String y,String z)
{
	System.out.println("X,Y,Z values are: "+x+","+y+","+z);
}
}
