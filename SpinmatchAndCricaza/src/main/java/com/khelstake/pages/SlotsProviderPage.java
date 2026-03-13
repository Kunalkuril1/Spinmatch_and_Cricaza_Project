package com.khelstake.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.khelstake.Demo.BaseTest;

public class SlotsProviderPage extends BaseTest{
	
	public SlotsProviderPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="(//div[contains(text(),'spribe')])[2]")
	public WebElement spribe;
	
	@FindBy (xpath ="(//div[contains(text(),'pgsoft')])[2]")
	public WebElement pgsoft;
	
	@FindBy (xpath ="//div[contains(text(),'RedTiger')]")
	public WebElement RedTiger;
	
	@FindBy (xpath ="(//div[contains(text(),'NetEnt')])[2]")
	public WebElement NetEnt;
	
	@FindBy (xpath ="(//div[contains(text(),'7mojos')])[2]")
	public WebElement mojos7;
	
	@FindBy (xpath ="(//div[contains(text(),'zillion')])[2]")
	public WebElement zillion;
	
	@FindBy (xpath ="(//div[contains(text(),'wazdan')])[2]")
	public WebElement wazdan;
	
	@FindBy (xpath ="(//div[contains(text(),'vibragaming')])[2]")
	public WebElement vibragaming;
	
	@FindBy (xpath ="(//div[contains(text(),'turbogames')])[2]")
	public WebElement turbogames;
		
	@FindBy (xpath ="(//div[contains(text(),'technology')])[2]")
	public WebElement technology;
	
	
	@FindBy (xpath ="(//div[contains(text(),'swntt')])[2]")
	public WebElement Swntt;
	
	@FindBy (xpath ="(//div[contains(text(),'spinza')])[2]")
	public WebElement Spinza;
	
	@FindBy (xpath ="(//div[contains(text(),'rfranco')])[2]")
	public WebElement Rafranco;
	
	@FindBy (xpath ="(//div[contains(text(),'reevo')])[2]")
	public WebElement Reevo;
	
	@FindBy (xpath ="(//div[contains(text(),'quickspin')])[2]")
	public WebElement Quickspin;
	
	@FindBy (xpath ="(//div[contains(text(),'popiplay')])[2]")
	public WebElement Popiplay;
	
	@FindBy (xpath ="(//div[contains(text(),'platipus')])[2]")
	public WebElement Platipus;
	
	@FindBy (xpath ="(//div[contains(text(),'orbital')])[2]")
	public WebElement Orbital;
	
	@FindBy (xpath ="(//div[contains(text(),'onlyplay')])[2]")
	public WebElement Onlyplay;
	
	@FindBy (xpath ="(//div[contains(text(),'onetouch')])[2]")
	public WebElement Onetouch;
	
	@FindBy (xpath ="(//div[contains(text(),'nucleus')])[2]")
	public WebElement Nucleus;
	
	@FindBy (xpath ="(//div[contains(text(),'netgame')])[2]")
	public WebElement Netgame;
	
	@FindBy (xpath ="(//div[contains(text(),'mrslotty')])[2]")
	public WebElement Mrslotty;
	
	@FindBy (xpath ="(//div[contains(text(),'mplay')])[2]")
	public WebElement Mplay;
	
	@FindBy (xpath ="(//div[contains(text(),'mgagames')])[2]")
	public WebElement Mgagames;
	
	@FindBy (xpath ="(//div[contains(text(),'merkur')])[2]")
	public WebElement Merkur;
	
	@FindBy (xpath ="(//div[contains(text(),'mascot')])[2]")
	public WebElement Mascot;
	
	@FindBy (xpath ="(//div[contains(text(),'mancala')])[2]")
	public WebElement Mancala;
	
	@FindBy (xpath ="(//div[contains(text(),'lucky')])[2]")
	public WebElement Lucky;
	
	@FindBy (xpath ="(//div[contains(text(),'kiron')])[2]")
	public WebElement kiron;
	
	@FindBy (xpath ="(//div[contains(text(),'kagaming')])[2]")
	public WebElement Kagaming;
	
	@FindBy (xpath ="(//div[contains(text(),'highfive')])[2]")
	public WebElement Highfive;
	
	@FindBy (xpath ="(//div[contains(text(),'groove')])[2]")
	public WebElement Groove;
	
	@FindBy (xpath ="(//div[contains(text(),'gameart')])[2]")
	public WebElement Gameart;
	
	@FindBy (xpath ="(//div[contains(text(),'fantasma')])[2]")
	public WebElement Fantasma;
	
	@FindBy (xpath ="(//div[contains(text(),'everymatrix')])[2]")
	public WebElement Everymatrix;
	
	@FindBy (xpath ="(//div[contains(text(),'eagaming')])[2]")
	public WebElement Eagaming;
	
	@FindBy (xpath ="(//div[contains(text(),'bsg')])[2]")
	public WebElement Bsg;
	
	@FindBy (xpath ="(//div[contains(text(),'bet2tech')])[2]")
	public WebElement Bet2tech;
	
	@FindBy (xpath ="(//div[contains(text(),'altente')])[2]")
	public WebElement Altente;
	
	@FindBy (xpath ="(//div[contains(text(),'1spin4win')])[2]")
	public WebElement Onespin4win;
	
	@FindBy (xpath ="(//div[contains(text(),'kalamba')])[2]")
	public WebElement Kalamba;
	
	@FindBy (xpath ="(//div[contains(text(),'jaderabbit')])[2]")
	public WebElement Jaderabbit;
	
	@FindBy (xpath ="(//div[contains(text(),'habanero')])[2]")
	public WebElement Habanero;
	
	@FindBy (xpath ="(//div[contains(text(),'gamzix')])[2]")
	public WebElement Gamzix;
	
	@FindBy (xpath ="(//div[contains(text(),'fazi')])[2]")
	public WebElement Fazi;
	
	@FindBy (xpath ="(//div[contains(text(),'evoplay')])[2]")
	public WebElement Evoplay;
	
	@FindBy (xpath ="(//div[contains(text(),'endorphina')])[2]")
	public WebElement Endorphina;
	
	@FindBy (xpath ="(//div[contains(text(),'clawbuster')])[2]")
	public WebElement Clawbuster;
	
	@FindBy (xpath ="(//div[contains(text(),'bgaming')])[2]")
	public WebElement Bgaming;
	
	@FindBy (xpath ="(//div[contains(text(),'belatra')])[2]")
	public WebElement Belatra;
	
	@FindBy (xpath ="(//div[contains(text(),'5men')])[2]")
	public WebElement Fivemen;
	
	
	
	public List<WebElement> enterProvidersName(WebElement...elements) {
		List<WebElement> eleList = new ArrayList();
		for (WebElement webElement : elements) {
			eleList.add(webElement);
		}
		return eleList;
	}
}
