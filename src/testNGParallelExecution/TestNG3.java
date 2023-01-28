package testNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG3 {
  @Test
  public void method1() {
	  Reporter.log("I am method 1", true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("I am method 2", true);
  }
}
