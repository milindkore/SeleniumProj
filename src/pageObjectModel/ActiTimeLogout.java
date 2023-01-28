package pageObjectModel;

import java.io.IOException;

public class ActiTimeLogout extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		lp.actitimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
		
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		hp.selectUser(1);
		Thread.sleep(2000);
		hp.logOut();
		
		bt.closeBrowser();
	}

}
