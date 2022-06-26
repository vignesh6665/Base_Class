package org.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.Base_class;
import org.pojo.Pojo_Class;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testing extends Base_class {
	
	
	public void samp() throws IOException {
		// TODO Auto-generated method stub

	
	File f=new File("C:\\Users\\vignesh.k\\eclipse-workspace-framework\\Testing\\xcel\\Book1.xlsx");
	FileInputStream fi=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fi);
	Sheet s = wb.getSheet("Sheet1");
	Row r = s.getRow(0);
	Cell c = r.getCell(0);
	
	}
	
	@Test(dataProvider="s")
	private void tc1(String user,String pass) throws IOException {
		launch();
		url("https://www.facebook.com/");
		Pojo_Class p=new Pojo_Class();
		value(p.getEmailid(), user);
		value(p.getPassword(), pass);
		
		
		
	}
	
	@DataProvider(name="s")
	public Object[][] xcel() {
		
	}
	
	private void tc2() {
		// TODO Auto-generated method stub

	
	 private Object[][] data(){
		
		return new String[][] {
			
			
			
		
		
			
			
			
			
			
			
		};
	}
	}
	
}
