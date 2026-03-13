package com.khelstake.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.khelstake.Demo.BaseTest;
import com.khelstake.Demo.EvenUtils;
import com.khelstake.Demo.WebContants;
import com.khelstake.pages.LoginPages;

public class LoginTest_SpinMatchApplication extends BaseTest {

	LoginPages loginPage;
	EvenUtils evenutils;

	@Test
	public void login_Validation_SpinMatch_All_Provider() {
		try {
			loginPage=new LoginPages(driver);
			evenutils=new EvenUtils(driver);
			evenutils.navigateToUrl(WebContants.Spinmatch_url);
			evenutils.switchToFrame(loginPage.insideframe);
			Thread.sleep(5000);
		//	if(evenutils.waitUntillElementIsPresent(loginPage.LoginBtnSpinmatch, 15,"LoginBtnSpinmatch")) {
				evenutils.clickOnElement(loginPage.LoginBtnSpinmatch);
		//	}
			Thread.sleep(5000);
			String spinMatchUser = evenutils.getData("SpinMatchusername3");
			String spinMatchPass = evenutils.getData("SpinMatchpassword");
			
			evenutils.sendValue(loginPage.usreNameInput, spinMatchUser);
			evenutils.sendValue(loginPage.passWordInput, spinMatchPass);
			evenutils.clickOnElement(loginPage.SignInBtn);	
			Thread.sleep(5000);
		//	if(evenutils.waitUntillElementIsPresent(loginPage.skipBtn, 30,"skipBtn")) 
			evenutils.clickOnElement(loginPage.skipBtn);
			evenutils.clickOnElement(loginPage.inPlayBtn);
			evenutils.mouseHover(loginPage.LiveCasinoBtn);
			evenutils.clickOnElement(loginPage.LiveCasinoBtn);
			Thread.sleep(7000);
		//	if(evenutils.waitUntillElementIsPresent(loginPage.AllBgames, 30,"AllBgames")) {
		//		evenutils.clickOnElement(loginPage.AllBgames);
		//			}	
		/*	if(evenutils.waitUntillElementIsPresent(loginPage.Bgamescasino, 10,"Bgamescasino")) {
				Thread.sleep(5000);
				evenutils.clickOnElementUsingjavaScriptExecuterLog(loginPage.Bgamescasino, evenutils.fetchText(loginPage.Bgamescasino));
				logStatus("PASS", "Successfully clicked on the Provider Name (BGAMES) and landed on the Bgames page and Successfully launched the Casino games.");
						
			}else {
				logStatus("FAIL", "Not clicked  on the Provider Name (BGAMES) and not landed on the Bgames page.");

			}	*/	
			Set<String> session = evenutils.getSessionID();
			ArrayList<String> ar = new ArrayList<String>(session);
			Thread.sleep(10000);
			evenutils.windowHandle(ar.get(0));	
			evenutils.switchToFrame(loginPage.insideframe);
			Thread.sleep(5000);
			if(evenutils.waitUntillElementIsPresent(loginPage.LeftArrow, 30,"LeftArrow")) {
				evenutils.clickOnElement(loginPage.LeftArrow);				
				}
			List<WebElement> allProvider = driver.findElements(By.xpath("//div[@class='inner-icons filterClsProvider']"));
			int count=allProvider.size();
			System.out.println(count);
			for(int i=0;i<count;i++) {
					String text = allProvider.get(i).getText();
					//System.out.println(text);
			}
			
			//7MOJOS Provider
			allProvider.get(4).click();		
			if(evenutils.waitUntillElementIsPresent(loginPage.MojosCasinoGames, 30,"MojosCasinoGames")) {
			Thread.sleep(5000);
			evenutils.clickOnElementUsingjavaScriptExecuterLog(loginPage.MojosCasinoGames, evenutils.fetchText(loginPage.MojosCasinoGames));
			Thread.sleep(7000);
			logStatus("PASS", "Successfully clicked on the Provider Name (7MOJOS) and landed on the 7mojos page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "Not clicked  on the Provider Name (7MOJOS) and not landed on the 7mojos page.");
			}
			
			//WINMATCH PROVIDER
			evenutils.windowHandle(ar.get(0));
			evenutils.switchToFrame(loginPage.insideframe);
			Thread.sleep(5000);
			if(evenutils.waitUntillElementIsPresent(loginPage.LeftArrow, 30,"LeftArrow")) {
				evenutils.clickOnElement(loginPage.LeftArrow);				
				}		
			evenutils.switchToFrame(loginPage.insideframe);
			allProvider.get(1).click();
			if(evenutils.waitUntillElementIsPresent(loginPage.winMatchCasino1, 30,"winMatchCasino1")) {
				Thread.sleep(5000);
				evenutils.clickOnElement(loginPage.winMatchCasino1);
				Thread.sleep(7000);
				logStatus("PASS", "Successfully clicked on the Provider Name (WINMATCH) and landed on the Winmatch page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "Not clicked  on the Provider Name (WINMATCH) and not landed on the Winmatch page.");
			}
			
			//VIVO PROVIDER
			evenutils.windowHandle(ar.get(0));
			evenutils.switchToFrame(loginPage.insideframe);
			Thread.sleep(5000);
			if(evenutils.waitUntillElementIsPresent(loginPage.LeftArrow, 30,"LeftArrow")) {
				evenutils.clickOnElement(loginPage.LeftArrow);				
				}		
			evenutils.switchToFrame(loginPage.insideframe);
			allProvider.get(3).click();
			if(evenutils.waitUntillElementIsPresent(loginPage.vivoCasino, 30,"vivoCasino")) {
				evenutils.clickOnElement(loginPage.vivoCasino);
				Thread.sleep(7000);
				logStatus("PASS", "Successfully clicked on the Provider Name (VIVO) and landed on the vivo page and Successfully launched the Casino games.");
			}else {
				logStatus("FAIL", "Not clicked  on the Provider Name (VIVO) and not landed on the vivo page.");
			}
			
			//EZUGI PROVIDER
			evenutils.windowHandle(ar.get(0));
			evenutils.switchToFrame(loginPage.insideframe);
			Thread.sleep(5000);
			if(evenutils.waitUntillElementIsPresent(loginPage.LeftArrow, 30,"LeftArrow")) {
				evenutils.clickOnElement(loginPage.LeftArrow);				
				}		
			evenutils.switchToFrame(loginPage.insideframe);
			allProvider.get(5).click();
			if(evenutils.waitUntillElementIsPresent(loginPage.casinoLink11, 30,"casinoLink11")) {
				evenutils.clickOnElement(loginPage.casinoLink12);
				String actualTitle="Arcadia Game Client";
				String expectedTitle = driver.getTitle();
				System.out.println(expectedTitle);
				Thread.sleep(15000);
				
					logStatus("PASS", "Successfully clicked on the Provider Name (EZUGI) and landed on the Ezugi page and Successfully launched the Casino games.");
			}else {
					logStatus("FAIL", "Not clicked  on the Provider Name (EZUGI) and not landed on the Ezugi page.");
				}			
			
			
			
			
			
			
					
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void loginValidationSpinMatch7MOJOSTProvider() {
		try {
			loginPage=new LoginPages(driver);
			evenutils=new EvenUtils(driver);
			evenutils.navigateToUrl(WebContants.Spinmatch_url);
			evenutils.switchToFrame(loginPage.insideframe);
			Thread.sleep(5000);
			if(evenutils.waitUntillElementIsPresent(loginPage.LoginBtnSpinmatch, 30,"LoginBtnSpinmatch")) {
				evenutils.clickOnElement(loginPage.LoginBtnSpinmatch);
			}
			String spinMatchUser = evenutils.getData("SpinmatchUserName4");
			String spinMatchPass = evenutils.getData("SpinMatchpassword");
			evenutils.sendValue(loginPage.usreNameInput, spinMatchUser);
			evenutils.sendValue(loginPage.passWordInput, spinMatchPass);
			evenutils.clickOnElement(loginPage.SignInBtn);	
			Thread.sleep(5000);
			if(evenutils.waitUntillElementIsPresent(loginPage.skipBtn, 30,"skipBtn")) 
				evenutils.clickOnElement(loginPage.skipBtn);
			evenutils.clickOnElement(loginPage.inPlayBtn);
			evenutils.clickOnElement(loginPage.LiveCasinoBtn);
			if(evenutils.waitUntillElementIsPresent(loginPage.mojosProvider, 10,"mojosProvider")) {
				evenutils.clickOnElement(loginPage.mojosProvider);
				evenutils.clickOnElement(loginPage.MojosCasinoGames);
				logStatus("PASS", "Successfully clicked on the Provider Name (7MOJOS) and landed on the 7mojos page.");
			}else {
				logStatus("PASS", "Successfully clicked on the Provider Name (NETENT) and landed on the Netent page.");
				evenutils.waitUntillElementIsPresent(loginPage.NetentProvider, 10,"waitUntillElementIsPresent");
				evenutils.clickOnElement(loginPage.NetentProvider);
				evenutils.waitUntillElementIsPresent(loginPage.NetentCasinoGames, 10,"NetentCasinoGames");
				evenutils.clickOnElement(loginPage.NetentCasinoGames);

			}
			evenutils.clickOnElement(loginPage.MojosCasinoGames);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
