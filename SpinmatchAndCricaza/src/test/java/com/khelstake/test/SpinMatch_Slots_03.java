package com.khelstake.test;

import org.testng.annotations.Test;

import com.khelstake.Demo.BaseTest;
import com.khelstake.Demo.EvenUtils;
import com.khelstake.Demo.WebContants;
import com.khelstake.pages.LoginPages;
import com.khelstake.pages.SloteGamePage;
import com.khelstake.pages.SlotsProviderPage;

public class SpinMatch_Slots_03 extends BaseTest {
		
	LoginPages loginPage;
	EvenUtils evenutils;
	SlotsProviderPage slotprovider;
	SloteGamePage slotgamePage;
	@Test
	public void validatingSlotsProviderNucleusToKiran() {
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
			
			//NUCLEUS PROVIDER
			int nucleus_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Nucleus_PeakRiches,slotgamePage.Nucleus_WinterChamps),
					slotgamePage.addGameServices("Nucleus_PeakRiches","Nucleus_WinterChamps"), "softswiss", slotprovider.enterProvidersName(slotprovider.Nucleus));
			if(nucleus_count>=2) {
				logStatus("PASS", "NUCLEUS_021 Successfully clicked on the Provider Name (NUCLEUS) and landed on the NUCLEUS page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "NUCLEUS_021  Successfully Clicked  on the Provider Name (NUCLEUS) but Error appears when the game launched.");
			} 
			
			//NETGAME PROVIDER
			int netent_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.NetGame_MysteryDragons,slotgamePage.NetGame_VolcanoFruits),
					slotgamePage.addGameServices("NetGame_MysteryDragons","NetGame_VolcanoFruits"), "softswiss", slotgamePage.addProviderGameServices(slotprovider.Netgame));
			if(netent_count>=2) {
				logStatus("PASS", "NETGAME_022 Successfully clicked on the Provider Name (NETGAME) and landed on the NETGAME page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "NETGAME_022 Successfully Clicked  on the Provider Name (NETGAME) but Error appears when the game launched.");
			} 
			
			//MRSLOTTY PROVIDER
			int mrs_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.MRSlotty_VeryHot20,slotgamePage.MRSlotty_Yggdrasil),
					slotgamePage.addGameServices("MRSlotty_VIPRoulette","MRSlotty_Yggdrasil"), "softswiss", slotprovider.enterProvidersName(slotprovider.Mrslotty));
			if(mrs_count>=2) {
				logStatus("PASS", "MRSLOTTY_023 Successfully clicked on the Provider Name (MRSLOTTY) and landed on the MRSLOTTY page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "MRSLOTTY_023 Successfully Clicked  on the Provider Name (MRSLOTTY) but Error appears when the game launched.");
			} 
			
			//MPLAY PROVIDER
			int mplay_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.MPlay_WildWestMystery,slotgamePage.MPlay_IndianT20League),
					slotgamePage.addGameServices("MPlay_WildWestMystery","MPlay_IndianT20League"), "softswiss", slotprovider.enterProvidersName(slotprovider.Mplay));
			if(mplay_count>=2) {
				logStatus("PASS", "MPLAY_024 Successfully clicked on the Provider Name (MPLAY) and landed on the MPLAY page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "MPLAY0_24 Successfully Clicked  on the Provider Name (MPLAY) but Error appears when the game launched.");
			} 
			
			//MGAGAMES PROVIDER
			int mgagame_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.MGAGame_YolaBerrocalWildWest,slotgamePage.MGAGame_SandroRey),
					slotgamePage.addGameServices("MGAGame_YolaBerrocalWildWest","MGAGame_SandroRey"), "softswiss", slotprovider.enterProvidersName(slotprovider.Mgagames));
			if(mgagame_count>=2) {
				logStatus("PASS", "MGAGAMES_025 Successfully clicked on the Provider Name (MGAGAMES) and landed on the MGAGAMES page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "MGAGAMES_025 Successfully Clicked  on the Provider Name (MGAGAMES) but Error appears when the game launched.");
			} 
			
			//MERKUR PROVIDER
			int merkur_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Merkur_BlazingStar,slotgamePage.Merkur_SavannaStampede),
					slotgamePage.addGameServices("Merkur_BlazingStar","Merkur_SavannaStampede"), "softswiss", slotprovider.enterProvidersName(slotprovider.Merkur));
			if(merkur_count>=2) {
				logStatus("PASS", "MERKUR0_26 Successfully clicked on the Provider Name (MERKUR) and landed on the MERKUR page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "MERKUR0_26 Successfully Clicked  on the Provider Name (MERKUR) but Error appears when the game launched.");
			} 
			
			//MASCOT PROVIDER
			int mascot_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Mascot_RedHorde,slotgamePage.Mascot_ZeustheThunderer),
					slotgamePage.addGameServices("Mascot_RedHorde","Mascot_ZeustheThunderer"), "softswiss", slotprovider.enterProvidersName(slotprovider.Mascot));
			if(mascot_count>=2) {
				logStatus("PASS", "MASCOT_027 Successfully clicked on the Provider Name (MASCOT) and landed on the MASCOT page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "MASCOT_027 Successfully Clicked  on the Provider Name (MASCOT) but Error appears when the game launched.");
			} 
			
			//MANCHALA PROVIDER
			int manchala_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Manchala_CocoTiki,slotgamePage.Manchala_PortalMaster),
					slotgamePage.addGameServices("Manchala_CocoTiki","Manchala_PortalMaster"), "softswiss", slotprovider.enterProvidersName(slotprovider.Mancala));
			if(manchala_count>=2) {
				logStatus("PASS", "MANCHALA_028 Successfully clicked on the Provider Name (MANCHALA) and landed on the MANCHALA page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "MANCHALA_028 Successfully Clicked  on the Provider Name (MANCHALA) but Error appears when the game launched.");
			} 
			
			//LUCKY PROVIDER
			int lucky_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Lucky_PreciousEgypt,slotgamePage.Lucky_Zilionaire), 
					slotgamePage.addGameServices("Lucky_PreciousEgypt","Lucky_Zilionaire"), "softswiss", slotprovider.enterProvidersName(slotprovider.Lucky));
			if(lucky_count>=2) {
				logStatus("PASS", "LUCKY_029 Successfully clicked on the Provider Name (LUCKY) and landed on the LUCKY page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "LUCKY_029 Successfully Clicked  on the Provider Name (LUCKY) but Error appears when the game launched.");
			} 
			
			//KIRON PROVIDER
			int kiron_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Kiran_Keno,slotgamePage.Kiran_SpanishFasteagueFootballSingle), 
					slotgamePage.addGameServices("Kiran_DashingDerby","Kiran_SpanishFasteagueFootballSingle"), "softswiss", slotprovider.enterProvidersName(slotprovider.kiron));
			if(kiron_count>=2) {
				logStatus("PASS", "KIRON_030 Successfully clicked on the Provider Name (KIRON) and landed on the KIRON page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "KIRON_030 Successfully Clicked  on the Provider Name (KIRON) but Error appears when the game launched.");
			} 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
