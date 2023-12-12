package Testcase;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageoobjectclass.LoginPage;
import utilities.XLUtils;

public class TC_DataDrivenTest_001 extends BaseClass {
    @Test(dataProvider="ExcelData")
	   public void DataDrivenTest(String usr, String pwd) 
	   {
		   LoginPage lp=new LoginPage(driver);
		   
		   lp.setUsername(usr);
		   
		   lp.setPassword(pwd);
		   
		   lp.ClickLoginbtn();
	   }

	    @DataProvider(name="ExcelData")
	   String [][] getData() throws IOException
	   {
		   String path=System.getProperty("user.dir")+"\\src\\test\\java\\testdata\\datatest.xlsx";
		   
		   int rownum=XLUtils.getRowcount(path, "Sheet1");
		   
		   int colcount=XLUtils.getCellcount(path, "Sheet1", 1);
		   
		   String logindata[][]=new String [rownum][colcount];
		   
		   for (int i=1; i<rownum;i++)//i=row ,1--no use bcz of username 
		   {
			  for (int j=0;j<colcount;j++)//j=column
			  {
				  logindata[i-1][j]= XLUtils.getCelldata(path, "Sheet1", i, j);//2d array bcz of rows and columns 
			  }
		   }
		   
		   return logindata;
	   }
}