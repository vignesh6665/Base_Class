package org.sample;

import org.testng.annotations.Test;

public class A {
@Test(groups="@regression")
private void tc11() {
	// TODO Auto-generated method stub
System.out.println("test case 11");
}



@Test(groups= {"@smoke","@regression"})
private void tc22() {
	// TODO Auto-generated method stub
System.out.println("test case 22");
}
}
