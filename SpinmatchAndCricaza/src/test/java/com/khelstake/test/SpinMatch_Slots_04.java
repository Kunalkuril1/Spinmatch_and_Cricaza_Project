package com.khelstake.test;

import org.testng.annotations.Test;

import com.khelstake.Demo.BaseTest;
import com.khelstake.Demo.EvenUtils;
import com.khelstake.Demo.WebContants;
import com.khelstake.pages.LoginPages;
import com.khelstake.pages.SloteGamePage;
import com.khelstake.pages.SlotsProviderPage;

public class SpinMatch_Slots_04 extends BaseTest {

	LoginPages loginPage;
	EvenUtils evenutils;
	SlotsProviderPage slotprovider;
	SloteGamePage slotgamePage;
	@Test
	public void validatingSlotsProviderKagamingToAlttente() {
		try {
			slotprovider=new SlotsProviderPage(driver);
			slotgamePage=new SloteGamePage(driver);
			loginPage=new LoginPages(driver);
			evenutils=new EvenUtils(driver);

			evenutils.navigateToUrl(WebContants.Spinmatch_url);
			Thread.sleep(5000);
			evenutils.switchToFrame(loginPage.insideframe);
			Thread.sleep(5000);
			evenutils.clickOnElement(loginPage.LoginBtnSpinmatch,"LoginBtnSpinmatch");
			Thread.sleep(3000);
			String spinMatchUser = evenutils.getData("SpinMatchUserName4");
			String spinMatchPass = evenutils.getData("SpinMatchpassword");
			System.out.println(spinMatchUser+"  "+spinMatchPass);
			evenutils.sendValue(loginPage.usreNameInput, spinMatchUser);
			evenutils.sendValue(loginPage.passWordInput, spinMatchPass);
			evenutils.clickOnElement(loginPage.SignInBtn,"SignInBtn");	
			Thread.sleep(5000); 
			evenutils.clickOnElement(loginPage.skipBtn,"skipBtn");
			evenutils.clickOnElement(loginPage.inPlayBtn,"inPlayBtn");
			evenutils.mouseHover(loginPage.LiveCasinoBtn);
			evenutils.clickOnElement(loginPage.SlotsBtn,"SlotsBtn");
			Thread.sleep(5000);	
			
			//KAGAMING PROVIDER
			int kagaming_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.KaGaming_TheMaskofZorro,slotgamePage.KaGaming_X_Bomber), 
					slotgamePage.addGameServices("KaGaming_TheMaskofZorro","KaGaming_X_Bomber"), "softswiss", slotprovider.enterProvidersName(slotprovider.Kagaming));
			if(kagaming_count>=2) {
				logStatus("PASS", "KAGAMING_031 Successfully clicked on the Provider Name (KAGAMING) and landed on the KAGAMING page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "KAGAMING_031 Successfully Clicked  on the Provider Name (KAGAMING) but Error appears when the game launched.");
			} 
			
			//HIGHFIVE PROVIDER
			int highfive_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.HighFive_1000Pearls,slotgamePage.HighFive_BeatTheHouse),
					slotgamePage.addGameServices("HighFive_1000Pearls","HighFive_BeatTheHouse"), "softswiss", slotprovider.enterProvidersName(slotprovider.Highfive));
			if(highfive_count>=2) {
				logStatus("PASS", "HIGHFIVE_032 Successfully clicked on the Provider Name (HIGHFIVE) and landed on the HIGHFIVE page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "HIGHFIVE_032 Successfully Clicked  on the Provider Name (HIGHFIVE) but Error appears when the game launched.");
			} 
			
			//GROOVE PROVIDER
			int groove_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Groove_Spinbox,slotgamePage.Groove_WitcherCave),
					slotgamePage.addGameServices("Groove_Spinbox","Groove_WitcherCave"), "softswiss", slotprovider.enterProvidersName(slotprovider.Groove));
			if(groove_count>=2) {
				logStatus("PASS", "GROOVE_033 Successfully clicked on the Provider Name (GROOVE) and landed on the GROOVE page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "GROOVE_033 Successfully Clicked  on the Provider Name (GROOVE) but Error appears when the game launched.");
			} 
			
			//GAMEART PROVIDER
			int gameart_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.GameArt_StarCash,slotgamePage.GameArt_XtremeSummerHot),
					slotgamePage.addGameServices("GameArt_StarCash","GameArt_XtremeSummerHot"), "softswiss", slotprovider.enterProvidersName(slotprovider.Gameart));
			if(gameart_count>=2) {
				logStatus("PASS", "GAMEART_034 Successfully clicked on the Provider Name (GAMEART) and landed on the GAMEART page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "GAMEART_034 Successfully Clicked  on the Provider Name (GAMEART) but Error appears when the game launched.");
			} 
			
			//FANTASMA PROVIDER
			int fantasma_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Fantasma_24StarsDream,slotgamePage.Fantasma_WinsofNautilus),
					slotgamePage.addGameServices("Fantasma_24StarsDream","Fantasma_WinsofNautilus"), "softswiss", slotprovider.enterProvidersName(slotprovider.Fantasma));
			if(fantasma_count>=2) {
				logStatus("PASS", "FANTASMA_035 Successfully clicked on the Provider Name (FANTASMA) and landed on the FANTASMA page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "FANTASMA_035 Successfully Clicked  on the Provider Name (FANTASMA) but Error appears when the game launched.");
			} 
			
			//EVERYMATRIX PROVIDER
			int everyMatrix_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.EveryMatrix_MuertitosVideoBingo,slotgamePage.EveryMatrix_WildsOfWallStreetII),
					slotgamePage.addGameServices("EveryMatrix_MuertitosVideoBingo","EveryMatrix_WildsOfWallStreetII"), "softswiss", slotprovider.enterProvidersName(slotprovider.Everymatrix));
			if(everyMatrix_count>=2) {
				logStatus("PASS", "EVERYMATRIX_036 Successfully clicked on the Provider Name (EVERYMATRIX) and landed on the EVERYMATRIX page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "EVERYMATRIX_036 Successfully Clicked  on the Provider Name (EVERYMATRIX) but Error appears when the game launched.");
			} 
			
			//EAGAMING PROVIDER
			int eaGaming_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.EaGaming_Shaolin,slotgamePage.EaGaming_Yggdrasil),
					slotgamePage.addGameServices("EaGaming_Shaolin","EaGaming_Yggdrasil"), "softswiss", slotprovider.enterProvidersName(slotprovider.Eagaming));
			if(eaGaming_count>=2) {
				logStatus("PASS", "EAGAMING_037 Successfully clicked on the Provider Name (EAGAMING) and landed on the EAGAMING page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "EAGAMING_037 Successfully Clicked  on the Provider Name (EAGAMING) but Error appears when the game launched.");
			} 
			
			//BSG PROVIDER
			int bsg_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.BSG_TycoonsPlus,slotgamePage.BSG_YakYetiRoll),
					slotgamePage.addGameServices("BSG_TycoonsPlus","BSG_YakYetiRoll"), "softswiss", slotprovider.enterProvidersName(slotprovider.Bsg));
			if(bsg_count>=2) {
				logStatus("PASS", "BSG_038 Successfully clicked on the Provider Name (BSG) and landed on the BSG page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "BSG_038 Successfully Clicked  on the Provider Name (BSG) but Error appears when the game launched.");
			}  
			
			//BET2TECH PROVIDER
			int bet2Tech_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Bet2Tech_MonkeyBar,slotgamePage.Bet2Tech_100Monkeys),
					slotgamePage.addGameServices("Bet2Tech_MonkeyBar","Bet2Tech_100Monkeys"), "softswiss", slotprovider.enterProvidersName(slotprovider.Bet2tech));
			if(bet2Tech_count>=2) {
				logStatus("PASS", "BET2TECH_039 Successfully clicked on the Provider Name (BET2TECH) and landed on the BET2TECH page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "BET2TECH_039 Successfully Clicked  on the Provider Name (BET2TECH) but Error appears when the game launched.");
			} 
			
			//ALTENTE PROVIDER
			int altente_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Atlente_LuckyTurn,slotgamePage.Atlente_WildGemZ), 
					slotgamePage.addGameServices("Atlente_LuckyTurn","Atlente_WildGemZ"), "softswiss", slotprovider.enterProvidersName(slotprovider.Altente));
			if(altente_count>=2) {
				logStatus("PASS", "ALTENTE_040 Successfully clicked on the Provider Name (ALTENTE) and landed on the ALTENTE page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "ALTENTE_040 Successfully Clicked  on the Provider Name (ALTENTE) but Error appears when the game launched.");
			} 
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
