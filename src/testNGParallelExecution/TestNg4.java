package testNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg4 {
  @Test
  public void today() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log("Today method"+ threadId+" is the thread", true);
  }
  
  @Test
  public void tomorrow() {
	  
	  long threadId2 = Thread.currentThread().getId();
	  Reporter.log("Tomorrow method"+threadId2+" is the thred", true);
}
}
