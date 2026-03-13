package com.khelstake.test;

import org.testng.annotations.Test;

import com.khelstake.Demo.BaseTest;
import com.khelstake.Demo.EvenUtils;
import com.khelstake.Demo.WebContants;
import com.khelstake.pages.LoginPages;
import com.khelstake.pages.SloteGamePage;
import com.khelstake.pages.SlotsProviderPage;

public class SpinMatch_Slots_02 extends BaseTest {

	LoginPages loginPage;
	EvenUtils evenutils;
	SlotsProviderPage slotprovider;
	SloteGamePage slotgamePage;
	@Test
	public void validatingSlotsProviderSwnttToOnlyplay() {
		
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
			
			//SWNTT PROVIDER
			int swntt_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Swntt_JadeBladeXtraSplit,slotgamePage.Swntt_WilliamsQuest), 
					slotgamePage.addGameServices("Swntt_JadeBladeXtraSplit","Swntt_WilliamsQuest"), "softswiss", slotprovider.enterProvidersName(slotprovider.Swntt));
			if(swntt_count>=2) {
				logStatus("PASS", "SWNTT_011 Successfully clicked on the Provider Name (SWNTT) and landed on the SWNTT page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "SWNTT_011 Successfully Clicked  on the Provider Name (SWNTT) but Error appears when the game launched.");
			} 
			
			//SPINZA PROVIDER
			int spinza_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Spinza_GoldenDragonMultiHoldandWin,slotgamePage.Spinza_TempleofFortuna),
					slotgamePage.addGameServices("Spinza_GoldenDragonMultiHoldandWin","Spinza_TempleofFortuna"), "softswiss", slotprovider.enterProvidersName(slotprovider.Spinza));
			if(spinza_count>=2) {
				logStatus("PASS", "SPINZA_012 Successfully clicked on the Provider Name (SPINZA) and landed on the SPINZA page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "SPINZA_012 Successfully Clicked  on the Provider Name (SPINZA) but Error appears when the game launched.");
			} 
			
			//REFRANCO PROVIDER
			int refranco_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Refanco_ViralSlot,slotgamePage.Refanco_ZeusStairway),
					slotgamePage.addGameServices("Refanco_ViralSlot","Refanco_ZeusStairway"), "softswiss", slotprovider.enterProvidersName(slotprovider.Rafranco));
			if(refranco_count>=2) {
				logStatus("PASS", "REFRANCO_013 Successfully clicked on the Provider Name (REFRANCO) and landed on the REFRANCO page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "REFRANCO_013 Successfully Clicked  on the Provider Name (REFRANCO) but Error appears when the game launched.");
			} 
			
			//REEVO PROVIDER
			int reevo_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Reevo_AltardeMuertos,slotgamePage.Reevo_CrownHeist), 
					slotgamePage.addGameServices("Reevo_AltardeMuertos","Reevo_CrownHeist"), "softswiss", slotprovider.enterProvidersName(slotprovider.Reevo));
			if(reevo_count>=2) {
				logStatus("PASS", "REEVO_014 Successfully clicked on the Provider Name (REEVO) and landed on the REEVO page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "REEVO_014 Successfully Clicked  on the Provider Name (REEVO) but Error appears when the game launched.");
			} 
			
			//QUICKSPIN PROVIDER
			int quickspin_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.QuickSpin_VampireSenpai,slotgamePage.QuickSpin_WinsofFortune),
					slotgamePage.addGameServices("QuickSpin_VampireSenpai","QuickSpin_WinsofFortune"), "softswiss", slotprovider.enterProvidersName(slotprovider.Quickspin));		
			if(quickspin_count>=2) {
				logStatus("PASS", "QUICKSPIN_015 Successfully clicked on the Provider Name (QUICKSPIN) and landed on the QUICKSPIN page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "QUICKSPIN_015 Successfully Clicked  on the Provider Name (QUICKSPIN) but Error appears when the game launched.");
			} 
			
			//POPIPLAY PROVIDER
			int popiplay_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Popiplay_Ufojoe,slotgamePage.Popiplay_XperimentGold),
					slotgamePage.addGameServices("Popiplay_Ufojoe","Popiplay_XperimentGold"), "softswiss", slotprovider.enterProvidersName(slotprovider.Popiplay));
			if(popiplay_count>=2) {
				logStatus("PASS", "POPIPLAY_016 Successfully clicked on the Provider Name (POPIPLAY) and landed on the POPIPLAY page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "POPIPLAY_016 Successfully Clicked  on the Provider Name (POPIPLAY) but Error appears when the game launched.");
			}
			
			//PLATIPUS PROVIDER
			int platipus_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Platipus_WildSpin,slotgamePage.Platipus_WildSpin), 
					slotgamePage.addGameServices("Platipus_WildSpin","Platipus_WildSpin"), "softswiss", slotprovider.enterProvidersName(slotprovider.Platipus));
			if(platipus_count>=2) {
				logStatus("PASS", "PLATIPUS_017 Successfully clicked on the Provider Name (PLATIPUS) and landed on the PLATIPUS page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "PLATIPUS_017 Successfully Clicked  on the Provider Name (PLATIPUS) but Error appears when the game launched.");
			}
			
			//ORBITAL PROVIDER
			int orbital_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Orbital_Astro,slotgamePage.Orbital_Videopoker),
					slotgamePage.addGameServices("Orbital_Astro","Orbital_Videopoker"), "softswiss", slotprovider.enterProvidersName(slotprovider.Orbital));
			if(orbital_count>=2) {
				logStatus("PASS", "ORBITAL_018 Successfully clicked on the Provider Name (ORBITAL) and landed on the ORBITAL page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "ORBITAL_018 Successfully Clicked  on the Provider Name (ORBITAL) but Error appears when the game launched.");
			}
			
			//ONLYPLAY PROVIDER
			int onlyplay_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.OnlyPlay_JungleGold,slotgamePage.OnlyPlay_TrollDice),
					slotgamePage.addGameServices("OnlyPlay_JungleGold","OnlyPlay_TrollDice"), "softswiss", slotprovider.enterProvidersName(slotprovider.Onlyplay));
			if(onlyplay_count>=2) {
				logStatus("PASS", "ONLYPLAY_019 Successfully clicked on the Provider Name (ONLYPLAY) and landed on the ONLYPLAY page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "ONLYPLAY_019 Successfully Clicked  on the Provider Name (ONLYPLAY) but Error appears when the game launched.");
			}
			
			//ONETOUCH PROVIDER
			int onetouch_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.OneTouch_BlackjackClassic,slotgamePage.OneTouch_CashGalaxy),
					slotgamePage.addGameServices("OneTouch_BlackjackClassic","OneTouch_CashGalaxy"), "softswiss", slotprovider.enterProvidersName(slotprovider.Onetouch));
			if(onetouch_count>=2) {
				logStatus("PASS", "ONETOUCH_020 Successfully clicked on the Provider Name (ONETOUCH) and landed on the ONETOUCH page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "ONETOUCH_020 Successfully Clicked  on the Provider Name (ONETOUCH) but Error appears when the game launched.");
			} 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
