package com.Directtest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class direct extends baseclass{
  @Test
  public void f() throws InterruptedException {
	 
	  System.setProperty("webdriver.chrome.driver", "/home/anushat/Downloads/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		 test = report.createTest("direct");
		driver.get("http://183.82.123.14/iHubMultiStoresDirectDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"hidden-xs hidden-sm\"]//a[@ng-click=\"SignIn()\"]")).click();
		driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//input[@name=\"userName\"]")).sendKeys("9666262992");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.133");
		driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//button[@class=\"btn btn-prime btn-block\"]")).click();
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.linkText("Electronics And Home Appliances"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);

		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Televisions')]"))
				.click();
		Thread.sleep(2000);
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='Onida']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox1);
		Thread.sleep(2000);
		WebElement checkbox2 = driver
				.findElement(By.xpath("//div[@class='aside-filter']//input[@value=\"43 Inches\"]"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox2);
		Thread.sleep(2000);
//		WebElement checkbox3 = driver.findElement(By.xpath("//div[@class='filter-list'][4]//input[@value=\"2\"]"));
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", checkbox3);
//		Thread.sleep(2000);
//		WebElement checkbox4 = driver.findElement(By.xpath("//div[@class='filter-list'][5]//input[@value=\"2\"]"));
//		JavascriptExecutor js4 = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", checkbox4);
//		Thread.sleep(2000);
//		WebElement checkbox5 = driver
//				.findElement(By.xpath("//div[@class='filter-list'][6]//input[@value=\"FHD LED\"]"));
//		JavascriptExecutor js5 = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", checkbox5);
//		Thread.sleep(2000);
//		WebElement checkbox6 = driver.findElement(By.xpath("//div[@class='filter-list'][7]//input[@value=\"1 Year\"]"));
//		JavascriptExecutor js6 = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", checkbox6);
		Thread.sleep(2000);

		// Cart
		driver.findElement(By.xpath("//div[@class=\"media\"]//button[@class=\"btn buy-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
		Thread.sleep(2000);
		// Make payment
		WebElement link = driver.findElement(By.xpath("//button[@class=\"checkout-btn btn btn-prime btn-block\"]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", link);

		// Store address
		Thread.sleep(2000);
		WebElement link1 = driver.findElement(By.xpath("//input[@value=\"S\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", link1);
		driver.findElement(By.xpath("//div[@class=\"relative clearfix\"]//div[@class=\"address-details\"][1]")).click();

	
		// Billing information
		driver.findElement(By.xpath("//div[@class=\"address-details\"][1]//label[@class=\"label-wrapper\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"text-center\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billName\"]")).sendKeys("Anusha");
		driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billAddress\"]"))
				.sendKeys("Bansal Pride");
		driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billZip\"]")).sendKeys("500018");
		driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billCity\"]")).sendKeys("Madhapur");
		driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billState\"]")).sendKeys("Telangana");
		driver.findElement(
				By.xpath("//div[@id=\"billing_form\"]//select[@id=\"orderBillCountry\"]//option[@value=\"India\"]"))
				.click();
		driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billTel\"]")).sendKeys("6309765343");
		driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billEmail\"]"))
				.sendKeys("anusha.t@inativetech.com");
		driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"notesValue\"]")).sendKeys("Text");

		// Shipping address
		driver.findElement(By.xpath("//div[@id=\"check_address\"]//input[@name=\"differentShippingAddress\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipName\"]"))
				.sendKeys("Maha");
		driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipAddress\"]"))
				.sendKeys("Hitech city");
		driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipZip\"]"))
				.sendKeys("500018");
		driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipCity\"]"))
				.sendKeys("Madhapur");
		driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipState\"]"))
				.sendKeys("Telangana");
		driver.findElement(By.xpath(
				"//div[@class=\"span12 shipping-edit-form\"]//select[@name=\"shipCountry\"]//option[@value=\"India\"]"))
				.click();
		driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipTel\"]"))
				.sendKeys("8186814540");

		// All other Banks
		driver.findElement(By.xpath(
				"//div[@class=\"span12 all-other-banks\"]//select[@id=\"netBankingBank\"]//option[@ value=\"AvenuesTest\"]"))
				.click();

		// cc avenue checkbox
		// driver.findElement(By.xpath("//div[@id=\"savecard\"]//input[@name=\"saveCard\"]")).click();

		// make payment
		driver.findElement(By.xpath("//div[@id=\"buttons\"]//a[@id=\"SubmitBillShip\"]")).click();
		driver.findElement(By.xpath("//form[@method=\"post\"]//input[@value=\"Return To the Merchant Site\"]")).click();


  }
}
