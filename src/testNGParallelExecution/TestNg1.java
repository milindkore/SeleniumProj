package testNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg1 {
  @Test
  public void f1() {
	  Reporter.log("m1 method, true");
  }
}
