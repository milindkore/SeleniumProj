package takeScreenshotDynamic;

import org.testng.IReporter;
import org.testng.annotations.Test;

import jdk.javadoc.doclet.Reporter;

public class Test1 extends BaseTest{
  @Test (priority = 1)
  public void f() {
	  org.testng.Reporter.log("This is method 1", false);
  }
  
  @Test (dependsOnMethods = "f")
  public void f1() {
	  org.testng.Reporter.log("This is method  2", true);
	  
  }
  
}
