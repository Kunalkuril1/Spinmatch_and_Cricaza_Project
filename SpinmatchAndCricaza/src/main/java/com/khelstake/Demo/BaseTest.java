package com.khelstake.Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends ReportUtils  {
	
	public RemoteWebDriver driver;
	
	@BeforeSuite
	public void intializationReportConfig() {
		intializedReport();
	}
	
	@BeforeClass
	 public void startReport() {
		createReport(this.getClass().getSimpleName());
	}
	
	@BeforeMethod
	public void lunchWeb() {
		if(WebContants.browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(WebContants.browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		else if(WebContants.browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			throw new IllegalArgumentException("Invalid browser type: "+WebContants.browser);
		}
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void KillBrowser() {
		driver.quit();
	} 
	@AfterSuite
	public void KillReport() {
		report.flush();
	}
	

}
