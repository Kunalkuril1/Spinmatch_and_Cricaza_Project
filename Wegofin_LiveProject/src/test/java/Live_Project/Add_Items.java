package Live_Project;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class Add_Items {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://wegoai.stage.wegofintest.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class=\"authPge__hyperTxt cursor__pointer SignInPage\"]")).click();
		// Login with user Id & Password //
		WebElement user = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		user.sendKeys("mnopdoe@gmail.com");
		WebElement pass = driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
		pass.sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
		// OTP Verification //
		Thread.sleep(1000);
		List<WebElement> Pass = driver.findElements(By.xpath("//input[@class='inpts_dv_par copy_disable']"));
		for (int i = 0; i < 5; i++) {
			Pass.get(i).sendKeys("252828");
		}
		// Verify //
		WebElement verify;
		verify = driver.findElement(
				By.xpath("//button[@class=\"authCommon__btn w-100 cursor__pointer login_verify--otpbtn\"]"));
		verify.click();
		// Add items //

		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class=\"main__header__row__rgt__btns__sc\"]/div[3]")).click();
		// Create //
		Thread.sleep(6000);
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath(
					"//button[@class=\"create__items__btn__sc d__flex__btn font16 font_weight_500 font_white\"]"))
					.click();
			// Item Details //
			Faker f = new Faker(new Locale("en", "IND"));
			Random random = new Random();
			String item_name = f.commerce().productName();
			String Item2 = f.company().buzzword();
			String sku = new Faker().bothify("???-####-???").toUpperCase();
			int costPrice = random.nextInt(351) + 50;
			int salePrice = costPrice + random.nextInt(501 - costPrice);
			DecimalFormat df = new DecimalFormat("0");
			int qty = f.number().numberBetween(1, 101);
			String formattedCost = "₹" + df.format(costPrice);
			String formattedSale = "₹" + df.format(salePrice);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@placeholder=\"Select Type\"])[1]")).click(); // Item Type //
//			driver.findElement(By.xpath("(//li[@class=\"dropdown_list font16 font_weight_400 font_dark\"])[1]")).click(); // Product
			driver.findElement(By.xpath("(//li[@class=\"dropdown_list font16 font_weight_400 font_dark\"])[2]"))
					.click(); // Service
			driver.findElement(By.xpath("//input[@name=\"item_name\"]")).sendKeys(item_name); // Item Name //
			driver.findElement(By.xpath("//input[@name=\"sku_no\"]")).sendKeys(sku); // SKU Number //
			driver.findElement(By.xpath("//input[@name=\"unit\"]")).click(); // Unit //
			List<WebElement> unit = driver.findElements(By.xpath("//ul[@class=\"item_units_datas\"][1]/li"));
			if (!unit.isEmpty()) {
				unit.get(new Random().nextInt(unit.size())).click();
				driver.findElement(By.xpath("//input[@name=\"cost_per_unit\"]")).sendKeys(formattedCost); // Cost Price
				driver.findElement(By.xpath("//input[@name=\"sales_per_unit\"]")).sendKeys(formattedSale); // Sale Price
																											// //
				WebElement quantityInput = driver.findElement(By.xpath("//input[@name=\"closing_qty\"]")); // Closing
																											// Qty in

				// Hand //
				quantityInput.sendKeys(String.valueOf(qty));
				Thread.sleep(3000);
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class=\"jrk_select-btn tOggleSlide\"])[1]")).click(); // Intrest on
																											// Investement
																											// //
//				Thread.sleep(3000);
				// Income Category //

				Random rand = new Random();
				List<WebElement> options = driver
						.findElements(By.xpath("//*[@class=\"akDropDown  item_income_category_datas_main\"]/li"));
				int randomIndex = rand.nextInt(options.size());
				Thread.sleep(5000);
				WebElement selectedOption = options.get(randomIndex);
				Thread.sleep(5000);
				selectedOption.click();

				for (WebElement category : options) {
					try {
						category.click(); // Expand the category

						// Wait or sleep if needed
						Thread.sleep(5000);

						// Get sub-options under the current category
						List<WebElement> subOptions = category.findElements(By.xpath(
								"//*[@class=\"akDropDown  item_income_category_datas_main\"]/li or contains(text(),'Shipping Charge')]"));

						if (subOptions.size() >= 2) {
							subOptions.get(1).click(); // Select 2nd option
						} else if (subOptions.size() == 1) {
							Thread.sleep(6000);
							subOptions.get(0).click(); // Select Default
						} else {
							System.out.println("No sub-options for: " + category.getText());
						}

//						break; // If only one selection is required, break the loop
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			driver.findElement(By.xpath("(//div[@class=\"jrk_select-btn tOggleSlide\"])[2]")).click(); // Expense
			// Expense Category //
			Random rand1 = new Random();
			List<WebElement> option = driver
					.findElements(By.xpath("//ul[@class=\"akDropDown  item_expense_category_datas\"]/li"));
			int randIndex = rand1.nextInt(option.size());
			Thread.sleep(5000);
			WebElement selectedOption1 = option.get(randIndex);
			Thread.sleep(6000);
			selectedOption1.click();
			for (WebElement category : option) {
				try {
					category.click(); // Expand the category
					Thread.sleep(5000);
					List<WebElement> subOption = driver.findElements(By.xpath(
							"//*[@class=\"akDropDown  item_expense_category_datas\"]/li or contains(text(),'General')]or contains(text(),'Material costs')]or contains(text(),'A2Z - Selling Fee')]"));
					if (subOption.size() >= 2) {
						subOption.get(1).click(); // Select 2nd option
					} else if (subOption.size() == 1) {
						Thread.sleep(6000);
						subOption.get(0).click(); // Select Default
					} else {
						System.out.println("No sub-options for: " + category.getText());
					}
//					break; // If only one selection is required, break the loop
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Save Button //
				driver.findElement(By.xpath(
						"//button[@class=\"createItems__popup__save__btn__sc   d__flex__btn font16 font_weight_500 font_white  itm_cr_up_save_bk\"]"))
						.click();
			}
			System.out.println("Item Added Successfully");
		}

	}

}
