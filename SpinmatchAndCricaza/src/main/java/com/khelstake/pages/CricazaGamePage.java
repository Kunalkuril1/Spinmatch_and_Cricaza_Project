package com.khelstake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.khelstake.Demo.BaseTest;

public class CricazaGamePage extends BaseTest {
	
	public CricazaGamePage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy (xpath ="//p[contains(text(),'No Commission Baccarat D')]/..//a")
	public WebElement   Ezugi_NoCommissionBaccaratD;
	
	@FindBy (xpath ="//p[contains(text(),'Russian Poker')]/..//a")
	public WebElement   Ezugi_RussianPoker;
	
	@FindBy (xpath ="//p[contains(text(),'32Cards')]/..//a")
	public WebElement   XPG_32Cards;
	
	@FindBy (xpath ="//p[contains(text(),'Teen Patti 20-20')]/..//a")
	public WebElement   XPG_TeenPatti20_20;
	
	@FindBy (xpath ="//p[contains(text(),'Classic Roulette')]/..//a")
	public WebElement   Bgames_ClassicRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Dice Duel')]/..//a")
	public WebElement   Bgames_DiceDuel;
	
	@FindBy (xpath ="//p[contains(text(),'Rapid-Auto Roulette')]/..//a")
	public WebElement   Vivo_Rapid_AutoRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Las Vegas Roulette')]/..//a")
	public WebElement   Vivo_LasVegasRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Steam Roulette')]/..//a")
	public WebElement   JackTop_SteamRoulette;
	
	@FindBy (xpath ="(//p[contains(text(),'Poker')]/..//a)[1]")
	public WebElement   JackTop_Poker;
	
	@FindBy (xpath ="//p[contains(text(),'Live French Roulette')]/..//a")
	public WebElement   BeterLive_LiveFrenchRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Live Baccarat 1 NC')]/..//a")
	public WebElement   BeterLive_LiveBaccarat1NC;
	
	@FindBy (xpath ="//p[contains(text(),'Baccarat High Roller 1')]/..//a")
	public WebElement   Live88_BaccaratHighRoller1;
	
	@FindBy (xpath ="//p[contains(text(),'Bombay Live Baruto Baccarat')]/..//a")
	public WebElement   Live88_BombayLiveBarutoBaccarat;
		
	@FindBy (xpath ="(//p[contains(text(),'Royal Bet on Teen Patti')]/..//a)[2]")
	public WebElement   Winmatch_RoyalBetonTeenPatti;
	
	@FindBy (xpath ="(//p[contains(text(),'Royal Andar Bahar')]/..//a)[2]")
	public WebElement   Winmatch_RoyalAndarBahar;
	
	@FindBy (xpath ="//p[contains(text(),'First Person Craps')]/..//a")
	public WebElement   Evolution_FirstPersonCraps;
	
	@FindBy (xpath ="//p[contains(text(),'FP Person Prosperity Tree Baccarat ')]/..//a")
	public WebElement  Evulation_FPPersonProsperityTreeBaccarat;
	
	@FindBy (xpath ="//p[contains(text(),'Football Studio Roulette ')]/..//a")
	public WebElement   Evolution_StudioRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'7Bet')]/..//a")
	public WebElement   TvBet_7Bet;
	
	@FindBy (xpath ="//p[contains(text(),'Wheelbet')]/..//a")
	public WebElement   TvBet_Wheelbet;
	
	@FindBy (xpath ="//p[contains(text(),'777x Galaxy Roulette')]/..//a")
	public WebElement   Mojos7_777xGalaxyRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Teen Patti Face Off')]/..//a")
	public WebElement   Mojos7_TeenPattiFaceOff;
	
	@FindBy (xpath ="//p[contains(text(),'Portomaso VIP')]/..//a")
	public WebElement   ALG_PortomasoVIP;
	
	@FindBy (xpath ="//p[contains(text(),'Oracle Blaze')]/..//a")
	public WebElement   ALG_OracleBlaze;
	
	@FindBy (xpath ="//p[contains(text(),'Craps')]/..//a")
	public WebElement   Livesolution_Craps;
	
	@FindBy (xpath ="//p[contains(text(),'Fan Tan')]/..//a")
	public WebElement   Livesolution_FanTan;
	
	
	
	
	
}
