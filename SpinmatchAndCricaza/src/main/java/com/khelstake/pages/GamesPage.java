package com.khelstake.pages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.khelstake.Demo.BaseTest;

public class GamesPage extends BaseTest{
	
	
	public GamesPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// all games 
	@FindBy (xpath ="//pre[@class='sf-dump'] | //iframe[@id='76:12665'] | //div[@class='GameTimer_container__TmEqi'] | "
			+ "//div[@class='_titleContainer_bncmw_15'] | //body[@onload='contentResize();'] | //div[@class='sc-ktCSKO hNpqPT'] | //iframe[@id='80:13530']"
			+ " | //div[@class='sc-aXZVg dDQpau'] | //div[@class='coming-soon-content'] | //div[@class='sc-dJiZtA bzQPcY']")
	public WebElement Errormsg;
	
	//iframe[@id='76:12665']
	
	@FindBy (xpath ="//body[@class='desktop']")
	public WebElement BlankPage;
	
	//body[@class='desktop']	
	//pre[@class='sf-dump']
	@FindBy (xpath ="//p[contains(text(),'skyward')]/..//a")
	public WebElement Bgames_Skyward;
	
	@FindBy (xpath ="//p[contains(text(),'Classic Wheel')]/..//a")
	public WebElement Bgames_ClassicWheel;
	
	@FindBy (xpath ="//p[contains(text(),'War Of Bets')]/..//a")
	public WebElement Bgames_WarOfBets;
	
	@FindBy (xpath ="//p[contains(text(),'Dice Duel')]/..//a")
	public WebElement Bgames_DiceDuel;
	
	@FindBy (xpath ="//p[contains(text(),'Wheel Of Fortune')]/..//a")
	public WebElement Bgames_WheelOfFortune;
	
	@FindBy (xpath ="//p[contains(text(),'6+ Poker')]/..//a")
	public WebElement Bgames_6Poker;
	
	@FindBy (xpath ="//p[contains(text(),'Combo')]/..//a")
	public WebElement Bgames_Combo;
	
	
	@FindBy (xpath ="(//p[contains(text(),'Royal Bet on Teen Patti')]/..//a)[2]")
	public WebElement WinMatch_Teenpatti;
	
	@FindBy (xpath ="(//p[contains(text(),'Royal Roulette')]/..//a)[2]")
	public WebElement WinMatch_Roulette;
	
	@FindBy (xpath ="(//p[contains(text(),'Royal Andar Bahar')]/..//a)[2]")
	public WebElement WinMatch_RoyalAndarBahar;
	
	@FindBy (xpath ="(//p[contains(text(),'Winmatch EZ Dealer Roulette')]/..//a)[2]")
	public WebElement WinMatch_WinmatchEZDealerRoulette;
	
	
	@FindBy (xpath ="(//p[contains(text(),'Andar Bahar Double Up')]/..//a)[2]")
	public WebElement Vivo_AndarBaharDoubleUp;
	
	@FindBy (xpath ="//p[contains(text(),'Francais Belle Roulette')]/..//a")
	public WebElement Vivo_FrancaisBelleRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Rapid-Auto Roulette')]/..//a")
	public WebElement Vivo_Rapid_AutoRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Las Vegas Roulette')]/..//a")
	public WebElement Vivo_LasVegasRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Macau Baccarat')]/..//a")
	public WebElement Vivo_MacauBaccarat;
	
	@FindBy (xpath ="//p[contains(text(),'Caribbean Baccarat')]/..//a")
	public WebElement Vivo_CaribbeanBaccarat;
	
	@FindBy (xpath ="//p[contains(text(),'Diamond VIP Roulette')]/..//a")
	public WebElement  Mojos7_DiamondVIPRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Teen Patti Face Off')]/..//a")
	public WebElement  Mojos7_TeenPattiFaceOff;
	
	@FindBy (xpath ="//p[contains(text(),'777x Galaxy Roulette')]/..//a")
	public WebElement  Mojos7_777xGalaxyRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Auto Roulette Royal')]/..//a")
	public WebElement  Mojos7_AutoRouletteRoyal;
	
	@FindBy (xpath ="(//p[contains(text(),'Galaxy Roulette')]/..//a)[2]")
	public WebElement  Mojos7_GalaxyRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Dragon Tiger')]/..//a")
	public WebElement  Mojos7_DragonTiger;
	
	
	@FindBy (xpath ="//p[contains(text(),'Skyline Roulette')]/..//a")
	public WebElement  Ezugi_SkylineRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'No Commission Baccarat B')]/..//a")
	public WebElement  Ezugi_NoCommissionBaccaratB;
	
	@FindBy (xpath ="//p[contains(text(),'Fortune Pusher')]/..//a")
	public WebElement  Ezugi_FortunePusher;
	
	@FindBy (xpath ="//p[contains(text(),'Magic Claw')]/..//a")
	public WebElement  Ezugi_MagicClaw;
	
	@FindBy (xpath ="//p[contains(text(),'Cricket Auto Roulette')]/..//a")
	public WebElement  Ezugi_CricketAutoRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'No Commission Baccarat D')]/..//a")
	public WebElement  Ezugi_NoCommissionBaccaratD;
	
	@FindBy (xpath ="//p[contains(text(),'Blackjack VIP T')]/..//a")
	public WebElement  Evulation_BlackjackVIPT;
	
	@FindBy (xpath ="//p[contains(text(),'Red Door Roulette')]/..//a")
	public WebElement  Evulation_RedDoorRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Dead Or Alive: Saloon')]/..//a")
	public WebElement  Evulation_DeadOrAliveSaloon;
	
	@FindBy (xpath ="//p[contains(text(),'First Person Craps')]/..//a")
	public WebElement  Evulation_FirstPersonCraps;
	
	@FindBy (xpath ="//p[contains(text(),'Football Studio Roulette ')]/..//a")
	public WebElement  Evulation_FootballStudioRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'FP Person Prosperity Tree Baccarat ')]/..//a")
	public WebElement  Evulation_FPPersonProsperityTreeBaccarat;
	
	@FindBy (xpath ="//p[contains(text(),'Thunder Roulette')]/..//a")
	public WebElement  XPG_ThunderRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'SicBo')]/..//a")
	public WebElement  XPG_SicBo;
	
	@FindBy (xpath ="//p[contains(text(),'Teen Patti 20-20')]/..//a")
	public WebElement  XPG_Teenpatti2020;
	
	@FindBy (xpath ="//p[contains(text(),'Baccarat  1')]/..//a")
	public WebElement  XPG_Baccarat1;
	
	@FindBy (xpath ="//p[contains(text(),'Texas Holdem Bonus')]/..//a")
	public WebElement  XPG_TexasHoldemBonus;
	
	@FindBy (xpath ="//p[contains(text(),'Fast Roulette')]/..//a")
	public WebElement  XPG_FastRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Dragon Roulette')]/..//a")
	public WebElement  XPG_DragonRoulette;
	

	@FindBy (xpath ="//p[contains(text(),'Portomaso Lumia')]/..//a")
	public WebElement  ALG_PortomasoLumia;
	
	@FindBy (xpath ="//p[contains(text(),'Absolute Brown')]/..//a")
	public WebElement  ALG_AbsoluteBrown;
	
	@FindBy (xpath ="//p[contains(text(),'Portomaso Casino')]/..//a")
	public WebElement  ALG_PortomasoCasino;
	
	@FindBy (xpath ="//p[contains(text(),'Portomaso VIP')]/..//a")
	public WebElement  ALG_PortomasoVIP;
	
	@FindBy (xpath ="//p[contains(text(),'Oracle Blaze')]/..//a")
	public WebElement  ALG_OracleBlaze;
	
	@FindBy (xpath ="//p[contains(text(),'Absolute Black')]/..//a")
	public WebElement  ALG_AbsoluteBlack;
	
	@FindBy (xpath ="//p[contains(text(),'Live Roulette')]/..//a")
	public WebElement  Atmosphera_LiveRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Keno')]/..//a")
	public WebElement  Atmosphera_Keno;
	
	
	@FindBy (xpath ="(//p[contains(text(),'Fast Keno')]/..//a)[1]")
	public WebElement  TVBet_FastKeno;
	
	@FindBy (xpath ="//p[contains(text(),'5Bet')]/..//a")
	public WebElement  TVBet_5Bet;
	
	@FindBy (xpath ="(//p[contains(text(),'Keno')]/..//a)[3]")
	public WebElement  TVBet_Keno;
	
	@FindBy (xpath ="//p[contains(text(),'7Bet')]/..//a")
	public WebElement  TVBet_7Bet;
	
	@FindBy (xpath ="//p[contains(text(),'War of Elements')]/..//a")
	public WebElement  TVBet_WarofElements;
			
	@FindBy (xpath ="//p[contains(text(),'Wheelbet')]/..//a")
	public WebElement  TVBet_Wheelbet;		
			
	
	@FindBy (xpath ="(//p[contains(text(),'Sic Bo')]/..//a)[1]")
	public WebElement  BeterLive_SicBo;
	
	@FindBy (xpath ="//p[contains(text(),'Gravity Blackjack')]/..//a")
	public WebElement   BeterLive_GravityBlackjack;
	
	@FindBy (xpath ="(//p[contains(text(),'Speed Blackjack')]/..//a)[10]")
	public WebElement   BeterLive_SpeedBlackjack;
	
	@FindBy (xpath ="//p[contains(text(),'Live Roulette')]/..//a")
	public WebElement   BeterLive_LiveRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Live French Roulette')]/..//a")
	public WebElement   BeterLive_LiveFrenchRoulette;
	
	@FindBy (xpath ="//p[contains(text(),'Live Baccarat 1 NC')]/..//a")
	public WebElement   BeterLive_LiveBaccarat1NC;
	
	
	@FindBy (xpath ="//p[contains(text(),'Blackjack Euro')]/..//a")
	public WebElement   Livesolution_BlackjackEuro;
	
	@FindBy (xpath ="//p[contains(text(),'Fan Tan')]/..//a")
	public WebElement   Livesolution_FanTan;
	
	@FindBy (xpath ="//p[text()='Asian Baccarat']/..//a")
	public WebElement   Livesolution_AsianBaccarat;
	
	@FindBy (xpath ="//p[text()='Blackjack']/..//a")
	public WebElement   Livesolution_Blackjack;
	
	@FindBy (xpath ="//p[text()='Craps']/..//a")
	public WebElement   Livesolution_Craps;
	
	@FindBy (xpath ="//p[text()='Speed Asian Baccarat']/..//a")
	public WebElement   Livesolution_SpeedAsianBaccarat;
	
			
	@FindBy (xpath ="//p[contains(text(),'Auto Roulette 1')]/..//a")
	public WebElement   Live88_AutoRoulette1;
	
	@FindBy (xpath ="//p[contains(text(),'Baccarat High Roller 1')]/..//a")
	public WebElement   Live88_ABaccaratHighRoller1;
	
	@FindBy (xpath ="//p[text()='Bombay Live Baruto Baccarat']/..//a")
	public WebElement   Live88_BombayLiveBarutoBaccarat;
	
	@FindBy (xpath ="//p[text()='Baccarat Speed 1']/..//a")
	public WebElement   Live88_BaccaratSpeed1;
	
	@FindBy (xpath ="//p[text()='Baccarat Speed 2']/..//a")
	public WebElement   Live88_BaccaratSpeed2;
	
	@FindBy (xpath ="//p[text()='Baccarat Speed A']/..//a")
	public WebElement   Live88_BaccaratSpeedA;
	
	@FindBy (xpath ="//p[contains(text(),'BlackJack')]/..//a")
	public WebElement   Jacktop_BlackJack;
	
	@FindBy (xpath ="(//p[contains(text(),'Poker')]/..//a)[1]")
	public WebElement   Jacktop_Poker;
	
	@FindBy (xpath ="//p[text()='Steam Roulette']/..//a")
	public WebElement   Jacktop_SteamRoulette;
	
	@FindBy (xpath ="//p[text()='Baccarat']/..//a")
	public WebElement   Jacktop_Baccarat;
	
	
	
	
	
	public List<WebElement> addProviderGameServices(WebElement... elements) {
		List<WebElement> eleList = new ArrayList();
		for (WebElement webElement : elements) {
			eleList.add(webElement);
		}
		return eleList;
	}
	 public String[] addGameServices(String...s) {
		 return s;
	}
	
}
