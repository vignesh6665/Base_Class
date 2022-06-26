package org.test2;

import java.util.List;

import org.apache.hc.core5.reactor.Command.Priority;
import org.base.Base_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Testing2 extends Base_class {
	
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		WebElement l = driver.findElement(By.id(""));
		String s = l.getAttribute("value");
		System.out.println(s);
	}

	
	  @Test
	  private void tc1() {
		// TODO Auto-generated method stub
		  launch();
		  url("https://www.amazon.in/s?k=iphone&crid=3I5F21196T0LG&sprefix=iphone%2Caps%2C312&ref=nb_sb_noss_2");
		  maximize();
		  String t = driver.getTitle();
		  driver.geta
		  System.out.println(t);
	  }		  
		  @Test
	private void tc2() {
		// TODO Auto-generated method stub

	launch();
			url("https://www.amazon.in/s?k=iphone&crid=3I5F21196T0LG&sprefix=iphone%2Caps%2C312&ref=nb_sb_noss_2");
		List<WebElement> last = driver.findElements(By.id("iphone"));
		last.g
		
		  }  
	  
	  
	 
	  
	  
	  
	  @Test(priority=-5)
	  private void tc3() {
		// TODO Auto-generated method stub
launch();
List<WebElement> l = driver.findElements(By.xpath("//span[contains(text(),'iPhone')]"));
for (WebElement webElement : l) {
	String tit = driver.getTitle();
	System.out.println(tit);
}




	}
	 
	  }
	

