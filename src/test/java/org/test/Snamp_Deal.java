package org.test;

import java.sql.Date;

import org.apache.hc.core5.reactor.Command.Priority;
import org.base.Base_class;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Snamp_Deal extends Base_class {

	
	@BeforeMethod
	private void starttime() {
		
		launch();
		url("https://www.snapdeal.com/");
		// TODO Auto-generated method stub
java.util.Date d=new java.util.Date();
System.out.println(d);
	}
	
	@Test()
	private void tc1() {
		// TODO Auto-generated method stub
snapdeal("shoes");
snapclick();
maximize();
driver.findElement(By.xpath("(//p[contains(text(),'Aadi')])[2]")).click();
	}
	
	
	
}
