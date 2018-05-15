package pages;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.LeafOrgWrappers;

public class LoginPage extends LeafOrgWrappers{
	public LoginPage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}

	public LoginPage launchLeafOrgApp(String deviceName, String version) throws InterruptedException{
		launchApp("com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", "ZY223G7T3B", "7.1");	
		switchview();
		Thread.sleep(5000);
		return this;
	}

	public LoginPage enterUserName(String email) throws InterruptedException{
		enterTextByXpath(prop.getProperty("LoginPage.Email.Xpath"),"sakthivel@testleaf.com");		
		return this;
	}

	public LoginPage enterPassword(String password){
		enterTextByXpath(prop.getProperty("LoginPage.Password.Xpath"), "Leaf@123");
		return this;
	}

	public HomePage clickLogin(){
		clickByXpath(prop.getProperty("LoginPage.Login.Xpath"));
		return new HomePage(driver, test);
	}

	
//
//	public  HomePage loginToLeafOrg(String deviceName,String version, String email,String password){
//		launchApp("com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", deviceName, version);	
//		switchWebview();
//		enterTextByXpath(prop.getProperty("LoginPage.Email.Xpath"),email);
//		enterTextByXpath(prop.getProperty("LoginPage.Password.Xpath"), password);
//		clickByXpath(prop.getProperty("LoginPage.Login.Xpath"));
//		return new HomePage(driver, test);
//	}
//
//	
//	public  HomePage loginToLeafOrg(String email,String password){
//		enterTextByXpath(prop.getProperty("LoginPage.Email.Xpath"),email);
//		enterTextByXpath(prop.getProperty("LoginPage.Password.Xpath"), password);
//		clickByXpath(prop.getProperty("LoginPage.Login.Xpath"));
//		return new HomePage(driver, test);
//	}



}
