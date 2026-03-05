package Live_Project;

import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class ContactList_Customer {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://wegoai.stage.wegofintest.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebElement code, Submit;
		Thread.sleep(3000);
		// Access Code //
		code = driver.findElement(By.xpath("//input[@id=\"access_code\"]"));
		code.sendKeys("1122");
		Submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		Submit.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='register_btns']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class=\"authPge__hyperTxt cursor__pointer SignInPage\"]")).click();
		// Login with user Id & Password //
		WebElement user = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		user.sendKeys("Kevinralph156@gmail.com");
		WebElement pass = driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
		pass.sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
		// OTP Verification //
		Thread.sleep(1000);
		List<WebElement> Pass = driver.findElements(By.xpath("(//div[@class='signin__vrfy__contsec'])[1]/div/input"));//// input[@class='inpts_dv_par
																														//// copy_disable']
		for (int i = 0; i < 5; i++) {
			Pass.get(i).sendKeys("252828");
			// Verify //
			WebElement verify, create;
			verify = driver.findElement(
					By.xpath("//button[@class=\"authCommon__btn w-100 cursor__pointer login_verify--otpbtn\"]"));
			verify.click();
			// Contact list //
			Thread.sleep(10000);
			driver.findElement(
					By.xpath("(//*[@class='header__add__contact__sc header__add__contact__js__sc d__flex__btn'])[1]"))
					.click();
			// Create //
			Thread.sleep(5000);
			for (int j = 0; j < 5; j++) {
				create = driver.findElement(By.xpath("(//button[@type=\"button\"])[11]"));
				create.click();
				// Basic Details //

				Thread.sleep(3000);
				WebElement display_name, contact_person_name;
				Faker f = new Faker(new Locale("en", "IND"));
				String fname = f.name().firstName().toString();
				String lname = f.name().lastName().toString();
				String email = f.internet().emailAddress();
				String upi_id = f.internet().domainWord() + f.number().digits(4);
				// Billing Name //
				String billingN = f.address().firstName().toString();
				String billingAdd = f.address().streetAddress();
				String zipcode = f.address().zipCode();
				String city = f.address().cityName();
				String state = f.address().state();
				// Shipping Name //
				String shippingN = f.address().firstName().toString();
				String shippingAdd = f.address().streetAddress();
				String zipcode1 = f.address().zipCode();
				String citys = f.address().cityName();

				display_name = driver.findElement(By.xpath("(//input[@name=\"display_name\"])[1]"));
				display_name.sendKeys(fname);
				contact_person_name = driver.findElement(By.xpath("(//input[@name=\"contact_pname\"])[1]"));
				contact_person_name.sendKeys(lname);
				// Select Country //
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
				driver.findElement(
						By.xpath("//div[@class=\"input__field__sc input__dp__head__sc input__dp__head__sc__country\"]"))
						.click();
				Thread.sleep(3000);
				WebElement india = driver.findElement(By.xpath("//li[@data-name='India']"));
				Actions a = new Actions(driver);
				a.moveToElement(india);
				Thread.sleep(3000);
				india.click();
				// Select Mobile Number //
				String uniqueNumber = "9" + f.number().digits(10);
				driver.findElement(By.xpath("(//input[@name=\"phone\"])[1]")).sendKeys(uniqueNumber);
				// Email Address //
				driver.findElement(By.xpath("(//input[@name=\"email\"])[1]")).sendKeys(email);
				// UPI id //
//				driver.findElement(By.xpath("(//input[@name=\"upi\"])[1]")).sendKeys(upi_id);
				// Address (Optional)
				driver.findElement(By.xpath("(//div[@class=\"tds__challan__toggle__header__sc\"])[5]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@name=\"bill_name\"])[1]")).sendKeys(billingN); // Billing Name //
				driver.findElement(By.xpath("(//input[@name=\"bill_address\"])[1]")).sendKeys(billingAdd); // Billing
																											// Add //
				driver.findElement(By.xpath("(//input[@name=\"bill_pincode\"])[1]")).sendKeys(zipcode); // Pincode //
				driver.findElement(By.xpath("(//input[@name=\"bill_city\"])[1]")).sendKeys(city); // City //
				Thread.sleep(3000);
				driver.findElement(
						By.xpath("//div[@class=\"input__field__sc input__dp__head__sc input__state__main\"]")).click(); // State
																														// //
				Thread.sleep(3000);
				List<WebElement> cities = driver.findElements(By.xpath("(//ul[@class='ba_state_datas'])[1]/li"));
				int city_length = cities.size();
				Random random = new Random();
				Thread.sleep(6000);
				WebElement city_select = cities.get(random.nextInt(city_length));
				city_select.click();
				// Shipping Address //
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//label[@for=\"shipping\"])[1]")).click();
				driver.findElement(By.xpath("(//input[@name=\"ship_name\"])[1]")).sendKeys(shippingN); // Shipping Name
																										// //
				driver.findElement(By.xpath("(//input[@name=\"ship_address\"])[1]")).sendKeys(shippingAdd); // Shipping
																											// Add
																											// //
				driver.findElement(By.xpath("(//input[@name=\"ship_pincode\"])[1]")).sendKeys(zipcode1); // Pincode //
				driver.findElement(By.xpath("(//input[@name=\"ship_city\"])[1]")).sendKeys(citys); // City //
				driver.findElement(By.xpath("(//input[@name=\"ship_state\"])[1]")).click();
//				Thread.sleep(4000);
				List<WebElement> cities1 = driver.findElements(By.xpath("(//ul[@class='ba_state_datas'])[2]/li"));
				if (!cities1.isEmpty()) {
					cities1.get(new Random().nextInt(cities1.size())).click();
					driver.findElement(By.xpath(
							"//button[@class=\"createcontact__popup__save__btn__sc createItems__popup__save__btn__sc__ba d__flex__btn font16 font_weight_500 font_white\"]"))
							.click();
				}

			}
			System.out.println("Customer Contact Added Successfully");
		}
	}

}
