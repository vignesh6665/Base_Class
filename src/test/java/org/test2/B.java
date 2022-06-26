package org.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B {
public static WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void tc1(String browser) {
		// TODO Auto-generated method stub
if (browser.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	
} 
if (browser.equals("edge")) {
	WebDriverManager.edgedriver().setup();
}

else {
WebDriverManager.firefoxdriver().setup();
} 
	
driver.get("https://www.facebook.com/");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
