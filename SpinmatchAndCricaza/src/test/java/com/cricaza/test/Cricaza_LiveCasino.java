package com.cricaza.test;

import org.testng.annotations.Test;

import com.khelstake.Demo.BaseTest;
import com.khelstake.Demo.EvenUtils;
import com.khelstake.Demo.WebContants;
import com.khelstake.pages.CricazaGamePage;
import com.khelstake.pages.GamesPage;
import com.khelstake.pages.LoginPages;
import com.khelstake.pages.ProviderPage;

public class Cricaza_LiveCasino extends BaseTest {
	
	LoginPages loginPage;
	EvenUtils evenutils;
	ProviderPage provider;
	GamesPage gamePage;
	CricazaGamePage cricazacasino;
	
	@Test
	public void CricazaCasinoGamelounching() {
		try {
			provider=new ProviderPage(driver);
			gamePage=new GamesPage(driver);
			cricazacasino=new CricazaGamePage(driver);
			loginPage=new LoginPages(driver);
			evenutils=new EvenUtils(driver);
			evenutils.navigateToUrl(WebContants.Cricaza_url);
			//Thread.sleep(5000);
			evenutils.switchToFrame(loginPage.insideframe);
			Thread.sleep(3000);
			evenutils.clickOnElement(loginPage.LoginBtnCricaza,"LoginBtnCricaza");
			Thread.sleep(3000);
			String CricazaUser = evenutils.getData("CricazaUserName");
			String CricazaPass = evenutils.getData("Cricazapassword");
		//	String spinMatchUser=evenutils.getDataFromexcel(2, 0);
		//	String spinMatchPass =evenutils.getDataFromexcel(2, 1);		
			System.out.println(CricazaUser+"  "+CricazaPass);
			evenutils.sendValue(loginPage.usreNameInputCricaza, CricazaUser);
			evenutils.sendValue(loginPage.passWordInputCricaza, CricazaPass);
			evenutils.clickOnElement(loginPage.SignInBtnCricaza,"SignInBtn");	
			Thread.sleep(5000); 
			evenutils.clickOnElement(loginPage.skipBtn,"skipBtn");
			evenutils.clickOnElement(loginPage.CasinoBtnInCricaza,"CasinoBtn");
			evenutils.clickOnElement(loginPage.LiveCasinoBtnCricaza,"LiveCasinoBtn");
			Thread.sleep(5000);	
			
			//EZUGI PROVIDER
			int egugi = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.Ezugi_NoCommissionBaccaratD,cricazacasino.Ezugi_RussianPoker)
					,gamePage.addGameServices("Ezugi_NoCommissionBaccaratD","Ezugi_RussianPoker") , "play", provider.enterProvidersName(provider.ezugi));
			if(egugi>=2) {
				logStatus("PASS", "EZUGI_001 Successfully clicked on the Provider Name (EZUGI) and landed on the EZUGI page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "EZUGI_001 Successfully Clicked  on the Provider Name (EZUGI) but Error appears when the game launched");
			} 
			
			//XPG PROVIDER
			int xpg = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.XPG_32Cards,cricazacasino.XPG_TeenPatti20_20),
					gamePage.addGameServices("XPG_32Cards","XPG_TeenPatti20_20"), "xpg", provider.enterProvidersName(provider.xpg));
			if(xpg>=2) {
				logStatus("PASS", "XPG_002 Successfully clicked on the Provider Name (XPG) and landed on the XPG page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "XPG_002 Successfully Clicked  on the Provider Name (XPG) but Error appears when the game launched");
			}
			
			//BGAMES PROVIDER
			int bgames = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.Bgames_ClassicRoulette,cricazacasino.Bgames_DiceDuel),
					gamePage.addGameServices("Bgames_ClassicRoulette","Bgames_DiceDuel"), "bgames", provider.enterProvidersName(provider.Bgames));
			if(bgames>=2) {
				logStatus("PASS", "BGAMES_003 Successfully clicked on the Provider Name (BGAMES) and landed on the BGAMES page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "BGAMES_003 Successfully Clicked  on the Provider Name (BGAMES) but Error appears when the game launched");
			}
			
			//VIVO PROVIDER
			int vivo = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.Vivo_LasVegasRoulette,cricazacasino.Vivo_Rapid_AutoRoulette), 
					gamePage.addGameServices("Vivo_LasVegasRoulette","Vivo_Rapid_AutoRoulette"), "vivo", provider.enterProvidersName(provider.vivo));
			if(vivo>=2) {
				logStatus("PASS", "VIVO_004 Successfully clicked on the Provider Name (VIVO) and landed on the VIVO page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "VIVO_004 Successfully Clicked  on the Provider Name (VIVO) but Error appears when the game launched");
			} 
			
			//JACKTOP PROVIDER
			int jacktop = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.JackTop_SteamRoulette,cricazacasino.JackTop_Poker),
					gamePage.addGameServices("JackTop_Baccarat","JackTop_Poker"), "jacktop", provider.enterProvidersName(provider.jacktop));
			if(jacktop>=2) {
				logStatus("PASS", "JACKTOP_005 Successfully clicked on the Provider Name (JACKTOP) and landed on the JACKTOP page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "JACKTOP_005 Successfully Clicked  on the Provider Name (JACKTOP) but Error appears when the game launched");
			}
			
			//BETERLIVE PROVIDER
			int beterlive = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.BeterLive_LiveBaccarat1NC,cricazacasino.BeterLive_LiveFrenchRoulette),
					gamePage.addGameServices("BeterLive_LiveBaccarat1NC","BeterLive_LiveFrenchRoulette"), "softswiss", provider.enterProvidersName(provider.BeterLive));
			if(beterlive>=2) {
				logStatus("PASS", "BETERLIVE_006 Successfully clicked on the Provider Name (BETERLIVE) and landed on the BETERLIVE page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "BETERLIVE_006 Successfully Clicked  on the Provider Name (BETERLIVE) but Error appears when the game launched");
			}
			
			//LIVE88 PROVIDER
			int live88 = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.Live88_BaccaratHighRoller1,cricazacasino.Live88_BombayLiveBarutoBaccarat), 
					gamePage.addGameServices("Live88_BaccaratHighRoller1","Live88_BombayLiveBarutoBaccarat"), "softswiss", provider.enterProvidersName(provider.live88));
			if(live88>=2) {
				logStatus("PASS", "LIVE88_007 Successfully clicked on the Provider Name (LIVE88) and landed on the LIVE88 page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "LIVE88_007 Successfully Clicked  on the Provider Name (LIVE88) but Error appears when the game launched");
			} 
			
			//WINMATCH PROVIDER
			int winmatch = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.Winmatch_RoyalAndarBahar,cricazacasino.Winmatch_RoyalBetonTeenPatti),
					gamePage.addGameServices("Winmatch_RoyalAndarBahar","Winmatch_RoyalBetonTeenPatti"), "livetables", provider.enterProvidersName(provider.Winmatch));
			if(winmatch>=2) {
				logStatus("PASS", "WINMATCH_008 Successfully clicked on the Provider Name (WINMATCH) and landed on the WINMATCH page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "WINMATCH_008 Successfully Clicked  on the Provider Name (WINMATCH) but Error appears when the game launched");
			} 
			
			//EVOLUTION PROVIDER
			int evolution = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.Evulation_FPPersonProsperityTreeBaccarat,cricazacasino.Evolution_StudioRoulette),
					gamePage.addGameServices("Evulation_FPPersonProsperityTreeBaccarat","Evolution_StudioRoulette"), "frontend", provider.enterProvidersName(provider.evolution));
			if(evolution>=2) {
				logStatus("PASS", "EVOLUTION_009 Successfully clicked on the Provider Name (EVOLUTION) and landed on the EVOLUTION page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "EVOLUTION_009 Successfully Clicked  on the Provider Name (EVOLUTION) but Error appears when the game launched");
			} 
			
			//TVBET PROVIDER
			int tvbet = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.TvBet_7Bet,cricazacasino.TvBet_Wheelbet),
					gamePage.addGameServices("TvBet_7Bet","TvBet_Wheelbet"), "tvbet", provider.enterProvidersName(provider.tvbet));
			if(tvbet>=2) {
				logStatus("PASS", "TVBET_010 Successfully clicked on the Provider Name (TVBET) and landed on the TVBET page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "TVBET_010 Successfully Clicked  on the Provider Name (TVBET) but Error appears when the game launched");
			} 
			
			//7MOJOS PROVIDER
			int mojos7 = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.Mojos7_777xGalaxyRoulette,cricazacasino.Mojos7_TeenPattiFaceOff), 
					gamePage.addGameServices("Mojos7_777xGalaxyRoulette","Mojos7_TeenPattiFaceOff"), "7mojos", provider.enterProvidersName(provider.mojos7));
			if(mojos7>=2) {
				logStatus("PASS", "7MOJOS_011 Successfully clicked on the Provider Name (7MOJOS) and landed on the 7MOJOS page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "7MOJOS_011 Successfully Clicked  on the Provider Name (7MOJOS) but Error appears when the game launched");
			} 
			
			//ATMOSPHERA PROVIDER			
			int atmosphera_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.Atmosphera_Keno,gamePage.Atmosphera_LiveRoulette), 
					gamePage.addGameServices("Atmosphera_Keno","Atmosphera_LiveRoulette"), "softswiss", provider.enterProvidersName(provider.atmosphera));
			if(atmosphera_count>=2) {
				logStatus("PASS", "ATMOSPHERA_012 Successfully clicked on the Provider Name (ATMOSPHERA) and landed on the ATMOSPHERA page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "ATMOSPHERA_012 Successfully Clicked  on the Provider Name (ATMOSPHERA) but Error appears when the game launched.");
			}  
			
			//ALG PROVIDER
			int alg = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.ALG_AbsoluteBrown,gamePage.ALG_PortomasoLumia),
					gamePage.addGameServices("ALG_AbsoluteBrown","ALG_PortomasoLumia"), "softswiss", provider.enterProvidersName(provider.ALG));
			if(alg>=2) {
				logStatus("PASS", "ALG_013 Successfully clicked on the Provider Name (ALG) and landed on the ALG page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "ALG_013 Successfully Clicked  on the Provider Name (ALG) but Error appears when the game launched.");
			}  
			
			//LIVESOLUTION PROVIDER
			int liveSolution = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(cricazacasino.Livesolution_Craps,cricazacasino.Livesolution_FanTan), 
					gamePage.addGameServices("Livesolution_Craps","Livesolution_FanTan"), "softswiss", provider.enterProvidersName(provider.livesolutions));
			if(liveSolution>=2) {
				logStatus("PASS", "LIVESOLUTION_014 Successfully clicked on the Provider Name (LIVESOLUTION) and landed on the LIVESOLUTION page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "LIVESOLUTION_014 Successfully Clicked  on the Provider Name (LIVESOLUTION) but Error appears when the game launched.");
			}  
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
