package Wigofin_Employer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class Reimbursement {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://payroll.staging.wegofin.com/login");
		driver.manage().window().maximize();
		// Credentials to login //
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("kevinralph156@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		// Reimbursement //
		Thread.sleep(10000);
		WebElement button = driver.findElement(By.xpath("(//*[@class='MuiListItemText-root css-tjv3vm'])[6]"));
		button.click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 create_claim_text css-1x3fgiy\"]"))
				.click(); // Submit Claim //
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role=\"combobox\"]")).click();
		// Reimbursement Type //
		Random rand = new Random();
		Thread.sleep(3000);
		List<WebElement> options = driver
				.findElements(By.xpath("//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-r8u8y9\"]/li")); // Reimbursement
																														// //

		int randomIndex = rand.nextInt(options.size());
		Thread.sleep(3000);
		WebElement selectedOption = options.get(randomIndex);
		Thread.sleep(3000);
		selectedOption.click();
		// Expense Date //
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[8]")).click();
		Random rand1 = new Random();
		Faker faker = new Faker();
		String billNumber = "BILL-" + faker.number().digits(6);
		double amount = 7 + (8 - 2) * rand.nextDouble();
		DecimalFormat df = new DecimalFormat("#.00");
		String billAmount = df.format(amount);
		Thread.sleep(3000);
		List<WebElement> date = driver.findElements(By.xpath(
				"//*[@class=\"MuiPickersSlideTransition-root MuiDayCalendar-slideTransition css-1xuxf2l\"]/div/div/button"));
		Thread.sleep(3000);
		int index = rand1.nextInt(date.size());
		Thread.sleep(3000);
		WebElement selectOption = date.get(index);
		Thread.sleep(3000);
		selectOption.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys(billNumber); // Bill number //
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).sendKeys(billAmount); // Bill Amount //
		// Upload a File //
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"MuiBox-root css-17tbdxr\"]")).click();
		String filePath = "C:\\Users\\Kunal Chandrakant\\Downloads\\Test doc\\600-kb.jpg";
		Thread.sleep(3000);
		StringSelection selection = new StringSelection(filePath);
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
		// Submit For Approval //
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		// Loop //
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 add_another_bill_text css-1x3fgiy\"]"))
				.click();

		// System.out.println("Claim Submitted Successfully");

	}
}
