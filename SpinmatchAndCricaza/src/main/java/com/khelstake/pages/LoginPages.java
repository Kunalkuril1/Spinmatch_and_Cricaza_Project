package com.khelstake.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import com.khelstake.Demo.BaseTest;
import com.khelstake.Demo.EvenUtils;
import com.khelstake.Demo.ReportUtils;

public class LoginPages extends BaseTest {

	@FindBy(id ="iframe")
	public WebElement insideframe;
	//iframe[@id='iframe']
	@FindBy(xpath ="//span[@class='icon-close2']")
	public WebElement CloseBtn;
	

	@FindBy(xpath="//span[@class='mob-btn__content']")
	public WebElement LoginBtnSpinmatch;
	
	@FindBy(xpath="//button[@class='ksr__login_btn login_btn ']")
	public WebElement LoginBtnCricaza;
	

	@FindBy (xpath = "//input[@id='uSername']")
	public WebElement usreNameInput;
	
	@FindBy (xpath = "//input[@class='username_input  email_login login_inputs']")
	public WebElement usreNameInputCricaza;
	
	@FindBy (xpath = "//input[@class='Password_input  cls_pas_vis password_login login_inputs inputPasswordLogin']")
	public WebElement passWordInputCricaza;
	
	@FindBy (xpath = "//input[@id='uSerpwd']")
	public WebElement passWordInput;

	@FindBy (xpath ="//button[normalize-space()='Sign In']")
	public WebElement SignInBtn;
	
	@FindBy (xpath ="//button[@class='login_button btn-send ui-link loginBtn_']")
	public WebElement SignInBtnCricaza;
	
	@FindBy (xpath ="//div[@data-id='casino']")
	public WebElement CasinoBtnInCricaza;
	
	//div[@data-id='casino']

	@FindBy (xpath = "//div[@class='skip_right_img']")
	public WebElement skipBtn;

	@FindBy (id = "inPlay_open")
	public WebElement inPlayBtn;

	@FindBy (xpath = "//li[text()=' Live-Casino']")
	public WebElement LiveCasinoBtn;
	
	@FindBy (xpath = "//p[text()='Live Casino ']")
	public WebElement LiveCasinoBtnCricaza;
	
	//p[text()='Live Casino ']
	
	@FindBy (xpath = "//li[text()=' Slots']")
	public WebElement SlotsBtn;
	
	@FindBy (xpath = "//div[text()='bgames']")
	public WebElement AllBgames;

	@FindBy (xpath = "(//div[text()='pgsoft'])[2]")
	public WebElement AllPgsoft;

	@FindBy (xpath = "//div[@class='inner__div']//p")
	public WebElement Bgamescasino;

	@FindBy (xpath ="(//a[@class='casinoLink'])[30]")
	public WebElement PgsoftCasinoGames;

	@FindBy (xpath ="//div[text()='7mojos']")
	public WebElement mojosProvider;

	@FindBy (xpath ="(//div[text()='NetEnt'])[2]")
	public WebElement NetentProvider;

	@FindBy (xpath = "(//a[@data-provider='evolution'])[8]")
	public WebElement NetentCasinoGames;

	@FindBy (xpath ="//div[@class='inner__div']//p")
	public WebElement MojosCasinoGames;

	@FindBy (xpath = "//img[@src='/casinolisting/images/header/backbtn.svg']")
	public WebElement LeftArrow;

	//@FindBy (xpath ="//div[@class='inner-icons filterClsProvider']")
	//public List<WebElement> allProvider;

	@FindBy (xpath = "(//a[@class='casinoLink'])[8]" )
	public WebElement winMatchCasino;

	@FindBy (xpath = "//div[contains(@class,'allgame-inner1 allgames all-casino-game all-tab-show remove_border')]//div[4]//div[1]//a[1]//img[1]")
	public WebElement winMatchCasino1;

	@FindBy (xpath = "//div[@class='allgame-inner1 allgames all-casino-game all-tab-show remove_border']//div[8]//div[1]//a[1]//img[1]")
	public WebElement vivoCasino;

	@FindBy (xpath = "(//a[@class='casinoLink'])[10]")
	public WebElement casinoLink10;

	@FindBy (xpath = "(//a[@class='casinoLink'])[11]")
	public WebElement casinoLink11;

	@FindBy (xpath = "(//a[@class='casinoLink'])[12]")
	public WebElement casinoLink12;

	@FindBy (xpath = "(//a[@class='casinoLink'])[13]")
	public WebElement casinoLink13;

	@FindBy (xpath = "(//div[@class='find-imf background_loader']//p)[7]")
	public WebElement casinoGames7;
	//div[@class='inner__div']//p
	//(//div[@class='find-imf background_loader']//p)[7]

	@FindBy (xpath = "(//div[@class='find-imf background_loader']//p)[8]")
	public WebElement casinoGame8;
	//(//div[@class='inner__div']//p)[8]
	//(//div[@class='find-imf background_loader']//p)[7]

	@FindBy (xpath = "(//a[@class='casinoLink'])[9]")
	public WebElement casinoLink9;

	@FindBy (xpath ="//div[@data-label='xpg']//div[@class='sub-inner-icons']")
	public WebElement XPGProvider;




	public LoginPages(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void serviceProviderValidation(RemoteWebDriver driver,WebElement providerName,WebElement gameService,String text) throws Exception {
		EvenUtils evenutils=new EvenUtils(driver);
		ReportUtils reporutils=new ReportUtils();
		try {
			if (evenutils.waitUntillElementIsVisible(providerName, 5)) {
				providerName.click();
			}
			Thread.sleep(5000);
			evenutils.clickOnElementUsingjavaScriptExecuterLog(gameService,text);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int verifyGameServices(RemoteWebDriver driver,List<WebElement> apgs,String[] ags,String url,List<WebElement> providerService) {
		ReportUtils reportUtils=new ReportUtils();
		GamesPage gamePage=new GamesPage(driver);
		ProviderPage provider=new ProviderPage(driver);
		EvenUtils evenutils=new EvenUtils(driver);
		int playback =0;
		for (int k = 0; k <providerService.size(); k++) {
			for (int i = 0; i < ags.length; i++) {
				String parentSession = driver.getWindowHandle();
			try {
				serviceProviderValidation(driver, providerService.get(k),apgs.get(i), ags[i]);
			} catch (Exception e) {
				
			}
				Set<String> sessions =evenutils.getSessionID();
				for (String sh : sessions) {
					evenutils.windowHandle(sh);
					if (driver.getCurrentUrl().toLowerCase().contains(url)) {
					//	String s_url = driver.getCurrentUrl();
						try {
							Thread.sleep(7000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if (evenutils.waitUntillElementIsVisible(insideframe, 7)) {
							evenutils.switchToFrame(insideframe);
						}
						if (!evenutils.waitUntillElementIsVisible(gamePage.Errormsg, 10)) {
							playback++;		
						//	reportUtils.logStatusInfo(ags[i] +"  Game ID -->  "+s_url.substring(s_url.lastIndexOf("q=")+1));
							break;
						}else {
							try {
								reportUtils.logStatusWarning(evenutils.getScreenShotBase64());
							} catch (Exception e) {
								// TODO Auto-generated catch block
								
							}
							break;
						}
					}
				}
				driver.close();
				evenutils.windowHandle(parentSession);
				evenutils.switchToFrame(insideframe);
				evenutils.clickOnElement(LeftArrow);
			}
		}
			
		
		return playback;
	}
}
