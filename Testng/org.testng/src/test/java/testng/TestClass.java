package testng;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("C:\\Testng\\org.testng\\src\\test\\resources\\Book1.xlsx");
		FileInputStream fi= new FileInputStream(f);
		Workbook w=WorkbookFactory.create(fi);
		Sheet s=w.getSheetAt(0);
		int rownum=s.getPhysicalNumberOfRows();
		int colnum=s.getRow(0).getLastCellNum();
		System.out.println(rownum);
		System.out.println(colnum);
	}

}
