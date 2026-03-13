package com.khelstake.test;

import org.testng.annotations.Test;

import com.khelstake.Demo.BaseTest;
import com.khelstake.Demo.EvenUtils;
import com.khelstake.Demo.WebContants;
import com.khelstake.pages.GamesPage;
import com.khelstake.pages.LoginPages;
import com.khelstake.pages.ProviderPage;
import com.khelstake.pages.SloteGamePage;
import com.khelstake.pages.SlotsProviderPage;

public class SpinMatch_Slots_01 extends BaseTest{

	LoginPages loginPage;
	EvenUtils evenutils;
	SlotsProviderPage slotprovider;
	SloteGamePage slotgamePage;

	@Test
	public void validatingSlotsProviderSpribeToTechnology() {

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
			
			//SPIRBE PROVIDER
			int spirbe_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Spribe_Dice,slotgamePage.Spribe_Hotline),
				slotgamePage.addGameServices("Spribe_Dice","Spribe_Hotline"), "spribegaming", slotprovider.enterProvidersName(slotprovider.spribe));
			if(spirbe_count>=2) {
				logStatus("PASS", "SPIRBE_001 Successfully clicked on the Provider Name (SPIRBE) and landed on the SPIRBE page and Successfully launch the Casino games.");
			}else {
				logStatus("FAIL", "SPIRBE_001 Successfully Clicked  on the Provider Name (SPIRBE) but Error appears when the game launched.");
			} 
			
			//PGSOFT PROVIDER
			int pgsoft_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Pgsoft_GaneshaFortune,slotgamePage.Pgsoft_RiseofApollo),
					slotgamePage.addGameServices("Pgsoft_GaneshaFortune","Pgsoft_RiseofApollo"), "index", slotprovider.enterProvidersName(slotprovider.pgsoft));
			if(pgsoft_count>=2) {
				logStatus("PASS", "PGSOFT_002 Successfully clicked on the Provider Name (PGSOFT) and landed on the PGSOFT page and Successfully launch the Casino games.");
			}else {
				logStatus("FAIL", "PGSOFT_002 Successfully Clicked  on the Provider Name (PGSOFT) but Error appears when the game launched.");
			}
			
			//REDTIGER PROVIDER
			int redTiger_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.RedTiger_VickyVentura,slotgamePage.RedTiger_WinterWonders), 
					slotgamePage.addGameServices("RedTiger_VickyVentura","RedTiger_WinterWonders"), "frontend", slotprovider.enterProvidersName(slotprovider.RedTiger));
			if(redTiger_count>=2) {
				logStatus("PASS", "REDTIGER_003 Successfully clicked on the Provider Name (REDTIGER) and landed on the REDTIGER page and Successfully launch the Casino games.");
			}else {
				logStatus("FAIL", "REDTIGER_003 Successfully Clicked  on the Provider Name (REDTIGER) but Error appears when the game launched.");
			}
			
			//NETENT PROVIDER
			int netent_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Netent_WolfCub,slotgamePage.Netent_SuperStriker),
					slotgamePage.addGameServices("Netent_Wol fCub","Netent_Super Striker"), "frontend", slotprovider.enterProvidersName(slotprovider.NetEnt));
			if(netent_count>=2) {
				logStatus("PASS", "NETENT_004 Successfully clicked on the Provider Name (NETENT) and landed on the REDTIGER page and Successfully launch the Casino games.");
			}else {
				logStatus("FAIL", "NETENT_004 Successfully Clicked  on the Provider Name (NETENT) but Error appears when the game launched.");
			}
			
			//7MOJOS PROVIDER
			int mojos7_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Mojos7_SugarCrush,slotgamePage.Mojos7_40HotTwist),
					slotgamePage.addGameServices("Mojos7_Sugar Crush","Mojos7_40Hot Twist"), "7mojos", slotprovider.enterProvidersName(slotprovider.mojos7));
			if(mojos7_count>=2) {
				logStatus("PASS", "7MOJOS_005 Successfully clicked on the Provider Name (7MOJOS) and landed on the 7MOJOS page and Successfully launch the Casino games.");
			}else {
				logStatus("FAIL", "7MOJOS_005 Successfully Clicked  on the Provider Name (NETENT) but Error appears when the game launched.");
			}
			
			//ZILLION PROVIDER
			int zillion_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Zillio_FruitsFiveLines,slotgamePage.Zillion_40HotTwist), 
					slotgamePage.addGameServices("Zillio_Fruits FiveLines","Zillion_40HotTwist"), "softswiss", slotprovider.enterProvidersName(slotprovider.zillion));
			if(zillion_count>=2) {
				logStatus("PASS", "ZILLION_006 Successfully clicked on the Provider Name (ZILLION) and landed on the ZILLION page and Successfully launch the Casino games.");
			}else {
				logStatus("FAIL", "ZILLION_006 Successfully Clicked  on the Provider Name (ZILLION) but Error appears when the game launched.");
			}
			
			//WAZDAN PROVIDER
			int wazdan_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Wazdan_Valhalla,slotgamePage.Wazdan_WildJack81), 
					slotgamePage.addGameServices("Wazdan_Valhalla","Wazdan_WildJack81"), "softswiss", slotprovider.enterProvidersName(slotprovider.wazdan));
			if(wazdan_count>=2) {
				logStatus("PASS", "WAZDAN_007 Successfully clicked on the Provider Name (WAZDAN) and landed on the WAZDAN page and Successfully launch the Casino games.");
			}else {
				logStatus("FAIL", "WAZDAN_007 Successfully Clicked  on the Provider Name (WAZDAN) but Error appears when the game launched.");
			}
			
			//VIBRAGAMING PROVIDING
			int vibragaming_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Vibragaming_Bingo3,slotgamePage.Vibragaming_Pachinko3), 
					slotgamePage.addGameServices("Vibragaming_Bingo3","Vibragaming_Pachinko3"), "softswiss", slotprovider.enterProvidersName(slotprovider.vibragaming));
			if(vibragaming_count>=2) {
				logStatus("PASS", "VIBRAGAMING_008 Successfully clicked on the Provider Name (VIBRAGAMING) and landed on the VIBRAGAMING page and Successfully launch the Casino games.");
			}else {
				logStatus("FAIL", "VIBRAGAMING_008 Successfully Clicked  on the Provider Name (VIBRAGAMING) but Error appears when the game launched.");
			}
			
			//TURBOGAMES PROVIDER
			int turbogames_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Turbogames_WicketBlast,slotgamePage.Turbogames_Neko),
					slotgamePage.addGameServices("Turbogames_WicketBlast","Turbogames_Neko"), "softswiss", slotprovider.enterProvidersName(slotprovider.turbogames));
			if(turbogames_count>=2) {
				logStatus("PASS", "TURBOGAMES_009 Successfully clicked on the Provider Name (TURBOGAMES) and landed on the TURBOGAMES page and Successfully launch the Casino games.");
			}else {
				logStatus("FAIL", "TURBOGAMES_009 Successfully Clicked  on the Provider Name (TURBOGAMES) but Error appears when the game launched.");
			}
			
			//TECHNOLOGY PROVIDER
			int technology_count = loginPage.verifyGameServices(driver, slotgamePage.addProviderGameServices(slotgamePage.Technology_20StarParty,slotgamePage.Technology_UrbanLadyLoveStory),
					slotgamePage.addGameServices("Technology_20StarParty","Technology_UrbanLadyLoveStory"), "softswiss", slotprovider.enterProvidersName(slotprovider.technology));
			if(technology_count>=2) {
				logStatus("PASS", "TECHNOLOGY_010 Successfully clicked on the Provider Name (TECHNOLOGY) and landed on the TECHNOLOGY page and Successfully launch the Casino games.");
			}else {
				logStatus("FAIL", "TECHNOLOGY_010 Successfully Clicked  on the Provider Name (TECHNOLOGY) but Error appears when the game launched.");
			}  
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
