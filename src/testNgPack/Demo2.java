package testNgPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void f1() {
	  Reporter.log("from f1 method", true);
  }


@Test
public void f2()
{
	//System.out.println("Hello2");
	Reporter.log("from f2 method", true);
}

@Test
public void f3()
{
	//System.out.println("Hello3");
	Reporter.log("from f3 method", true);
}

}