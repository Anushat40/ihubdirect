package com.Directtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForgetPassword extends baseclass {
	@Test
	public void f() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/anushat/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		test = report.createTest("ChangePassword");
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
		driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//input[@name=\"userName\"]")).sendKeys("6309765343");

		driver.findElement(By.xpath("//div[@class=\"tab-content\"]//div[@ng-click=\"forgotPasword()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@id=\"forgotmodel\"]//div[@class=\"modal-content\"]//button[@type=\"submit\"]"))
				.click();
		Thread.sleep(2000);

	}

}
