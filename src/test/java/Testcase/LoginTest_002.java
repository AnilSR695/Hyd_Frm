package Testcase;

import org.testng.annotations.Test;

import PageObjectClass.LoginPage;

public class LoginTest_002  extends BaseClass {
	
	@Test
	public void logintest() throws InterruptedException {

		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		log.info("username is enetered");
		Thread.sleep(2000);
		lp.setPassword(password);
		log.info("password is enetered");
		Thread.sleep(2000);
		lp.ClickLoginbtn();
		log.info("user is succefully logging inito the account");

		String exp_result="Adactin.com - Search Hotel11";
		String act_result=driver.getTitle();

		if(act_result.equals(exp_result)) {
			log.info("testcase is pass");
		}
		else {
			log.info("testcase is failed");
		}
	}
}

/*
public class LoginTest_002  extends BaseClass {

	@Test
	public void logintest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername();
		System.out.println("username is entered");
		Thread.sleep(2000);
		lp.setPassword();
		System.out.println("password is entered");
		Thread.sleep(2000);
		lp.ClickLoginbtn();
		System.out.println("user is sucessfully logging into the account");
	}
}
*/