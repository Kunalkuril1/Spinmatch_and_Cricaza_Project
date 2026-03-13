package com.khelstake.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.khelstake.Demo.BaseTest;

public class ProviderPage extends BaseTest{
	
	
	public ProviderPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//div[contains(text(),'bgames')]")
	public WebElement Bgames;
	
	@FindBy (xpath ="//div[contains(text(),'winmatch')]")
	public WebElement Winmatch;
	
	@FindBy (xpath ="//div[contains(text(),'7mojos')]")
	public WebElement mojos7;
	
	@FindBy (xpath ="//div[contains(text(),'vivo')]")
	public WebElement vivo;
	
	@FindBy (xpath ="//div[contains(text(),'ezugi')]")
	public WebElement ezugi;
	
	@FindBy (xpath ="//div[contains(text(),'evolution')]")
	public WebElement evolution;
	
	@FindBy (xpath ="//div[contains(text(),'xpg')]")
	public WebElement xpg;
	
	@FindBy (xpath ="//div[contains(text(),'ALG')]")
	public WebElement ALG;
	
	@FindBy (xpath ="//div[contains(text(),'atmosphera')]")
	public WebElement atmosphera;
	
	@FindBy (xpath ="//div[contains(text(),'tvbet')]")
	public WebElement tvbet;

	@FindBy (xpath ="//div[contains(text(),'beterlive')]")
	public WebElement BeterLive;
		
	@FindBy (xpath ="//div[contains(text(),'livesolutions')]")
	public WebElement livesolutions;
	
	@FindBy (xpath ="//div[contains(text(),'live88')]")
	public WebElement live88;
	
	@FindBy (xpath ="//div[contains(text(),'jacktop')]")
	public WebElement jacktop;
	
	
	public List<WebElement> enterProvidersName(WebElement...elements) {
		List<WebElement> eleList = new ArrayList();
		for (WebElement webElement : elements) {
			eleList.add(webElement);
		}
		return eleList;
	}

}
