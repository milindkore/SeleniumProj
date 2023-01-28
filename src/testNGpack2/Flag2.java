package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test ()
  public void login() {
	  Reporter.log("login done", true);
  }
  
  @Test (dependsOnMethods= "login")
  public void createUser() {
	  Reporter.log("user created", true);
  }
  
  @Test (dependsOnMethods= "createUser")
  public void logout() {
	  Reporter.log("logout", true);
  }
}
