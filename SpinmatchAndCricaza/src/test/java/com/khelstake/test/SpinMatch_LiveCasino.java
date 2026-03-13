package com.khelstake.test;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.khelstake.Demo.BaseTest;
import com.khelstake.Demo.EvenUtils;
import com.khelstake.Demo.WebContants;
import com.khelstake.pages.GamesPage;
import com.khelstake.pages.LoginPages;
import com.khelstake.pages.ProviderPage;

public class SpinMatch_LiveCasino extends BaseTest {

	LoginPages loginPage;
	EvenUtils evenutils;
	ProviderPage provider;
	GamesPage gamePage;

	@Test
	public void validating_All_Provider() {

		try {
			provider=new ProviderPage(driver);
			gamePage=new GamesPage(driver);
			loginPage=new LoginPages(driver);
			evenutils=new EvenUtils(driver);
			evenutils.navigateToUrl(WebContants.Spinmatch_url);
			//Thread.sleep(5000);
			evenutils.switchToFrame(loginPage.insideframe);
			Thread.sleep(3000);
			evenutils.clickOnElement(loginPage.LoginBtnSpinmatch,"LoginBtnSpinmatch");
			Thread.sleep(3000);
			//	String spinMatchUser = evenutils.getData("SpinMatchUserName4");
			//	String spinMatchPass = evenutils.getData("SpinMatchpassword");
			String spinMatchUser=evenutils.getDataFromexcel(2, 0);
			String spinMatchPass =evenutils.getDataFromexcel(2, 1);		
			System.out.println(spinMatchUser+"  "+spinMatchPass);
			evenutils.sendValue(loginPage.usreNameInput, spinMatchUser);
			evenutils.sendValue(loginPage.passWordInput, spinMatchPass);
			evenutils.clickOnElement(loginPage.SignInBtn,"SignInBtn");	
			Thread.sleep(5000); 
			evenutils.clickOnElement(loginPage.skipBtn,"skipBtn");
			evenutils.clickOnElement(loginPage.inPlayBtn,"inPlayBtn");
			evenutils.mouseHover(loginPage.LiveCasinoBtn);
			evenutils.clickOnElement(loginPage.LiveCasinoBtn,"LiveCasinoBtn");
			Thread.sleep(5000);	


			//EZUGI PROVIDER
			int ezugi_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.Ezugi_NoCommissionBaccaratB,gamePage.Ezugi_SkylineRoulette), 
					gamePage.addGameServices("Ezugi_NoCommissionBaccaratB","Ezugi_SkylineRoulette"), "table_id", provider.enterProvidersName(provider.ezugi));
			if(ezugi_count>=2) {
				logStatus("PASS", "EZUGI_001 Successfully clicked on the Provider Name (EZUGI) and landed on the EZUGI page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "EZUGI_001 Successfully Clicked  on the Provider Name (EZUGI) but Error appears when the game launched.");
			}	

			//XPG PROVIDER
			int xpg_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.XPG_Teenpatti2020,gamePage.XPG_ThunderRoulette), 
					gamePage.addGameServices("XPG_Teenpatti2020","XPG_ThunderRoulette"), "xpg", provider.enterProvidersName(provider.xpg));
			if(xpg_count>=2) {
				logStatus("PASS", "XPG_002 Successfully clicked on the Provider Name (XPG) and landed on the XPG page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "XPG_002 Successfully Clicked  on the Provider Name (XPG) but Error appears when the game launched.");
			}

			//BGAMES PROVIDER
			int bgames_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.Bgames_Skyward,gamePage.Bgames_WarOfBets),
					gamePage.addGameServices("Bgames_Skyward","Bgames_WarOfBets"), "bgames",provider.enterProvidersName(provider.Bgames));			
			if(bgames_count>=2) {
				logStatus("PASS", "BGAMES_003 Successfully clicked on the Provider Name (BGAMES) and landed on the Bgames page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "BGAMES_003 Successfully Clicked  on the Provider Name (BGAMES) but Error appears when the game launched");
			}

			//VIVO PROVIDER 
			int vivo_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.Vivo_AndarBaharDoubleUp,gamePage.Vivo_FrancaisBelleRoulette),
					gamePage.addGameServices("Vivo_AndarBaharDoubleUp","Vivo_FrancaisBelleRoulette"), "vivo", provider.enterProvidersName(provider.vivo));		
			if(vivo_count>=2) {
				logStatus("PASS", "VIVO_004 Successfully clicked on the Provider Name (VIVO) and landed on the VIVO page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "VIVO_004 Successfully Clicked  on the Provider Name (VIVO) but Error appears when the game launched.");
			}  

			//JACKTOP PROVIDER
			int jacktop_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.Jacktop_BlackJack,gamePage.Jacktop_SteamRoulette),
					gamePage.addGameServices("Jacktop_BlackJack","Jacktop_SteamRoulette"), "web.jacktop.win", provider.enterProvidersName(provider.jacktop));

			if(jacktop_count>=2) {
				logStatus("PASS", "	JACKTOP_005 Successfully clicked on the Provider Name (JACKTOP) and landed on the JACKTOP page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "JACKTOP_005 Successfully Clicked  on the Provider Name (JACKTOP) but Error appears when the game launched.");  

			}  

			//BETERLIVE PROVIDER
			int beterLiveCount = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.BeterLive_GravityBlackjack,gamePage.BeterLive_SicBo), 
					gamePage.addGameServices("BeterLive_Gravitylackjack","BeterLive_SicBo"), "softswiss",provider.enterProvidersName(provider.BeterLive));
			if(beterLiveCount>=2) {
				logStatus("PASS", "BETERLIVE_006 Successfully clicked on the Provider Name (BETERLIVE) and landed on the Beterlive page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "BETERLIVE_006 Successfully Clicked  on the Provider Name (BETERLIVE) but Error appears when the game launched");
			}

			//LIVE88 PROVIDER
			int live88_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.Live88_ABaccaratHighRoller1,gamePage.Live88_AutoRoulette1),
					gamePage.addGameServices("Live88_ABaccaratHighRoller1","Live88_AutoRoulette1"), "softswiss", provider.enterProvidersName(provider.live88));
			if(live88_count>=2) {
				logStatus("PASS", "LIVE88_007 Successfully clicked on the Provider Name (LIVE88) and landed on the LIVE88 page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "LIVE88_007 Successfully Clicked  on the Provider Name (LIVE88) but Error appears when the game launched.");
			}  

			//WINMATCH PROVIDER
			int winmatch_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.WinMatch_Roulette,gamePage.WinMatch_Teenpatti), 
					gamePage.addGameServices("WinMatch_Roulette","WinMatch_Teenpatti"), "livetables", provider.enterProvidersName(provider.Winmatch));
			if(winmatch_count>=2) {
				logStatus("PASS", "WINMATCH_008 Successfully clicked on the Provider Name (WINMATCH) and landed on the WINMATCH page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "WINMATCH_008 Successfully Clicked  on the Provider Name (WINMATCH) but Error appears when the game launched.");
			}

			//EVOLUTION PROVIDER
			int evolution_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.Evulation_BlackjackVIPT,gamePage.Evulation_RedDoorRoulette), 
					gamePage.addGameServices("Evulation_BlackjackVIPT","Evulation_RedDoorRoulette"), "frontend", provider.enterProvidersName(provider.evolution));
			if(evolution_count>=2) {
				logStatus("PASS", "EVOLUTION_009 Successfully clicked on the Provider Name (EVOLUTION) and landed on the EVOLUTION page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "EVOLUTION_009 Successfully Clicked  on the Provider Name (EVOLUTION) but Error appears when the game launched.");
			} 

			//TVBET PROVIDER
			int tvbet_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.TVBet_5Bet,gamePage.TVBet_FastKeno),
					gamePage.addGameServices("TVBet_5Bet","TVBet_FastKeno"), "tvbet", provider.enterProvidersName(provider.tvbet));
			if(tvbet_count>=2) {
				logStatus("PASS", "TVBET_010 Successfully clicked on the Provider Name (TVBET) and landed on the TVBET page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "TVBET_010 Successfully Clicked  on the Provider Name (TVBET) but Error appears when the game launched.");
			} 

			//7MOJOS PROVIDER
			int mojo7_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.Mojos7_DiamondVIPRoulette,gamePage.Mojos7_TeenPattiFaceOff), 
					gamePage.addGameServices("Mojos7_DiamondVIPRoulette","Mojos7_TeenPattiFaceOff"), "7mojos", provider.enterProvidersName(provider.mojos7));		
			if(mojo7_count>=2) {
				logStatus("PASS", "7MOJO_011 Successfully clicked on the Provider Name (7MOJO) and landed on the 7MOJO page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "7MOJO_011 Successfully Clicked  on the Provider Name (7MOJO) but Error appears when the game launched.");
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
			int alg_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.ALG_AbsoluteBrown,gamePage.ALG_PortomasoLumia),
					gamePage.addGameServices("ALG_AbsoluteBrown","ALG_PortomasoLumia"), "softswiss", provider.enterProvidersName(provider.ALG));
			if(alg_count>=2) {
				logStatus("PASS", "ALG_013 Successfully clicked on the Provider Name (ALG) and landed on the ALG page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "ALG_013 Successfully Clicked  on the Provider Name (ALG) but Error appears when the game launched.");
			} 	

			//LIVESOLUTION PROVIDER
			int livesolutions_count = loginPage.verifyGameServices(driver, gamePage.addProviderGameServices(gamePage.Livesolution_BlackjackEuro,gamePage.Livesolution_FanTan), 
					gamePage.addGameServices("Livesolution_BlackjackEuro","Livesolution_FanTan"), "softswiss", provider.enterProvidersName(provider.livesolutions));
			if(livesolutions_count>=2) {
				logStatus("PASS", "LIVESOLUTION_014 Successfully clicked on the Provider Name (LIVESOLUTION) and landed on the LIVESOLUTION page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "LIVESOLUTION_014 Successfully Clicked  on the Provider Name (LIVESOLUTION) but Error appears when the game launched.");
			}   

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}












}
