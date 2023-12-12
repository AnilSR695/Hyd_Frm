package PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver rdriver;
	   public LoginPage(WebDriver ldriver) {
	       
	       rdriver=ldriver;
	       PageFactory.initElements(ldriver, this);
	   }
	 //locate the all webElements
	   
	   @FindBy(id="username")
	   WebElement txtusername;
	   
	   @FindBy(id="password")
	   WebElement txtpassword;
	   
	   @FindBy(id="login") 
	   WebElement btnLogin;
	   
	   public void setUsername(String user) {
	       txtusername.sendKeys(user);
	   }
	   public void setPassword(String pwd) {
	       txtpassword.sendKeys(pwd);
	   }
	   public void ClickLoginbtn() {
	       btnLogin.click();
	   }
}

/*
public static WebDriver rdriver;

public LoginPage(WebDriver ldriver)
{
	rdriver=ldriver;
	PageFactory.initElements(ldriver, this);
}

//locate the all webElements
@FindBy(xpath ="//input[@placeholder='Username']")
WebElement txtusername;

@FindBy(xpath="//input[@placeholder='Password']")
WebElement txtpassword;

@FindBy(xpath="//button[@type='submit']")
WebElement btnLogin;

public void setUsername()
{
	txtusername.sendKeys("Admin");
}
public void setPassword()
{
	txtpassword.sendKeys("admin123");
}
public void ClickLoginbtn()
{
	btnLogin.click();
}
}
*/