package testNGParallelExecution;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AlwaysRun {
  @Test
  public void f1() {
	  org.testng.Assert.fail();
  }
  //method always runs no matter what
  @Test(dependsOnMethods = "f1")//, alwaysRun = true)
  public void f2() {
	  Reporter.log("This is f2 method", true);
  }
  
  
}
