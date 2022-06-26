package org.pojo;

import org.base.Base_class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_Class extends Base_class {
	public Pojo_Class() {
		PageFactory.initElements(driver, this);
		
	}
	
	
		@FindBy(id="email")
		private WebElement emailid;

		public WebElement getEmailid() {
			return emailid;
		}
		
		@FindBy(name="pass")
		private WebElement password;

		public WebElement getPassword() {
			return password;
		}
		
		
	

}
