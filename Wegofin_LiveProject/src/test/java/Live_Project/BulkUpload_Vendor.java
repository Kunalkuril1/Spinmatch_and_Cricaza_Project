package Live_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BulkUpload_Vendor {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://wegoai.stage.wegofintest.com/");
		driver.manage().window().maximize();
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
		user.sendKeys("dennisritchie03281997@gmail.com");
		WebElement pass = driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
		pass.sendKeys("Test@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
		// OTP Verification //
		Thread.sleep(1000);
		List<WebElement> Pass = driver.findElements(By.xpath("//input[@class='inpts_dv_par copy_disable']"));
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
			Thread.sleep(3000);
			create = driver.findElement(By.xpath("(//button[@type=\"button\"])[11]"));
			create.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@data-value=\"vendor\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//button[@class=\"try__Bulk__upload__btn__sc d__flex__btn font16 font_weight_500 font_dark\"]"))
					.click(); // Upload Button //
			// Upload File //
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class=\"font_weight_600\"])[1]")).click();
			// Excel sheet upload //
			String file = "C:\\Users\\Kunal Chandrakant\\Downloads\\Testted Appplication\\Wegofin\\Wegofin AI\\Wegoai contact module\\Bulk_Upload_Vendor.xlsx";
			StringSelection selection = new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			Robot robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			// Submit Button //
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//button[@class=\"bulkUpload__popup__submit__btn__sc bulkUpload__popup__submit__btn__js__sc d__flex__btn font16 font_weight_500 font_white\"]"))
					.click();
			Thread.sleep(3000);
//			driver.findElement(By.xpath(
//					"//button[@class=\"bulkUpload__popup__submit__btn__sc bulkUpload__popup__submit__btn_contact__ba d__flex__btn font16 font_weight_500 font_white\"]"))
//					.click();

		}

	}

}
