package org.test2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RE_Run  implements IRetryAnalyzer{
int min=0,max=5;
	public boolean retry(ITestResult result) {
		if (min<max) {
			
		min++;	
			return true;
		
		}
		return false;
	}

}
