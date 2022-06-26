package org.test2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
@Test
public void tc1() {
	Assert.assertTrue(false);
System.out.println("print tc1");
}

@Test
private void tc2() {
Assert.assertTrue(false);
System.out.println("print tc2");

}
@Test
private void tc3() {
System.out.println("print tc3");
}
}
