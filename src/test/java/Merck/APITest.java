package Merck;

import org.testng.annotations.Test;

public class APITest {
	@Test(groups = { "functest", "smoketest" })
  public void f() {
	  System.out.println("This is a new test");
  }
}