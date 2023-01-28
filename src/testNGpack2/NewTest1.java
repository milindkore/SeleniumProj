package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
	
	//lesser priority higher execution 
	// if priority is same execution will happen in alphabetical manner
	//if there is no priority default value is 0
	// negative priority value will be executed first
  @Test(priority=3)
  public void z() {
	  Reporter.log("z", true);
  }
  
  @Test(priority=1)
  public void h() {
	  Reporter.log("h", true);
  }
  
  @Test(priority=0)
  public void i() {
	  Reporter.log("i", true);
  }
  
  @Test(priority=0)
  public void k() {
	  Reporter.log("k", true);
  }
  
  @Test(priority=0)
  public void a() {
	  Reporter.log("a", true);
  }
  
  @Test(priority=7)
  public void m() {
	  Reporter.log("m", true);
  }
  
  @Test(priority=0)
  public void b() {
	  Reporter.log("b", true);
  }
  
  @Test(priority=2)
  public void p() {
	  Reporter.log("p", true);
  }
  
  @Test(priority=0)
  public void g() {
	  Reporter.log("g", true);
  }
  
 
  
}
