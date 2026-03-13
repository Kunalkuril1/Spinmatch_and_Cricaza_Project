package com.khelstake.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.khelstake.Demo.BaseTest;

public class SloteGamePage extends BaseTest {

	public SloteGamePage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//ALL SLOTS GAME
	@FindBy (xpath ="(//p[contains(text(),'Hotline')]/..//a)[2]")
	public WebElement   Spribe_Hotline;

	@FindBy (xpath ="//p[contains(text(),'Dice')]/..//a")
	public WebElement   Spribe_Dice;

	@FindBy (xpath ="//p[contains(text(),'Ganesha Fortune')]/..//a")
	public WebElement   Pgsoft_GaneshaFortune;

	@FindBy (xpath ="//p[contains(text(),'Rise of Apollo')]/..//a")
	public WebElement   Pgsoft_RiseofApollo;

	@FindBy (xpath ="//p[contains(text(),'Crypto Gold')]/..//a")
	public WebElement   Pgsoft_CryptGold;


	@FindBy (xpath ="//p[contains(text(),'Winter Wonders')]/..//a")
	public WebElement   RedTiger_WinterWonders;

	@FindBy (xpath ="//p[contains(text(),'Vicky Ventura')]/..//a")
	public WebElement   RedTiger_VickyVentura;


	@FindBy (xpath ="//p[contains(text(),'Wolf Cub')]/..//a")
	public WebElement   Netent_WolfCub;

	@FindBy (xpath ="//p[contains(text(),'Super Striker')]/..//a")
	public WebElement   Netent_SuperStriker;

	@FindBy (xpath ="//p[contains(text(),'Sugar Crush')]/..//a")
	public WebElement   Mojos7_SugarCrush;

	@FindBy (xpath ="//p[contains(text(),'40 Hot Twist')]/..//a")
	public WebElement   Mojos7_40HotTwist;

	@FindBy (xpath ="//p[contains(text(),'XMas Party')]/..//a")
	public WebElement   Zillion_40HotTwist;

	@FindBy (xpath ="//p[contains(text(),'Fruits Five Lines')]/..//a")
	public WebElement   Zillio_FruitsFiveLines;

	@FindBy (xpath ="//p[contains(text(),'Wild Jack 81')]/..//a")
	public WebElement   Wazdan_WildJack81;

	@FindBy (xpath ="//p[contains(text(),'Valhalla')]/..//a")
	public WebElement   Wazdan_Valhalla;

	@FindBy (xpath ="//p[contains(text(),'Bingo 3')]/..//a")
	public WebElement   Vibragaming_Bingo3;

	@FindBy (xpath ="//p[contains(text(),'Pachinko 3')]/..//a")
	public WebElement   Vibragaming_Pachinko3;

	@FindBy (xpath ="//p[contains(text(),'Wicket Blast')]/..//a")
	public WebElement   Turbogames_WicketBlast;

	@FindBy (xpath ="//p[contains(text(),'Neko')]/..//a")
	public WebElement   Turbogames_Neko;

	@FindBy (xpath ="//p[contains(text(),'20 Star Party')]/..//a")
	public WebElement   Technology_20StarParty;

	@FindBy (xpath ="//p[contains(text(),'Urban Lady Love Story')]/..//a")
	public WebElement   Technology_UrbanLadyLoveStory;

	@FindBy (xpath ="//p[contains(text(),'William`s Quest')]/..//a")
	public WebElement   Swntt_WilliamsQuest;
	
	@FindBy (xpath ="//p[contains(text(),'Jade Blade XtraSplit')]/..//a")
	public WebElement   Swntt_JadeBladeXtraSplit;
	
	@FindBy (xpath ="//p[contains(text(),'Temple of Fortuna')]/..//a")
	public WebElement   Spinza_TempleofFortuna;
	
	@FindBy (xpath ="//p[contains(text(),'Golden Dragon: Multi Hold and Win')]/..//a")
	public WebElement   Spinza_GoldenDragonMultiHoldandWin;
	
	@FindBy (xpath ="//p[contains(text(),'Zeus Stairway')]/..//a")
	public WebElement   Refanco_ZeusStairway;
	
	@FindBy (xpath ="//p[contains(text(),'Viral Slot')]/..//a")
	public WebElement   Refanco_ViralSlot;
	
	@FindBy (xpath ="//p[contains(text(),'Altar de Muertos')]/..//a")
	public WebElement   Reevo_AltardeMuertos;
	
	@FindBy (xpath ="//p[contains(text(),'Crown Heist')]/..//a")
	public WebElement   Reevo_CrownHeist;
	
	@FindBy (xpath ="//p[contains(text(),'Vampire Senpai')]/..//a")
	public WebElement   QuickSpin_WinsofFortune;
	
	@FindBy (xpath ="//p[contains(text(),'Wins of Fortune')]/..//a")
	public WebElement   QuickSpin_VampireSenpai;
	
	@FindBy (xpath ="//p[contains(text(),'Xperiment Gold')]/..//a")
	public WebElement   Popiplay_XperimentGold;
	
	@FindBy (xpath ="//p[contains(text(),'UFO Joe')]/..//a")
	public WebElement   Popiplay_Ufojoe;
	
	@FindBy (xpath ="//p[contains(text(),'Wild Spin')]/..//a")
	public WebElement   Platipus_WildSpin;
	
	@FindBy (xpath ="//p[contains(text(),'The Ancient Four')]/..//a")
	public WebElement   Platipus_TheAncientFour;
	
	@FindBy (xpath ="//p[contains(text(),'Videopoker')]/..//a")
	public WebElement   Orbital_Videopoker;
	
	@FindBy (xpath ="//p[contains(text(),'Astro')]/..//a")
	public WebElement   Orbital_Astro;
	
	@FindBy (xpath ="//p[contains(text(),'Troll Dice')]/..//a")
	public WebElement   OnlyPlay_TrollDice;
	
	@FindBy (xpath ="//p[contains(text(),'Jungle Gold')]/..//a")
	public WebElement   OnlyPlay_JungleGold;
	
	@FindBy (xpath ="(//p[contains(text(),'Blackjack Classic')]/..//a)[1]")
	public WebElement   OneTouch_BlackjackClassic;
	
	@FindBy (xpath ="//p[contains(text(),'Cash Galaxy')]/..//a")
	public WebElement   OneTouch_CashGalaxy;
		
	@FindBy (xpath ="//p[contains(text(),'Winter Champs')]/..//a")
	public WebElement   Nucleus_WinterChamps;
	
	@FindBy (xpath ="//p[contains(text(),'Peak Riches')]/..//a")
	public WebElement   Nucleus_PeakRiches;
	
	@FindBy (xpath ="//p[contains(text(),'Volcano Fruits')]/..//a")
	public WebElement   NetGame_VolcanoFruits;
	
	@FindBy (xpath ="//p[contains(text(),'Mystery Dragons')]/..//a")
	public WebElement   NetGame_MysteryDragons;
	
	@FindBy (xpath ="//p[contains(text(),'Yggdrasil')]/..//a")
	public WebElement   MRSlotty_Yggdrasil;
	
	@FindBy (xpath ="//p[contains(text(),'Very Hot 20')]/..//a")
	public WebElement   MRSlotty_VeryHot20;
	
	@FindBy (xpath ="//p[contains(text(),'Wild West Mystery')]/..//a")
	public WebElement   MPlay_WildWestMystery;
	
	@FindBy (xpath ="//p[contains(text(),'Indian T20 League')]/..//a")
	public WebElement   MPlay_IndianT20League;
	
	
	@FindBy (xpath ="//p[contains(text(),'Yola Berrocal Wild West')]/..//a")
	public WebElement   MGAGame_YolaBerrocalWildWest;
	
	@FindBy (xpath ="//p[contains(text(),'Sandro Rey')]/..//a")
	public WebElement   MGAGame_SandroRey;
	
	@FindBy (xpath ="//p[contains(text(),'Savanna Stampede')]/..//a")
	public WebElement   Merkur_SavannaStampede;
	
	@FindBy (xpath ="//p[contains(text(),'Blazing Star')]/..//a")
	public WebElement   Merkur_BlazingStar;
	
	@FindBy (xpath ="//p[contains(text(),'Zeus the Thunderer')]/..//a")
	public WebElement   Mascot_ZeustheThunderer;
	
	@FindBy (xpath ="//p[contains(text(),'Red Horde')]/..//a")
	public WebElement   Mascot_RedHorde;
	
	@FindBy (xpath ="//p[contains(text(),'Portal Master')]/..//a")
	public WebElement   Manchala_PortalMaster;
	
	@FindBy (xpath ="//p[contains(text(),'Coco Tiki')]/..//a")
	public WebElement   Manchala_CocoTiki;
	
	@FindBy (xpath ="//p[contains(text(),'Zilionaire')]/..//a")
	public WebElement   Lucky_Zilionaire;
	
	@FindBy (xpath ="//p[contains(text(),'Precious Egypt')]/..//a")
	public WebElement   Lucky_PreciousEgypt;
	
	@FindBy (xpath ="//p[contains(text(),'Spanish Fast League Football Single')]/..//a")
	public WebElement   Kiran_SpanishFasteagueFootballSingle;
	
	@FindBy (xpath ="//p[contains(text(),'Keno')]/..//a")
	public WebElement   Kiran_Keno;
	
	@FindBy (xpath ="//p[contains(text(),'The Mask of Zorro')]/..//a")
	public WebElement   KaGaming_TheMaskofZorro;
	
	@FindBy (xpath ="//p[contains(text(),'X-Bomber')]/..//a")
	public WebElement   KaGaming_X_Bomber;
	
	@FindBy (xpath ="//p[contains(text(),'1000 Pearls')]/..//a")
	public WebElement   HighFive_1000Pearls;
	
	@FindBy (xpath ="//p[contains(text(),'Beat The House')]/..//a")
	public WebElement   HighFive_BeatTheHouse;
	
	@FindBy (xpath ="//p[contains(text(),'Witcher Cave')]/..//a")
	public WebElement   Groove_WitcherCave;
	
	@FindBy (xpath ="//p[contains(text(),'Spinbox')]/..//a")
	public WebElement   Groove_Spinbox;
	
	@FindBy (xpath ="//p[contains(text(),'Xtreme Summer Hot')]/..//a")
	public WebElement   GameArt_XtremeSummerHot;
	
	@FindBy (xpath ="//p[contains(text(),'Star Cash')]/..//a")
	public WebElement   GameArt_StarCash;
	
	@FindBy (xpath ="//p[contains(text(),'24 Stars Dream')]/..//a")
	public WebElement   Fantasma_24StarsDream;
	
	@FindBy (xpath ="//p[contains(text(),'Wins of Nautilus')]/..//a")
	public WebElement   Fantasma_WinsofNautilus;
	
	@FindBy (xpath ="//p[contains(text(),'Wilds Of Wall Street II')]/..//a")
	public WebElement   EveryMatrix_WildsOfWallStreetII;
	
	@FindBy (xpath ="//p[contains(text(),'Muertitos: Video Bingo')]/..//a")
	public WebElement   EveryMatrix_MuertitosVideoBingo;
	
	@FindBy (xpath ="//p[contains(text(),'Yggdrasil')]/..//a")
	public WebElement   EaGaming_Yggdrasil;
	
	@FindBy (xpath ="//p[contains(text(),'Shaolin')]/..//a")
	public WebElement   EaGaming_Shaolin;
	
	@FindBy (xpath ="//p[contains(text(),'Yak, Yeti & Roll')]/..//a")
	public WebElement   BSG_YakYetiRoll;
	
	@FindBy (xpath ="//p[contains(text(),'Tycoons Plus')]/..//a")
	public WebElement   BSG_TycoonsPlus;
	
	@FindBy (xpath ="//p[contains(text(),'Monkey Bar')]/..//a")
	public WebElement   Bet2Tech_MonkeyBar;
	
	@FindBy (xpath ="//p[contains(text(),'100 Monkeys')]/..//a")
	public WebElement   Bet2Tech_100Monkeys;
	
	@FindBy (xpath ="//p[contains(text(),'Wild GemZ')]/..//a")
	public WebElement   Atlente_WildGemZ;
	
	@FindBy (xpath ="//p[contains(text(),'Lucky Turn')]/..//a")
	public WebElement   Atlente_LuckyTurn;
	
	@FindBy (xpath ="//p[contains(text(),'Wolf Spins 243')]/..//a")
	public WebElement   OneSpinWin_WolfSpins243;
	
	@FindBy (xpath ="//p[contains(text(),'Lucky Xmas 20')]/..//a")
	public WebElement   OneSpinWin_LuckyXmas20;
	
	@FindBy (xpath ="//p[contains(text(),'Zombie Queen')]/..//a")
	public WebElement   Kalamba_ZombieQueen;
	
	@FindBy (xpath ="//p[contains(text(),'Sadie Swift: Guns and Glyphs')]/..//a")
	public WebElement   Kalamba_SadieSwiftGunsandGlyphs;
	
	@FindBy (xpath ="//p[contains(text(),'Word of Thoth')]/..//a")
	public WebElement   JadeRabbit_WordofThoth;
	
	@FindBy (xpath ="//p[contains(text(),'Reel Holidays')]/..//a")
	public WebElement   JadeRabbit_ReelHolidays;
	
	@FindBy (xpath ="//p[contains(text(),'Three Card Poker Deluxe')]/..//a")
	public WebElement   Habanero_ThreeCardPokerDeluxe;
	
	@FindBy (xpath ="//p[contains(text(),'Zeus')]/..//a")
	public WebElement   Habanero_Zeus;
	
	@FindBy (xpath ="//p[contains(text(),'Won Hundred')]/..//a")
	public WebElement   Gamzix_WonHundred;
	
	@FindBy (xpath ="//p[contains(text(),'Pilot Cup')]/..//a")
	public WebElement   Gamzix_PilotCup;
	
	@FindBy (xpath ="//p[contains(text(),'40 Clover Fire')]/..//a")
	public WebElement   Fazi_40CloverFire;
	
	@FindBy (xpath ="//p[contains(text(),'10 Wild Crown')]/..//a")
	public WebElement   Fazi_10WildCrown;
	
	@FindBy (xpath ="//p[contains(text(),'Xmas Keno Cat')]/..//a")
	public WebElement   Evoplay_XmasKenoCat;
	
	@FindBy (xpath ="//p[contains(text(),'Triple Chili')]/..//a")
	public WebElement   Evoplay_TripleChili;
	
	@FindBy (xpath ="//p[contains(text(),'Wild Fruits')]/..//a")
	public WebElement   Endorphina_WildFruits;
	
	@FindBy (xpath ="//p[contains(text(),'Sparkling Fresh')]/..//a")
	public WebElement   Endorphina_SparklingFresh;
	
	@FindBy (xpath ="//p[contains(text(),'Candy Claw')]/..//a")
	public WebElement   Clowbuster_CandyClaw;
	
	@FindBy (xpath ="//p[contains(text(),'Wild West Claw x5500')]/..//a")
	public WebElement   Clowbuster_WildWestClawx5500;
	
	@FindBy (xpath ="//p[contains(text(),'West Town')]/..//a")
	public WebElement   Bagaming_WestTown;
	
	
	@FindBy (xpath ="//p[contains(text(),'Plinko')]/..//a")
	public WebElement   Bagaming_Plinko;
	
	@FindBy (xpath ="//p[contains(text(),'Zombie Town')]/..//a")
	public WebElement   Belatra_ZombieTown;
	
	@FindBy (xpath ="//p[contains(text(),'Sic Bo')]/..//a")
	public WebElement   Belatra_SicBo;
	
	@FindBy (xpath ="//p[contains(text(),'Woland')]/..//a")
	public WebElement   FiveMen_Woland;
	
	@FindBy (xpath ="//p[contains(text(),'Snakes & Toads')]/..//a")
	public WebElement   FiveMen_SnakesToads;


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
