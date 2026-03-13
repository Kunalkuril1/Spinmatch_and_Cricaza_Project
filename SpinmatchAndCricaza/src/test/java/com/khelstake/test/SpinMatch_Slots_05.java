package com.khelstake.test;

import org.testng.annotations.Test;

import com.khelstake.Demo.BaseTest;
import com.khelstake.Demo.EvenUtils;
import com.khelstake.Demo.WebContants;
import com.khelstake.pages.LoginPages;
import com.khelstake.pages.SloteGamePage;
import com.khelstake.pages.SlotsProviderPage;

public class SpinMatch_Slots_05 extends BaseTest {
	LoginPages loginPage;
	EvenUtils evenutils;
	SlotsProviderPage slotprovider;
	SloteGamePage slotgamePage;
	@Test
	public void validatingSlotsProviderLast() {
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
			
			//1SPIN4WIN PROVIDER
			int OneSpin_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.OneSpinWin_LuckyXmas20,slotgamePage.OneSpinWin_WolfSpins243), 
					slotgamePage.addGameServices("OneSpinWin_LuckyXmas20","OneSpinWin_WolfSpins243"), "softswiss", slotprovider.enterProvidersName(slotprovider.Onespin4win));
			if(OneSpin_count>=2) {
				logStatus("PASS", "1SPIN4WIN_041 Successfully clicked on the Provider Name (1SPIN4WIN) and landed on the 1SPIN4WIN page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "1SPIN4WIN_041 Successfully Clicked  on the Provider Name (1SPIN4WIN) but Error appears when the game launched.");
			} 
			
			//KALAMBA PROVIDER
			int kalamba_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Kalamba_SadieSwiftGunsandGlyphs,slotgamePage.Kalamba_ZombieQueen), 
					slotgamePage.addGameServices("Kalamba_SadieSwiftGunsandGlyphs","Kalamba_ZombieQueen"), "softswiss", slotprovider.enterProvidersName(slotprovider.Kalamba));
			if(kalamba_count>=2) {
				logStatus("PASS", "KALAMBA_042 Successfully clicked on the Provider Name (KALAMBA) and landed on the KALAMBA page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "KALAMBA_042 Successfully Clicked  on the Provider Name (KALAMBA) but Error appears when the game launched.");
			} 
			
			//JADERABBIT PROVIDER
			int jaderabbit_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.JadeRabbit_ReelHolidays,slotgamePage.JadeRabbit_WordofThoth),
					slotgamePage.addGameServices("JadeRabbit_ReelHolidays","JadeRabbit_WordofThoth"), "softswiss", slotprovider.enterProvidersName(slotprovider.Jaderabbit));
			if(jaderabbit_count>=2) {
				logStatus("PASS", "JADERABBIT_043 Successfully clicked on the Provider Name (JADERABBIT) and landed on the JADERABBIT page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "JADERABBIT_043 Successfully Clicked  on the Provider Name (JADERABBIT) but Error appears when the game launched.");
			} 
			
			//HABANERO PROVIDER
			int habaNero_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Habanero_ThreeCardPokerDeluxe,slotgamePage.Habanero_Zeus),
					slotgamePage.addGameServices("Habanero_ThreeCardPokerDeluxe","Habanero_Zeus"), "softswiss", slotprovider.enterProvidersName(slotprovider.Habanero));
			if(habaNero_count>=2) {
				logStatus("PASS", "HABANERO_044 Successfully clicked on the Provider Name (HABANERO) and landed on the HABANERO page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "HABANERO_044 Successfully Clicked  on the Provider Name (HABANERO) but Error appears when the game launched.");
			} 
			
			//GAMGIX PROVIDER
			int gamix_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Gamzix_PilotCup,slotgamePage.Gamzix_WonHundred),
					slotgamePage.addGameServices("Gamzix_PilotCup","Gamzix_WonHundred"), "softswiss", slotprovider.enterProvidersName(slotprovider.Gamzix));
			if(gamix_count>=2) {
				logStatus("PASS", "GAMGIX_045 Successfully clicked on the Provider Name (GAMGIX) and landed on the GAMGIX page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "GAMGIX_045 Successfully Clicked  on the Provider Name (GAMGIX) but Error appears when the game launched.");
			}  
			
			//FAZI PROVIDER
			int fazi_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Fazi_10WildCrown,slotgamePage.Fazi_40CloverFire),
					slotgamePage.addGameServices(slotgamePage.addGameServices("Fazi_10WildCrown","Fazi_40CloverFire")), "softswiss", slotprovider.enterProvidersName(slotprovider.Fazi));
			if(fazi_count>=2) {
				logStatus("PASS", "FAZI_046 Successfully clicked on the Provider Name (FAZI) and landed on the FAZI page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "FAZI_046 Successfully Clicked  on the Provider Name (FAZI) but Error appears when the game launched.");
			} 
			
			//EVOPLAY PROVIDER
			int evoplay_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Evoplay_TripleChili,slotgamePage.Evoplay_XmasKenoCat), 
					slotgamePage.addGameServices("Evoplay_TripleChili","Evoplay_XmasKenoCat"), "softswiss", slotprovider.enterProvidersName(slotprovider.Evoplay));
			if(evoplay_count>=2) {
				logStatus("PASS", "EVOPLAY_047 Successfully clicked on the Provider Name (EVOPLAY) and landed on the EVOPLAY page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "EVOPLAY_047 Successfully Clicked  on the Provider Name (EVOPLAY) but Error appears when the game launched.");
			} 
			
			//ENDORPHINA PROVIDER
			int endorphina_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Endorphina_SparklingFresh,slotgamePage.Endorphina_WildFruits),
					slotgamePage.addGameServices("Endorphina_SparklingFresh","Endorphina_WildFruits"), "softswiss", slotprovider.enterProvidersName(slotprovider.Endorphina));
			if(endorphina_count>=2) {
				logStatus("PASS", "ENDORPHINA_048 Successfully clicked on the Provider Name (ENDORPHINA) and landed on the ENDORPHINA page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "ENDORPHINA_048 Successfully Clicked  on the Provider Name (ENDORPHINA) but Error appears when the game launched.");
			} 
			
			//CLOWBUSTER PROVIDER
			int clowbuster_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Clowbuster_CandyClaw,slotgamePage.Clowbuster_WildWestClawx5500),
					slotgamePage.addGameServices("Clowbuster_CandyClaw","Clowbuster_WildWestClawx5500"), "softswiss", slotprovider.enterProvidersName(slotprovider.Clawbuster));
			if(clowbuster_count>=2) {
				logStatus("PASS", "CLOWBUSTER_049 Successfully clicked on the Provider Name (CLOWBUSTER) and landed on the CLOWBUSTER page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "CLOWBUSTER_049 Successfully Clicked  on the Provider Name (CLOWBUSTER) but Error appears when the game launched.");
			} 
			
			//BGAMING PROVIDER
			int bgaming_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Bagaming_WestTown,slotgamePage.Bagaming_Plinko), 
					slotgamePage.addGameServices("Bagaming_WestTown","Bagaming_Plinko"), "softswiss", slotprovider.enterProvidersName(slotprovider.Bgaming));
			if(bgaming_count>=2) {
				logStatus("PASS", "BGAMING_050 Successfully clicked on the Provider Name (BGAMING) and landed on the BGAMING page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "BGAMING_050 Successfully Clicked  on the Provider Name (BGAMING) but Error appears when the game launched.");
			} 
			
			//BELATRA PROVIDER
			loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Belatra_ZombieTown,slotgamePage.Belatra_SicBo),
					slotgamePage.addGameServices("Belatra_ZombieTown","Belatra_SicBo"), "softswiss", slotprovider.enterProvidersName(slotprovider.Belatra));
			if(bgaming_count>=2) {
				logStatus("PASS", "BELATRA_051 Successfully clicked on the Provider Name (BELATRA) and landed on the BELATRA page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "BELATRA_051 Successfully Clicked  on the Provider Name (BELATRA) but Error appears when the game launched.");
			} 
			
			//5MEN PROVIDER
			int fivemen_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.FiveMen_SnakesToads,slotgamePage.FiveMen_Woland), 
					slotgamePage.addGameServices("FiveMen_SnakesToads","FiveMen_Woland"), "softswiss", slotprovider.enterProvidersName(slotprovider.Fivemen));
			if(fivemen_count>=2) {
				logStatus("PASS", "5MEN_052 Successfully clicked on the Provider Name (5MEN) and landed on the 5MEN page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "5MEN_052 Successfully Clicked  on the Provider Name (5MEN) but Error appears when the game launched.");
			} 
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
