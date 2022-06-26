package org.check;

import org.base.Base_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.Pojo_Class;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Checks extends Base_class{
@BeforeClass
 	private void url() {
		launch();
driver.get("https://www.facebook.com/");
maximize();
	}
@Parameters({"username","password"})
@Test
private void tc1(@Optional("java") String username,String pass) {
	Pojo_Class p=new Pojo_Class();
	value(p.getEmailid(), username);
	value(p.getPassword(), pass);

}
}
