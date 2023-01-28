package testNgPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() {
	  Reporter.log("This is method of demo class", true);
  }
  
  @Test
  public void demo1() {
	  Reporter.log("This is method of demo1 class", true);
  }
  
  @Test 
  public void demo2() {
	  int a=10;
	  int b=0;
	  
	  try {
		  int res=a/b;
		
	} 
	 catch (ArithmeticException e) {
		 System.out.println(e);
		
	}
  }
}
