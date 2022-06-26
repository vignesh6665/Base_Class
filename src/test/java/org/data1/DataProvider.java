package org.data1;

import org.base.Base_class;
import org.pojo.Pojo_Class;
import org.testng.annotations.Test;

public class DataProvider extends Base_class {
	
	@Test(dataProvider="datas")
	private void tc1(String user) {
		launch();
		url("https://www.facebook.com/");
		Pojo_Class p=new Pojo_Class();
	value(p.getEmailid(), user);
	
	
	
	}
	@org.testng.annotations.DataProvider(name="datas")
	private String[][] data(){
		
		return new String[][] {
			{"java"},
			{"selenium"}
		};
	}
}
