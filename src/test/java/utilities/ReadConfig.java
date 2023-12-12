package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		//configure the properties file ./ project home directory
		
		//approach - 1
		File f=new File("F:\\ANIL\\WORK\\W3SOFTECH\\JAVA\\WORKSPACE\\HybridFrame_Project_001\\src\\test\\resources\\config.properties");

		//approach - 2
		//File f=new File(System.getProperty("user.dir")+"\\HybridFrame_Project_001\\src\\test\\resources\\config.properties");
		try {
			FileInputStream fis=new FileInputStream(f);//convert file data into reading mode
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	//associated methods
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUsername() {
		String user=pro.getProperty("username");
		return user;
	}

	public String getPassword() {
		String pass=pro.getProperty("password");
		return pass;
	}
}