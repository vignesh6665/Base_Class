package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.Snamp_Deal;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
public	static WebDriver driver;
	
	public static void launch() {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
  driver=new ChromeDriver();
	}
	public static void maximize() {
		// TODO Auto-generated method stub
driver.manage().window().maximize();
	}
	
	
	public static void url(String name) {
driver.get(name);

	
	}

public static void value(WebElement element,String txt) {
	// TODO Auto-generated method stub
element.sendKeys(txt);
}

public Object[][] xcel() throws IOException {
	String[][] data=null;
	try {
		
	
File f=new File("C:\\Users\\vignesh.k\\eclipse-workspace-framework\\Testing\\xcel\\Book1.xlsx");
FileInputStream fi=new FileInputStream(f);
Workbook w=new XSSFWorkbook(fi);
Sheet s = w.getSheet("Sheet1");
Row r = s.getRow(0);
int p = s.getPhysicalNumberOfRows();
int last = r.getLastCellNum();
org.apache.poi.ss.usermodel.Cell cell;

data =new String[p-1] [last];

for (int i = 1; i < p; i++) {
	
	for (int j = 0; j < last; j++) {
		r=s.getRow(i);
		cell=r.getCell(j);
		data [i-1][j]=cell.getStringCellValue();
	}
}
	}
catch (Exception e) {
	System.out.println("final"+e.getMessage());
}
	return data;
	
	
	
	
}


public void snapdeal(String text) {
	// TODO Auto-generated method stub
WebElement sent = driver.findElement(By.id("inputValEnter"));
sent.sendKeys(text);
}

public void snapclick() {
	WebElement c = driver.findElement(By.xpath("//button[contains(@class,'searchformButton')]"));
	c.click();

}

}
