package testNgPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void f() {
	  Reporter.log("from f", true);
  }
  
  @Test
  public void f1() {
	  Reporter.log("from f1", true);
  }
  
  @Test
  public void f2() {
	  Reporter.log("from f2", true);
  }
  
}
